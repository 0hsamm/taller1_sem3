package co.edu.unbosque.model;

import java.io.Serializable;

public class Crepe extends Producto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean esVegano;
	private boolean esSalado;
	
	public Crepe() {
		// TODO Auto-generated constructor stub
	}

	public Crepe(boolean esVegano, boolean esSalado) {
		super();
		this.esVegano = esVegano;
		this.esSalado = esSalado;
	}

	public Crepe(int precio, String sabor, boolean esVegano, boolean esSalado) {
		super(precio, sabor);
		this.esVegano = esVegano;
		this.esSalado = esSalado;
	}

	public Crepe(int precio, String sabor) {
		super(precio, sabor);
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
		return super.toString() + "Crepe [esVegano=" + esVegano + ", esSalado=" + esSalado + "]";
	}
	
	
}
