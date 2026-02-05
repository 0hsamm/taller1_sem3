package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Seleccion extends JFrame{
	
	
	private JLabel lblOpcion;
	
	private ImageIcon imgWaffle;
	private ImageIcon imgHelado;
	private ImageIcon imgCrepe;
	private JLabel etiqueta;
	private Image imagen;
	private Image escalada;
	private JButton btnWaffle;
	private JButton btnCrepe;
	private JButton btnHelado;
	private JLabel lblHelado;
	private JLabel lblWaffle;
	private JLabel lblCrepe;
	
	public Seleccion() {
		asignarComponentes();
	}
	
	
	public void asignarComponentes() {
		
		
		this.setTitle("Selección");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setBackground(new Color(201, 148, 117));
		this.setPreferredSize(new Dimension(1200, 675));
		this.pack();
		this.setLocationRelativeTo(null);
		
		
		
		lblOpcion = new JLabel("¿Qué desea comer el día de hoy?");
		lblOpcion.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));	
		lblOpcion.setBounds(225, 50, 1200, 70);
		this.add(lblOpcion);
		
		
		imgWaffle = new ImageIcon("src/co/edu/unbosque/view/waffle.jpg");
		imagen = imgWaffle.getImage();
		escalada = imagen.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		etiqueta = new JLabel(new ImageIcon(escalada));
		add(etiqueta);
		
		btnWaffle = new JButton(new ImageIcon("src/co/edu/unbosque/view/waffle.jpg"));
		btnWaffle.setBounds(100, 150, 300, 400);
		this.add(btnWaffle);
		
		imgHelado = new ImageIcon("src/co/edu/unbosque/view/helado.jpg");
		imagen = imgHelado.getImage();
		escalada = imagen.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		etiqueta = new JLabel(new ImageIcon(escalada));
		add(etiqueta);
		
		btnHelado = new JButton(new ImageIcon("src/co/edu/unbosque/view/helado.jpg"));
		btnHelado.setBounds(450, 150, 300, 400);
		this.add(btnHelado);
		
		
		imgCrepe = new ImageIcon("src/co/edu/unbosque/view/crepe.jpg");
		imagen = imgCrepe.getImage();
		escalada = imagen.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		etiqueta = new JLabel(new ImageIcon(escalada));
		add(etiqueta);
		
		
		btnCrepe = new JButton(new ImageIcon("src/co/edu/unbosque/view/crepe.jpg"));
		btnCrepe.setBounds(800, 150, 300, 400);
		this.add(btnCrepe);
		
		lblWaffle = new JLabel("Waffle");
		lblWaffle.setFont(new Font("Arial Rounded MT Bold", Font.BOLD,40));
		lblWaffle.setBounds(175, 550, 200, 50);
		this.add(lblWaffle);
		
		
		lblHelado = new JLabel("Helado");
		lblHelado.setFont(new Font("Arial Rounded MT Bold", Font.BOLD,40));
		lblHelado.setBounds(525, 550, 200, 50);
		this.add(lblHelado);
		
		
		lblCrepe = new JLabel("Crepe");
		lblCrepe.setFont(new Font("Arial Rounded MT Bold", Font.BOLD,40));
		lblCrepe.setBounds(875, 550, 200, 50);
		this.add(lblCrepe);
		
		
	}
	
	
	

}
