package co.edu.unbosque.model;

import java.io.Serializable;

public class WaffleDTO extends Producto implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean tieneHelado;
	private String saborHelado;
	
	public WaffleDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public WaffleDTO(boolean tieneHelado, String saborHelado) {
		super();
		this.tieneHelado = tieneHelado;
		this.saborHelado = saborHelado;
	}

	public WaffleDTO(String nombre, int precio, String sabor, String ingredientes, boolean tieneHelado,
			String saborHelado) {
		super(nombre, precio, sabor, ingredientes);
		this.tieneHelado = tieneHelado;
		this.saborHelado = saborHelado;
	}

	public WaffleDTO(String nombre, int precio, String sabor, String ingredientes) {
		super(nombre, precio, sabor, ingredientes);
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
		return super.toString() + "Tiene Helado?: " + tieneHelado + 
				"Sabor del helado: " + saborHelado;
	}
	
	
	
	

}
