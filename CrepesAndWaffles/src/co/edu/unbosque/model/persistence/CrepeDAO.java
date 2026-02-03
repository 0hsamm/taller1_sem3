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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cargarDesdeArchivoSerializado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void escribirEnArchivoSerializado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String generarReporteDiaActual() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ordenarSelectionSort() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenarQuickSort(int low, int high) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenarBubbleSort() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenarInsertionSort() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int partition(int low, int high) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void swap(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenarMerge(int l, int m, int r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenarMergeSort(int l, int r) {
		// TODO Auto-generated method stub
		
	}

}
