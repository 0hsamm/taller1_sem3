package co.edu.unbosque.view;

public class ViewFacade {

	private MenuPrincipal venMenu;
	
	public ViewFacade() {
		venMenu = new MenuPrincipal();
	}

	public MenuPrincipal getVenMenu() {
		return venMenu;
	}

	public void setVenMenu(MenuPrincipal venMenu) {
		this.venMenu = venMenu;
	}
	
	
	
}
