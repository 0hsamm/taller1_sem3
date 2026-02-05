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

	    boolean invalido = false;

	    if (listaCrepes == null || listaCrepes.isEmpty()) {
	        invalido = true;
	    } else {
	        for (int i = 0; i < listaCrepes.size(); i++) {
	            Crepe c = listaCrepes.get(i);
	            if (c == null || c.getSabor() == null) {
	                invalido = true;
	                break;
	            }
	        }
	    }

	    if (invalido) {
	        listaCrepes = new ArrayList<>();
	        leerDesdeArchivoDeTexto(FILE_NAME);
	        escribirEnArchivoSerializado();
	    }
	}



	
	@Override
	public void create(CrepeDTO newData) {
		Crepe temp = DataMapper.convertirCrepeDTOACrepe(newData);
		listaCrepes.add(temp);
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
	        if (columnas.length < 4) continue;

	        Crepe temp = new Crepe();
	        temp.setPrecio(Integer.parseInt(columnas[0].trim()));
	        temp.setSabor(columnas[1].trim());
	        temp.setEsVegano(Boolean.parseBoolean(columnas[2].trim()));
	        temp.setEsSalado(Boolean.parseBoolean(columnas[3].trim()));

	        listaCrepes.add(temp);
	    }
	}


	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (Crepe crepe : listaCrepes) {
			sb.append(crepe.getPrecio()).append(';');
			sb.append(crepe.getSabor()).append(';');
			sb.append(crepe.isEsVegano()).append(';');
			sb.append(crepe.isEsSalado()).append('\n');

		}
		
		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}

	@Override
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaCrepes = (ArrayList<Crepe>) contenido;
		} else {
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

	public ArrayList<Crepe> getListaCrepes() {
		return listaCrepes;
	}

	public void setListaCrepes(ArrayList<Crepe> listaCrepes) {
		this.listaCrepes = listaCrepes;
	}

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public String getSERIAL_FILE_NAME() {
		return SERIAL_FILE_NAME;
	}

	

}
