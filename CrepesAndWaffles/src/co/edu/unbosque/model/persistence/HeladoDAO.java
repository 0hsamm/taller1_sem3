package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Helado;
import co.edu.unbosque.model.HeladoDTO;

public class HeladoDAO implements DAO<Helado, HeladoDTO> {

	private ArrayList<Helado> listaHelados;
	private final String FILE_NAME = "Helado.csv";
	private final String SERIAL_FILE_NAME = "Helado.bin";

	public HeladoDAO() {
		listaHelados = new ArrayList<>();
		cargarDesdeArchivoSerializado();

		boolean invalido = false;

		if (listaHelados == null || listaHelados.isEmpty()) {
			invalido = true;
		} else {
			for (int i = 0; i < listaHelados.size(); i++) {
				Helado h = listaHelados.get(i);
				if (h == null || h.getSabor() == null) {
					invalido = true;
					break;
				}
			}
		}

		if (invalido) {
			listaHelados = new ArrayList<>();
			leerDesdeArchivoDeTexto(FILE_NAME);
			escribirEnArchivoSerializado();
		}
	}

	@Override
	public void create(HeladoDTO newData) {
		Helado temp = DataMapper.convertirHeladoDTOAHelado(newData);
		listaHelados.add(temp);
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaHelados.size()) {
			return false;
		} else {
			listaHelados.remove(index);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean update(int index, HeladoDTO newData) {
		if (index < 0 || index >= listaHelados.size()) {
			return false;
		} else {
			listaHelados.set(index, DataMapper.convertirHeladoDTOAHelado(newData));
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public String showAll() {
		if (listaHelados.isEmpty()) {
			return "No hay helados";
		}
		String content = "";
		int i = 1;
		for (Helado helado : listaHelados) {
			content += "\n Helado " + i + ". " + helado.toString();
			i++;
		}
		return content + "\n";
	}

	@Override
	public int count() {
		return listaHelados.size();
	}

	@Override
	public boolean isEmpty() {
		return listaHelados.isEmpty();
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

			Helado temp = new Helado();
			temp.setPrecio(Integer.parseInt(columnas[0].trim()));
			temp.setSabor(columnas[1].trim());
			temp.setCantidadBola(Integer.parseInt(columnas[2].trim()));
			temp.setEsCono(Boolean.parseBoolean(columnas[3].trim()));

			listaHelados.add(temp);
		}
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (Helado helado : listaHelados) {
			String sabor = helado.getSabor() == null ? "" : helado.getSabor();
			sb.append(helado.getPrecio()).append(';');
			sb.append(sabor).append(';');
			sb.append(helado.getCantidadBola()).append(';');
			sb.append(helado.isEsCono()).append('\n');
		}
		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}

	@Override
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaHelados = (ArrayList<Helado>) contenido;
		} else {
			listaHelados = new ArrayList<>();
		}
	}

	@Override
	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaHelados);
	}

	@Override
	public void ordenarSelectionSort() {
		int n = listaHelados.size();
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (listaHelados.get(j).getPrecio() < listaHelados.get(minIndex).getPrecio()) {
					minIndex = j;
				}
			}
			Helado temp = listaHelados.get(i);
			listaHelados.set(i, listaHelados.get(minIndex));
			listaHelados.set(minIndex, temp);
		}
	}

	public ArrayList<Helado> getListaHelados() {
		return listaHelados;
	}

	public void setListaHelados(ArrayList<Helado> listaHelados) {
		this.listaHelados = listaHelados;
	}

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public String getSERIAL_FILE_NAME() {
		return SERIAL_FILE_NAME;
	}
}
