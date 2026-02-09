package co.edu.unbosque.model;

import java.io.Serializable;

public class HeladoDTO extends Producto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cantidadBola;
	private boolean esCono;
	
	public HeladoDTO() {
		// TODO Auto-generated constructor stub
	}

	public HeladoDTO(int cantidadBola, boolean esCono) {
		super();
		this.cantidadBola = cantidadBola;
		this.esCono = esCono;
	}

	public HeladoDTO(String nombre, int precio, String sabor, String ingredientes, int cantidadBola, boolean esCono) {
		super(nombre, precio, sabor, ingredientes);
		this.cantidadBola = cantidadBola;
		this.esCono = esCono;
	}

	public HeladoDTO(String nombre, int precio, String sabor, String ingredientes) {
		super(nombre, precio, sabor, ingredientes);
		// TODO Auto-generated constructor stub
	}

	public int getCantidadBola() {
		return cantidadBola;
	}

	public void setCantidadBola(int cantidadBola) {
		this.cantidadBola = cantidadBola;
	}

	public boolean isEsCono() {
		return esCono;
	}

	public void setEsCono(boolean esCono) {
		this.esCono = esCono;
	}

	@Override
	public String toString() {
		return super.toString() + "Helado: /nNumero de Bolas: " + cantidadBola + ", En Cono?: " + esCono;
	}
	
	
	
}
