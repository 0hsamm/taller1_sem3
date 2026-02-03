package co.edu.unbosque.model;

public class Producto {
	private int precio;
	private String sabor;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(int precio, String sabor) {
		super();
		this.precio = precio;
		this.sabor = sabor;
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

	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", sabor=" + sabor + "]";
	}

	
	
}
