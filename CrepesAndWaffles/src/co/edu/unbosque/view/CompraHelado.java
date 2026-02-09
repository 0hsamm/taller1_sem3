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

public class CompraHelado extends JFrame{
	
	
	
	private JLabel lblOpcion;
	
	private JLabel etiqueta;
	private Image imagen;
	private Image escalada;
	private JButton btnVolver;
	private ImageIcon imgCarrito;
	private JButton btnCarrito;
	private JComboBox<String> listaSabores;
	
	
	public CompraHelado() {
		inicializarComponentes();
	}
	
	
	public void inicializarComponentes() {
		
		
		this.setTitle("Comprar Helado");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(1200, 675));
		this.pack();
		this.setLocationRelativeTo(null);
		
		
		
		lblOpcion = new JLabel("¿Qué desea helado desea el dia de hoy?");
		lblOpcion.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));	
		lblOpcion.setBounds(225, 50, 1200, 70);
		this.add(lblOpcion);

		
		imgCarrito = new ImageIcon("src/co/edu/unbosque/view/carritoCompras.png");
		imagen = imgCarrito.getImage();
		escalada = imagen.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		etiqueta = new JLabel(new ImageIcon(escalada));
		add(etiqueta);
		
		btnCarrito = new JButton(new ImageIcon(escalada));
		btnCarrito.setBounds(1050, 20, 75, 75);
		this.add(btnCarrito);
		

		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.BOLD,30));
		btnVolver.setBounds(10, 20, 150, 50);
		btnVolver.setBackground(Color.white);
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFocusPainted(false);
		btnVolver.setBorder(null);
		this.add(btnVolver);
		
		listaSabores = new JComboBox<>();
		listaSabores.setFont(new Font("Arial Rounded MT Bold", Font.BOLD,30));
		listaSabores.setBounds(10, 250, 300, 40);
		listaSabores.addItem("Seleccione...");
		this.add(listaSabores);
		
	}


}
