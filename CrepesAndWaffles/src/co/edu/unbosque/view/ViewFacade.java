package co.edu.unbosque.view;

public class ViewFacade {

	private MenuPrincipal venMenu;
	private Seleccion sel;
	private CompraHelado comHelado;
	private VentanaCreacionProductos venCreacion;
	
	public ViewFacade() {
		venMenu = new MenuPrincipal();
		sel = new Seleccion();
		comHelado = new CompraHelado();
		venCreacion = new VentanaCreacionProductos();
	}

	public MenuPrincipal getVenMenu() {
		return venMenu;
	}

	public void setVenMenu(MenuPrincipal venMenu) {
		this.venMenu = venMenu;
	}

	public Seleccion getSel() {
		return sel;
	}

	public void setSel(Seleccion sel) {
		this.sel = sel;
	}

	public CompraHelado getComHelado() {
		return comHelado;
	}

	public void setComHelado(CompraHelado comHelado) {
		this.comHelado = comHelado;
	}

	public VentanaCreacionProductos getVenCreacion() {
		return venCreacion;
	}

	public void setVenCreacion(VentanaCreacionProductos venCreacion) {
		this.venCreacion = venCreacion;
	}
	
	
	
}
