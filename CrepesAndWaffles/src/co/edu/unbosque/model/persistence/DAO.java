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
	public String generarReporteDiaActual();
	public void ordenarSelectionSort();
	public void ordenarQuickSort(int low, int high);
	public void ordenarBubbleSort();
	public void ordenarInsertionSort();
	public int partition(int low, int high);
	public void swap(int i, int j);
	public void ordenarMerge(int l, int m, int r);
	public void ordenarMergeSort(int l, int r);
}
