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
	private JButton btnVolver;
	private ImageIcon imgCarrito;
	private JButton btnCarrito;
	private JLabel lblCarrito;
	
	public Seleccion() {
		asignarComponentes();
	}
	
	
	public void asignarComponentes() {
		
		
		this.setTitle("Selección");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(1200, 675));
		this.pack();
		this.setLocationRelativeTo(null);
		
		
		
		lblOpcion = new JLabel("¿Qué desea comer el día de hoy?");
		lblOpcion.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));	
		lblOpcion.setBounds(225, 50, 1200, 70);
		this.add(lblOpcion);
		

		
		btnWaffle = new JButton(new ImageIcon("src/co/edu/unbosque/view/waffle.jpg"));
		btnWaffle.setBounds(100, 150, 300, 400);
		this.add(btnWaffle);
		

		
		btnHelado = new JButton(new ImageIcon("src/co/edu/unbosque/view/helado.jpg"));
		btnHelado.setBounds(450, 150, 300, 400);
		this.add(btnHelado);
		
		
		
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
		
	}


	public JLabel getLblOpcion() {
		return lblOpcion;
	}


	public void setLblOpcion(JLabel lblOpcion) {
		this.lblOpcion = lblOpcion;
	}


	public ImageIcon getImgWaffle() {
		return imgWaffle;
	}


	public void setImgWaffle(ImageIcon imgWaffle) {
		this.imgWaffle = imgWaffle;
	}


	public ImageIcon getImgHelado() {
		return imgHelado;
	}


	public void setImgHelado(ImageIcon imgHelado) {
		this.imgHelado = imgHelado;
	}


	public ImageIcon getImgCrepe() {
		return imgCrepe;
	}


	public void setImgCrepe(ImageIcon imgCrepe) {
		this.imgCrepe = imgCrepe;
	}


	public JLabel getEtiqueta() {
		return etiqueta;
	}


	public void setEtiqueta(JLabel etiqueta) {
		this.etiqueta = etiqueta;
	}


	public Image getImagen() {
		return imagen;
	}


	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}


	public Image getEscalada() {
		return escalada;
	}


	public void setEscalada(Image escalada) {
		this.escalada = escalada;
	}


	public JButton getBtnWaffle() {
		return btnWaffle;
	}


	public void setBtnWaffle(JButton btnWaffle) {
		this.btnWaffle = btnWaffle;
	}


	public JButton getBtnCrepe() {
		return btnCrepe;
	}


	public void setBtnCrepe(JButton btnCrepe) {
		this.btnCrepe = btnCrepe;
	}


	public JButton getBtnHelado() {
		return btnHelado;
	}


	public void setBtnHelado(JButton btnHelado) {
		this.btnHelado = btnHelado;
	}


	public JLabel getLblHelado() {
		return lblHelado;
	}


	public void setLblHelado(JLabel lblHelado) {
		this.lblHelado = lblHelado;
	}


	public JLabel getLblWaffle() {
		return lblWaffle;
	}


	public void setLblWaffle(JLabel lblWaffle) {
		this.lblWaffle = lblWaffle;
	}


	public JLabel getLblCrepe() {
		return lblCrepe;
	}


	public void setLblCrepe(JLabel lblCrepe) {
		this.lblCrepe = lblCrepe;
	}


	public JButton getBtnVolver() {
		return btnVolver;
	}


	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}


	public ImageIcon getImgCarrito() {
		return imgCarrito;
	}


	public void setImgCarrito(ImageIcon imgCarrito) {
		this.imgCarrito = imgCarrito;
	}


	public JButton getBtnCarrito() {
		return btnCarrito;
	}


	public void setBtnCarrito(JButton btnCarrito) {
		this.btnCarrito = btnCarrito;
	}


	public JLabel getLblCarrito() {
		return lblCarrito;
	}


	public void setLblCarrito(JLabel lblCarrito) {
		this.lblCarrito = lblCarrito;
	}
	
	
	

}
