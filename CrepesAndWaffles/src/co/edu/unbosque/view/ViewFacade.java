package co.edu.unbosque.view;

public class ViewFacade {

	private MenuPrincipal venMenu;
	private Seleccion sel;
	
	public ViewFacade() {
		venMenu = new MenuPrincipal();
		sel = new Seleccion();
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
	
	
	
}
