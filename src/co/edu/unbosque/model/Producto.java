package co.edu.unbosque.model;

import java.io.Serializable;

public class Producto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int precio;
	private String sabor;
	private String ingredientes;
	
	public Producto()  {
		// TODO Auto-generated constructor stub
	}

	public Producto(String nombre, int precio, String sabor, String ingredientes) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.sabor = sabor;
		this.ingredientes = ingredientes;
	}
	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Producto: \nnombre: " + nombre + ", precio: " + precio + ", sabor: " + sabor + ", ingredientes: "
				+ ingredientes;
	}
	
}
