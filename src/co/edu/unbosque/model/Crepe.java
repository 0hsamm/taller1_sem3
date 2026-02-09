package co.edu.unbosque.model;

import java.io.Serializable;

public class Crepe extends Producto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean esVegano;
	
	public Crepe() {
		// TODO Auto-generated constructor stub
	}

	public Crepe(boolean esVegano, boolean esSalado) {
		super();
		this.esVegano = esVegano;
	}

	public Crepe(String nombre, int precio, String sabor, String ingredientes, boolean esVegano) {
		super(nombre, precio, sabor, ingredientes);
		this.esVegano = esVegano;

	}

	public Crepe(String nombre, int precio, String sabor, String ingredientes) {
		super(nombre, precio, sabor, ingredientes);
		// TODO Auto-generated constructor stub
	}

	public boolean isEsVegano() {
		return esVegano;
	}

	public void setEsVegano(boolean esVegano) {
		this.esVegano = esVegano;
	}

	@Override
	public String toString() {
		return super.toString() + "Crepe: \nEs Vegano?: " + esVegano;
	}
	
	
}
