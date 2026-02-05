package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuPrincipal extends JFrame{

	private ImageIcon fondo;
	private Image escalar;
	private JLabel fondoMenu;

	private JLabel titulo;
	private JButton btnInicio;
	
	private JLabel lblIdioma;
	private JComboBox<String> cbIdioma;
	
	public MenuPrincipal() {
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		this.setTitle("Menú Principal");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		
		fondo = new ImageIcon("src/co/edu/unbosque/view/MenuCrepesAndWaffles.jpg");
		escalar = fondo.getImage().getScaledInstance(1200, 675, Image.SCALE_SMOOTH);
		fondoMenu = new JLabel(new ImageIcon(escalar));
		fondoMenu.setLayout(null);
		fondoMenu.setPreferredSize(new Dimension(1200, 675));
		
		this.setContentPane(fondoMenu);
		this.pack();
		this.setLocationRelativeTo(null);
		
		
		titulo = new JLabel("Bienvenid@ a Crepes & Waffles");
		titulo.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		titulo.setBounds(100, 120, 1200, 70);
		titulo.setForeground(Color.white);
		fondoMenu.add(titulo);
		
		btnInicio = new JButton("Inicio");
		btnInicio.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		btnInicio.setBounds(500,480, 200, 70);
		btnInicio.setBackground(Color.white);
		btnInicio.setForeground(Color.BLACK);
		btnInicio.setFocusPainted(false);
		btnInicio.setBorder(null);
		fondoMenu.add(btnInicio);
		
		cbIdioma = new JComboBox<>(new String[] {"...", "Español", "English"});
		cbIdioma.setBounds(1000, 60, 150, 30);
		fondoMenu.add(cbIdioma);
		
		lblIdioma = new JLabel("Idioma");
		lblIdioma.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblIdioma.setBounds(1000, 30, 150, 30);
		lblIdioma.setForeground(Color.white);
		fondoMenu.add(lblIdioma);
		
	}

	public ImageIcon getFondo() {
		return fondo;
	}

	public void setFondo(ImageIcon fondo) {
		this.fondo = fondo;
	}

	public Image getEscalar() {
		return escalar;
	}

	public void setEscalar(Image escalar) {
		this.escalar = escalar;
	}

	public JLabel getFondoMenu() {
		return fondoMenu;
	}

	public void setFondoMenu(JLabel fondoMenu) {
		this.fondoMenu = fondoMenu;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JButton getBtnInicio() {
		return btnInicio;
	}

	public void setBtnInicio(JButton btnInicio) {
		this.btnInicio = btnInicio;
	}

	public JLabel getLblIdioma() {
		return lblIdioma;
	}

	public void setLblIdioma(JLabel lblIdioma) {
		this.lblIdioma = lblIdioma;
	}

	public JComboBox<String> getCbIdioma() {
		return cbIdioma;
	}

	public void setCbIdioma(JComboBox<String> cbIdioma) {
		this.cbIdioma = cbIdioma;
	}
	
	
}
