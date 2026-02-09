package co.edu.unbosque.model.persistence;

public interface DAO <E, D>{
	
	public void create(D newData);
	public boolean delete(int index);
	public boolean update(int index, D newData);
	public String showAll();
	public int count();
	public boolean isEmpty();
	public void  leerDesdeArchivoDeTexto(String url);
	public void escribirEnArchivoDeTexto();
	public void cargarDesdeArchivoSerializado();
	public void escribirEnArchivoSerializado();
	public void ordenarSelectionSort();

}
