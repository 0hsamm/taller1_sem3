package co.edu.unbosque.model;

public class HeladoDTO extends Producto{
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

	public HeladoDTO(int precio, String sabor, int cantidadBola, boolean esCono) {
		super(precio, sabor);
		this.cantidadBola = cantidadBola;
		this.esCono = esCono;
	}

	public HeladoDTO(int precio, String sabor) {
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
