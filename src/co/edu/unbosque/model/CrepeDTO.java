package co.edu.unbosque.model;

import java.io.Serializable;

public class CrepeDTO extends Producto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean esVegano;
	private boolean esSalado;
	
	public CrepeDTO() {
		// TODO Auto-generated constructor stub
	}

	public CrepeDTO(boolean esVegano, boolean esSalado) {
		super();
		this.esVegano = esVegano;
		this.esSalado = esSalado;
	}

	public CrepeDTO(String nombre, int precio, String sabor, String ingredientes, boolean esVegano, boolean esSalado) {
		super(nombre, precio, sabor, ingredientes);
		this.esVegano = esVegano;
		this.esSalado = esSalado;
	}

	public CrepeDTO(String nombre, int precio, String sabor, String ingredientes) {
		super(nombre, precio, sabor, ingredientes);
		// TODO Auto-generated constructor stub
	}

	public boolean isEsVegano() {
		return esVegano;
	}

	public void setEsVegano(boolean esVegano) {
		this.esVegano = esVegano;
	}

	public boolean isEsSalado() {
		return esSalado;
	}

	public void setEsSalado(boolean esSalado) {
		this.esSalado = esSalado;
	}

	@Override
	public String toString() {
		return super.toString() + "Crepe: /nEs Vegano?: " + esVegano + ", Es Salado?: " + esSalado;
	}
	
	
}
