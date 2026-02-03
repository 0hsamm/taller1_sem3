package co.edu.unbosque.model;

public class CrepeDTO extends Producto{
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

	public CrepeDTO(int precio, String sabor, boolean esVegano, boolean esSalado) {
		super(precio, sabor);
		this.esVegano = esVegano;
		this.esSalado = esSalado;
	}

	public CrepeDTO(int precio, String sabor) {
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
