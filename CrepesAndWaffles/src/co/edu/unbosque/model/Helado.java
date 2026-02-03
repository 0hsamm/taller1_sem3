package co.edu.unbosque.model;

public class Helado extends Producto{
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
