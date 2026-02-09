package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.*;
import co.edu.unbosque.view.ViewFacade;

public class Controller implements ActionListener{


	private ViewFacade vf;
	private ModelFacade mf;

	public Controller() {
		vf = new ViewFacade();
		mf = new ModelFacade();
	}


	public void runGUI() {
		vf.getVenMenu().setVisible(false);
		vf.getSel().setVisible(false);
		vf.getComHelado().setVisible(false);
		vf.getVenCreacion().setVisible(true);

		asignarListeners();
	}

	public void asignarListeners() {
		// VENTANA CREACION
		vf.getVenCreacion().getListaOpciones().addActionListener(this);
		vf.getVenCreacion().getListaOpciones().setActionCommand("LISTA_OPCIONES_CREAR");

		vf.getVenCreacion().getListaOpcionesTieneHelado().addActionListener(this);
		vf.getVenCreacion().getListaOpcionesTieneHelado().setActionCommand("LISTA_OPCIONES_WAFLE");
		
		vf.getVenCreacion().getBtnCrear().addActionListener(this);
		vf.getVenCreacion().getBtnCrear().setActionCommand("BOTON_CREAR");
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "LISTA_OPCIONES_CREAR": {
			if (vf.getVenCreacion().getListaOpciones().getSelectedItem().equals("Seleccione...")) {
				vf.getVenCreacion().ocultarTodos();
			}
			else if (vf.getVenCreacion().getListaOpciones().getSelectedItem().equals("Helado")) {
				vf.getVenCreacion().ocultarTodos();
				vf.getVenCreacion().mostrarHelado();
			}
			else if (vf.getVenCreacion().getListaOpciones().getSelectedItem().equals("Crepe")) {
				vf.getVenCreacion().ocultarTodos();
				vf.getVenCreacion().mostrarCrepe();
			}
			else if (vf.getVenCreacion().getListaOpciones().getSelectedItem().equals("Wafle")) {
				vf.getVenCreacion().ocultarTodos();
				vf.getVenCreacion().mostrarWafle();
			}
			break;
		}
		case "LISTA_OPCIONES_WAFLE":{
			if (vf.getVenCreacion().getListaOpcionesTieneHelado().getSelectedItem().equals("Si")) {
				vf.getVenCreacion().getLblSaborHelado().setVisible(true);
				vf.getVenCreacion().getTxtSaborHelado().setVisible(true);
			}
			else if (vf.getVenCreacion().getListaOpcionesTieneHelado().getSelectedItem().equals("No")) {
				vf.getVenCreacion().getLblSaborHelado().setVisible(false);
				vf.getVenCreacion().getTxtSaborHelado().setVisible(false);
			}
			break;
		}
		case "BOTON_CREAR":{
			if (vf.getVenCreacion().getListaOpciones().getSelectedItem().equals("Helado")) {
				int precio = Integer.parseInt(vf.getVenCreacion().getTxtPrecio().getText());
				String sabor = vf.getVenCreacion().getTxtSabor().getText();
				int cantidadBola = Integer.parseInt(vf.getVenCreacion().getTxtCantidadBola().getText());
				boolean esCono = false;
				if (vf.getVenCreacion().getListaOpcionesCono().getSelectedItem().equals("Si")) {
					 esCono = true;
				}
				else if (vf.getVenCreacion().getListaOpcionesCono().getSelectedItem().equals("No")) {
					 esCono = false;
				}
				HeladoDTO temp = new HeladoDTO(precio, sabor, cantidadBola, esCono);
				mf.getHeladoDao().create(temp);
				
			}
			else if (vf.getVenCreacion().getListaOpciones().getSelectedItem().equals("Crepe")) {
				int precio = Integer.parseInt(vf.getVenCreacion().getTxtPrecio().getText());
				String sabor = vf.getVenCreacion().getTxtSabor().getText();
				
				boolean esVegano = false;
				if (vf.getVenCreacion().getListaOpcionesVegano().getSelectedItem().equals("Si")) {
					 esVegano = true;
				}
				else if (vf.getVenCreacion().getListaOpcionesVegano().getSelectedItem().equals("No")) {
					esVegano = false;
				}
				
				boolean esSalado = false;
				if (vf.getVenCreacion().getListaOpcionesSalado().getSelectedItem().equals("Si")) {
					esSalado = true;
				}
				else if (vf.getVenCreacion().getListaOpcionesSalado().getSelectedItem().equals("No")) {
					esSalado = false;
				}
				
				CrepeDTO temp = new CrepeDTO(precio, sabor, esVegano, esSalado);
				mf.getCrepeDao().create(temp);	
				
			}
			else if (vf.getVenCreacion().getListaOpciones().getSelectedItem().equals("Wafle")) {
				int precio = Integer.parseInt(vf.getVenCreacion().getTxtPrecio().getText());
				String sabor = vf.getVenCreacion().getTxtSabor().getText();
				
				boolean tieneHelado = false;
				if (vf.getVenCreacion().getListaOpcionesTieneHelado().getSelectedItem().equals("Si")) {
					tieneHelado = true;
				}
				else if (vf.getVenCreacion().getListaOpcionesTieneHelado().getSelectedItem().equals("No")) {
					tieneHelado = false;
				}
				
				String saborHelado = "";
				if (tieneHelado == true) {
					saborHelado = vf.getVenCreacion().getTxtSaborHelado().getText();
				}
				else{
					saborHelado = "N.A.";
				}
				
				WaffleDTO temp = new WaffleDTO(precio, sabor, tieneHelado, saborHelado);
				mf.getWaffleDao().create(temp);
				
			}
			
			break;
		}
		
		
		}

	}

}
