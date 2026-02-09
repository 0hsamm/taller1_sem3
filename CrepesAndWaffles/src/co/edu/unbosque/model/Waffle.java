package co.edu.unbosque.model;

import java.io.Serializable;

public class Waffle extends Producto implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean tieneHelado;
	private String saborHelado;
	
	
	public Waffle() {
		
	}


	


	public Waffle(boolean tieneHelado, String saborHelado) {
		super();
		this.tieneHelado = tieneHelado;
		this.saborHelado = saborHelado;
	}





	public Waffle(int precio, String sabor, boolean tieneHelado, String saborHelado) {
		super(precio, sabor);
		this.tieneHelado = tieneHelado;
		this.saborHelado = saborHelado;
	}





	public Waffle(int precio, String sabor) {
		super(precio, sabor);
		// TODO Auto-generated constructor stub
	}





	public boolean isTieneHelado() {
		return tieneHelado;
	}





	public void setTieneHelado(boolean tieneHelado) {
		this.tieneHelado = tieneHelado;
	}





	public String getSaborHelado() {
		return saborHelado;
	}





	public void setSaborHelado(String saborHelado) {
		this.saborHelado = saborHelado;
	}





	@Override
	public String toString() {
		return super.toString() + "TieneHelado?: " + tieneHelado + 
				"Sabor del helado: " + saborHelado;
	}
	
	
	
	

}
