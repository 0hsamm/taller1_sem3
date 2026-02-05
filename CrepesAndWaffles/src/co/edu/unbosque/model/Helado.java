package co.edu.unbosque.model;

import java.io.Serializable;

public class Helado extends Producto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cantidadBola;
	private boolean esCono;
	
	public Helado() {
		// TODO Auto-generated constructor stub
	}

	public Helado(int cantidadBola, boolean esCono) {
		super();
		this.cantidadBola = cantidadBola;
		this.esCono = esCono;
	}

	public Helado(int precio, String sabor, int cantidadBola, boolean esCono) {
		super(precio, sabor);
		this.cantidadBola = cantidadBola;
		this.esCono = esCono;
	}

	public Helado(int precio, String sabor) {
		super(precio, sabor);
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
		return super.toString() + "Helado [cantidadBola=" + cantidadBola + ", esCono=" + esCono + "]";
	}
	
	
	
}
