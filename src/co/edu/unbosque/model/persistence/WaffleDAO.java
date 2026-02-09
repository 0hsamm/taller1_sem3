package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Waffle;
import co.edu.unbosque.model.WaffleDTO;

public class WaffleDAO implements DAO<Waffle, WaffleDTO> {

	private ArrayList<Waffle> listaWaffles;
	private final String FILE_NAME = "Waffle.csv";
	private final String SERIAL_FILE_NAME = "Waffle.bin";

	public WaffleDAO() {
		listaWaffles = new ArrayList<>();
		cargarDesdeArchivoSerializado();

		boolean invalido = false;

		if (listaWaffles == null || listaWaffles.isEmpty()) {
			invalido = true;
		} else {
			for (int i = 0; i < listaWaffles.size(); i++) {
				Waffle w = listaWaffles.get(i);
				if (w == null || w.getSabor() == null || w.getSaborHelado() == null) {
					invalido = true;
					break;
				}
			}
		}

		if (invalido) {
			listaWaffles = new ArrayList<>();
			leerDesdeArchivoDeTexto(FILE_NAME);
			escribirEnArchivoSerializado();
		}
	}

	@Override
	public void create(WaffleDTO newData) {
		Waffle temp = DataMapper.convertirWaffleDTOAWaffle(newData);
		listaWaffles.add(temp);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaWaffles.size()) {
			return false;
		} else {
			listaWaffles.remove(index);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean update(int index, WaffleDTO newData) {
		if (index < 0 || index >= listaWaffles.size()) {
			return false;
		} else {
			listaWaffles.set(index, DataMapper.convertirWaffleDTOAWaffle(newData));
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public String showAll() {
		if (listaWaffles.isEmpty()) {
			return "No hay waffles";
		}
		String content = "";
		int i = 1;
		for (Waffle waffle : listaWaffles) {
			content += "\n Waffle " + i + ". " + waffle.toString();
			i++;
		}
		return content + "\n";
	}

	@Override
	public int count() {
		return listaWaffles.size();
	}

	@Override
	public boolean isEmpty() {
		return listaWaffles.isEmpty();
	}

	@Override
	public void leerDesdeArchivoDeTexto(String url) {
		String contenido = FileHandler.leerDesdeArchivoDeTexto(url);
		if (contenido == null || contenido.isBlank()) {
			return;
		}

		String[] filas = contenido.split("\n");
		for (String fila : filas) {
			if (fila.isBlank()) {
				continue;
			}

			String[] columnas = fila.split(";", -1);
			if (columnas.length < 4) {
				continue;
			}

			Waffle temp = new Waffle();
			temp.setPrecio(Integer.parseInt(columnas[0].trim()));
			temp.setSabor(columnas[1].trim());
			temp.setTieneHelado(Boolean.parseBoolean(columnas[2].trim()));
			temp.setSaborHelado(columnas[3].trim());

			listaWaffles.add(temp);
		}
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (Waffle waffle : listaWaffles) {
			String sabor = waffle.getSabor() == null ? "" : waffle.getSabor();
			String saborHelado = waffle.getSaborHelado() == null ? "" : waffle.getSaborHelado();

			sb.append(waffle.getPrecio()).append(';');
			sb.append(sabor).append(';');
			sb.append(waffle.isTieneHelado()).append(';');
			sb.append(saborHelado).append('\n');
		}

		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}

	@Override
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaWaffles = (ArrayList<Waffle>) contenido;
		} else {
			listaWaffles = new ArrayList<>();
		}
	}

	@Override
	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaWaffles);
	}

	@Override
	public void ordenarSelectionSort() {
		int n = listaWaffles.size();
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (listaWaffles.get(j).getPrecio() < listaWaffles.get(minIndex).getPrecio()) {
					minIndex = j;
				}
			}
			Waffle temp = listaWaffles.get(i);
			listaWaffles.set(i, listaWaffles.get(minIndex));
			listaWaffles.set(minIndex, temp);
		}
	}

	public ArrayList<Waffle> getListaWaffles() {
		return listaWaffles;
	}

	public void setListaWaffles(ArrayList<Waffle> listaWaffles) {
		this.listaWaffles = listaWaffles;
	}

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public String getSERIAL_FILE_NAME() {
		return SERIAL_FILE_NAME;
	}
}
