package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Crepe;
import co.edu.unbosque.model.CrepeDTO;

public class CrepeDAO implements DAO<Crepe, CrepeDTO>{
	private ArrayList<Crepe> listaCrepes;
	private final String FILE_NAME = "Crepe.csv";
	private final String SERIAL_FILE_NAME = "Crepe.bin";
	
	public CrepeDAO() {
		listaCrepes = new ArrayList<>();
		cargarDesdeArchivoSerializado();
	}
	
	@Override
	public void create(CrepeDTO newData) {
		listaCrepes.add(DataMapper.convertirCrepeDTOACrepe(newData));
		escribirEnArchivoDeTexto();
		escribirEnArchivoSerializado();
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >=  listaCrepes.size()) {
			return false;
		}
		else {
			listaCrepes.remove(index);
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public boolean update(int index, CrepeDTO newData) {
		if (index < 0 || index >=  listaCrepes.size()) {
			return false;
		}
		else {
			listaCrepes.set(index, DataMapper.convertirCrepeDTOACrepe(newData));
			escribirEnArchivoDeTexto();
			escribirEnArchivoSerializado();
			return true;
		}
	}

	@Override
	public String showAll() {
		if (listaCrepes.isEmpty()) {
			return "No hay crepes";
		}
		String content = "";
		int i = 1;
		for (Crepe crepe : listaCrepes) {
			content += "\n Crepe " + i + ". " + crepe.toString();
			i++;
		}
		return content + "\n";
	}

	@Override
	public int count() {
		return listaCrepes.size();
	}

	@Override
	public boolean isEmpty() {
		return listaCrepes.isEmpty();
	}

	@Override
	public void leerDesdeArchivoDeTexto(String url) {
		String contenido;
		contenido = FileHandler.leerDesdeArchivoDeTexto(url);
		if (contenido == "" || contenido.isBlank()) {
			return;
		}
		else {
			String [] filas = contenido.split("\n");
			for (int i = 0; i < filas.length; i++) {
				String [] columnas = filas[i].split(";");
				Crepe temp = new Crepe();
				temp.setPrecio(Integer.parseInt(columnas[0]));
				temp.setSabor(columnas[1]);
				temp.setEsVegano(Boolean.parseBoolean(columnas[2]));
				temp.setEsSalado(Boolean.parseBoolean(columnas[3]));
				
				listaCrepes.add(temp);
			}
		}
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (Crepe crepe : listaCrepes) {
			sb.append(crepe.getPrecio() + ";");
			sb.append(crepe.getSabor() + ";");
			sb.append(crepe.isEsVegano() + ";");
			sb.append(crepe.isEsSalado() + "\n");
		}
		
		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}

	@Override
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaCrepes = (ArrayList<Crepe>) contenido;
		}
		else {
			listaCrepes = new ArrayList<>();
		}
		
	}

	@Override
	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaCrepes);
		
	}

	@Override
	public void ordenarSelectionSort() {
		int n = listaCrepes.size();
		for (int i = 0; i < n -1 ; i++) {
			int minIndex = i;
			for (int j = i+1; j < n; j++) {
				if (listaCrepes.get(j).getPrecio() < listaCrepes.get(minIndex).getPrecio()){
					minIndex = j;
				}
			}
			Crepe temp = listaCrepes.get(i);
			listaCrepes.set(i, listaCrepes.get(minIndex));
			listaCrepes.set(minIndex, temp);
		}
		
	}



}
