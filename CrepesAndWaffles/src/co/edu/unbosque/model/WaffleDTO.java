package co.edu.unbosque.model;

public class WaffleDTO extends Producto{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean tieneHelado;
	private String saborHelado;
	
	
	public WaffleDTO() {
		
	}


	


	public WaffleDTO(boolean tieneHelado, String saborHelado) {
		super();
		this.tieneHelado = tieneHelado;
		this.saborHelado = saborHelado;
	}





	public WaffleDTO(int precio, String sabor, boolean tieneHelado, String saborHelado) {
		super(precio, sabor);
		this.tieneHelado = tieneHelado;
		this.saborHelado = saborHelado;
	}





	public WaffleDTO(int precio, String sabor) {
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
