package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaCreacionProductos extends JFrame{
	
	private JLabel lblOpcion;
	private JComboBox<String> listaOpciones;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JLabel lblSabor;
	private JTextField txtSabor;
	
	private JLabel lblCantidadBola;
	private JTextField txtCantidadBola;	
	private JLabel lblCono;
	private JComboBox<String> listaOpcionesCono;
	
	private JLabel lblVegano;
	private JComboBox<String> listaOpcionesVegano;
	private JLabel lblSalado;
	private JComboBox<String> listaOpcionesSalado;
	
	private JLabel lblTieneHelado;
	private JComboBox<String> listaOpcionesTieneHelado;
	private JLabel lblSaborHelado;
	private JTextField txtSaborHelado;	
	
	private JButton btnCrear;
	
	public VentanaCreacionProductos() {
		inicializarComponentes();
		ocultarTodos();
	}
	
	public void inicializarComponentes() {
		this.setTitle("Añadir producto");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(600, 600));
		this.pack();
		this.setLocationRelativeTo(null);
		
		lblOpcion = new JLabel("Seleccione la opcion a añadir");
		lblOpcion.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));	
		lblOpcion.setBounds(70, 25, 500, 70);
		this.add(lblOpcion);
		
		listaOpciones = new JComboBox<String>();
		listaOpciones.addItem("Seleccione...");
		listaOpciones.addItem("Helado");
		listaOpciones.addItem("Crepe");
		listaOpciones.addItem("Wafle");
		listaOpciones.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));	
		listaOpciones.setBounds(70, 100, 200, 25);
		this.add(listaOpciones);
		
		
		//Todos los productos tienen estas
		lblPrecio = new JLabel("Ingrese el precio del producto: ");
		lblPrecio.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));	
		lblPrecio.setBounds(70, 150, 500, 30);
		this.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));	
		txtPrecio.setBounds(70, 190, 300, 30);
		this.add(txtPrecio);
		
		
		lblSabor = new JLabel("Ingrese el sabor del producto: ");
		lblSabor.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));	
		lblSabor.setBounds(70, 230, 500, 30);
		this.add(lblSabor);
		
		txtSabor = new JTextField();
		txtSabor.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));	
		txtSabor.setBounds(70, 270, 300, 30);
		this.add(txtSabor);
		
		
		//Helado
		lblCantidadBola = new JLabel("Ingrese la cantidad de bolas del producto: ");
		lblCantidadBola.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));	
		lblCantidadBola.setBounds(70, 310, 500, 30);
		this.add(lblCantidadBola);
		
		txtCantidadBola = new JTextField();
		txtCantidadBola.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));	
		txtCantidadBola.setBounds(70, 350, 300, 30);
		this.add(txtCantidadBola);
		
		
		lblCono = new JLabel("Seleccione si el producto se consume en cono: ");
		lblCono.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));	
		lblCono.setBounds(70, 390, 500, 30);
		this.add(lblCono);
		
		listaOpcionesCono = new JComboBox<>();
		listaOpcionesCono.addItem("Seleccione...");
		listaOpcionesCono.addItem("Si");
		listaOpcionesCono.addItem("No");
		listaOpcionesCono.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));	
		listaOpcionesCono.setBounds(70, 430, 200, 25);
		this.add(listaOpcionesCono);
		
		
		//Crepe
		lblVegano = new JLabel("Seleccione si el producto es vegano: ");
		lblVegano.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));	
		lblVegano.setBounds(70, 310, 500, 30);
		this.add(lblVegano);
		
		listaOpcionesVegano = new JComboBox<>();
		listaOpcionesVegano.addItem("Seleccione...");
		listaOpcionesVegano.addItem("Si");
		listaOpcionesVegano.addItem("No");
		listaOpcionesVegano.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));	
		listaOpcionesVegano.setBounds(70, 350, 200, 25);
		this.add(listaOpcionesVegano);
		
		
		lblSalado = new JLabel("Seleccione si el producto es salado: ");
		lblSalado.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));	
		lblSalado.setBounds(70, 390, 500, 30);
		this.add(lblSalado);
		
		listaOpcionesSalado = new JComboBox<>();
		listaOpcionesSalado.addItem("Seleccione...");
		listaOpcionesSalado.addItem("Si");
		listaOpcionesSalado.addItem("No");
		listaOpcionesSalado.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));	
		listaOpcionesSalado.setBounds(70, 430, 200, 25);
		this.add(listaOpcionesSalado);
		
		//Wafle
		lblTieneHelado = new JLabel("Seleccione si el producto lleva helado: ");
		lblTieneHelado.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));	
		lblTieneHelado.setBounds(70, 310, 500, 30);
		this.add(lblTieneHelado);
		
		listaOpcionesTieneHelado = new JComboBox<>();
		listaOpcionesTieneHelado.addItem("Seleccione...");
		listaOpcionesTieneHelado.addItem("Si");
		listaOpcionesTieneHelado.addItem("No");
		listaOpcionesTieneHelado.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));	
		listaOpcionesTieneHelado.setBounds(70, 350, 200, 25);
		this.add(listaOpcionesTieneHelado);
		
		lblSaborHelado = new JLabel("Ingrese el sabor de helado del producto: ");
		lblSaborHelado.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));	
		lblSaborHelado.setBounds(70, 390, 500, 30);
		this.add(lblSaborHelado);
		
		txtSaborHelado = new JTextField();
		txtSaborHelado.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));	
		txtSaborHelado.setBounds(70, 430, 300, 30);
		this.add(txtSaborHelado);
		
		btnCrear = new JButton("Añadir producto");
		btnCrear.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnCrear.setBounds(150, 500, 300, 30);
		this.add(btnCrear);
		
	}
	
	public void ocultarTodos() {
		lblPrecio.setVisible(false);
		txtPrecio.setVisible(false);
		lblSabor.setVisible(false);
		txtSabor.setVisible(false);
		lblCantidadBola.setVisible(false);
		txtCantidadBola.setVisible(false);
		lblCono.setVisible(false);
		listaOpcionesCono.setVisible(false);
		lblVegano.setVisible(false);
		listaOpcionesVegano.setVisible(false);
		lblSalado.setVisible(false);
		listaOpcionesSalado.setVisible(false);
		lblTieneHelado.setVisible(false);
		listaOpcionesTieneHelado.setVisible(false);
		lblSaborHelado.setVisible(false);
		txtSaborHelado.setVisible(false);
	}

	public void mostrarHelado() {
		lblPrecio.setVisible(true);
		txtPrecio.setVisible(true);
		lblSabor.setVisible(true);
		txtSabor.setVisible(true);
		lblCantidadBola.setVisible(true);
		txtCantidadBola.setVisible(true);
		lblCono.setVisible(true);
		listaOpcionesCono.setVisible(true);
	}
	
	public void mostrarCrepe() {
		lblPrecio.setVisible(true);
		txtPrecio.setVisible(true);
		lblSabor.setVisible(true);
		txtSabor.setVisible(true);
		lblVegano.setVisible(true);
		listaOpcionesVegano.setVisible(true);
		lblSalado.setVisible(true);
		listaOpcionesSalado.setVisible(true);
		
	}
	
	public void mostrarWafle() {
		lblPrecio.setVisible(true);
		txtPrecio.setVisible(true);
		lblSabor.setVisible(true);
		txtSabor.setVisible(true);
		lblTieneHelado.setVisible(true);
		listaOpcionesTieneHelado.setVisible(true);
		
	}
	
	public JLabel getLblOpcion() {
		return lblOpcion;
	}

	public void setLblOpcion(JLabel lblOpcion) {
		this.lblOpcion = lblOpcion;
	}

	public JComboBox<String> getListaOpciones() {
		return listaOpciones;
	}

	public void setListaOpciones(JComboBox<String> listaOpciones) {
		this.listaOpciones = listaOpciones;
	}

	public JLabel getLblPrecio() {
		return lblPrecio;
	}

	public void setLblPrecio(JLabel lblPrecio) {
		this.lblPrecio = lblPrecio;
	}

	public JTextField getTxtPrecio() {
		return txtPrecio;
	}

	public void setTxtPrecio(JTextField txtPrecio) {
		this.txtPrecio = txtPrecio;
	}

	public JLabel getLblSabor() {
		return lblSabor;
	}

	public void setLblSabor(JLabel lblSabor) {
		this.lblSabor = lblSabor;
	}

	public JTextField getTxtSabor() {
		return txtSabor;
	}

	public void setTxtSabor(JTextField txtSabor) {
		this.txtSabor = txtSabor;
	}

	public JLabel getLblCantidadBola() {
		return lblCantidadBola;
	}

	public void setLblCantidadBola(JLabel lblCantidadBola) {
		this.lblCantidadBola = lblCantidadBola;
	}

	public JTextField getTxtCantidadBola() {
		return txtCantidadBola;
	}

	public void setTxtCantidadBola(JTextField txtCantidadBola) {
		this.txtCantidadBola = txtCantidadBola;
	}

	public JLabel getLblCono() {
		return lblCono;
	}

	public void setLblCono(JLabel lblCono) {
		this.lblCono = lblCono;
	}

	public JComboBox<String> getListaOpcionesCono() {
		return listaOpcionesCono;
	}

	public void setListaOpcionesCono(JComboBox<String> listaOpcionesCono) {
		this.listaOpcionesCono = listaOpcionesCono;
	}

	public JLabel getLblVegano() {
		return lblVegano;
	}

	public void setLblVegano(JLabel lblVegano) {
		this.lblVegano = lblVegano;
	}

	public JComboBox<String> getListaOpcionesVegano() {
		return listaOpcionesVegano;
	}

	public void setListaOpcionesVegano(JComboBox<String> listaOpcionesVegano) {
		this.listaOpcionesVegano = listaOpcionesVegano;
	}

	public JLabel getLblSalado() {
		return lblSalado;
	}

	public void setLblSalado(JLabel lblSalado) {
		this.lblSalado = lblSalado;
	}

	public JComboBox<String> getListaOpcionesSalado() {
		return listaOpcionesSalado;
	}

	public void setListaOpcionesSalado(JComboBox<String> listaOpcionesSalado) {
		this.listaOpcionesSalado = listaOpcionesSalado;
	}

	public JLabel getLblTieneHelado() {
		return lblTieneHelado;
	}

	public void setLblTieneHelado(JLabel lblTieneHelado) {
		this.lblTieneHelado = lblTieneHelado;
	}

	public JComboBox<String> getListaOpcionesTieneHelado() {
		return listaOpcionesTieneHelado;
	}

	public void setListaOpcionesTieneHelado(JComboBox<String> listaOpcionesTieneHelado) {
		this.listaOpcionesTieneHelado = listaOpcionesTieneHelado;
	}

	public JLabel getLblSaborHelado() {
		return lblSaborHelado;
	}

	public void setLblSaborHelado(JLabel lblSaborHelado) {
		this.lblSaborHelado = lblSaborHelado;
	}

	public JTextField getTxtSaborHelado() {
		return txtSaborHelado;
	}

	public void setTxtSaborHelado(JTextField txtSaborHelado) {
		this.txtSaborHelado = txtSaborHelado;
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}
	
	
	
}
