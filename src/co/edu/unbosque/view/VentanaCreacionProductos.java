package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

public class VentanaCreacionProductos extends JFrame {
	
	private JPanel panelPrincipal;
	private JPanel panelProductos;
	private JScrollPane scrollPane;
	private JLabel lblTitulo;
	
	public VentanaCreacionProductos() {
		inicializarComponentes();
		cargarProductos();
	}
	
	public void inicializarComponentes() {
		this.setTitle("Menú de Productos");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.setBackground(Color.WHITE);
		this.setPreferredSize(new Dimension(800, 600));
		
		// Panel superior con título
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBackground(new Color(242, 224, 203));
		panelTitulo.setPreferredSize(new Dimension(800, 80));
		
		lblTitulo = new JLabel("Menú de Productos");
		lblTitulo.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 36));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		panelTitulo.add(lblTitulo);
		
		this.add(panelTitulo, BorderLayout.NORTH);
		
		// Panel principal para los productos
		panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout());
		panelPrincipal.setBackground(Color.WHITE);
		
		// Panel de productos con layout vertical
		panelProductos = new JPanel();
		panelProductos.setLayout(new BoxLayout(panelProductos, BoxLayout.Y_AXIS));
		panelProductos.setBackground(Color.WHITE);
		panelProductos.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		// ScrollPane para permitir scroll si hay muchos productos
		scrollPane = new JScrollPane(panelProductos);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		scrollPane.setBorder(null);
		
		panelPrincipal.add(scrollPane, BorderLayout.CENTER);
		this.add(panelPrincipal, BorderLayout.CENTER);
		
		this.pack();
		this.setLocationRelativeTo(null);
	}
	
	/**
	 * Carga los productos de ejemplo en el menú
	 */
	private void cargarProductos() {
		// Productos tipo Helado
		agregarProductoAlMenu("Helado de Vainilla", "Delicioso helado cremoso de vainilla", 
				5000.0, "helado_vainilla.jpg", "Helado");
		agregarProductoAlMenu("Helado de Chocolate", "Intenso sabor a chocolate", 
				5500.0, "helado_chocolate.jpg", "Helado");
		
		// Productos tipo Crepe
		agregarProductoAlMenu("Crepe de Nutella", "Crepe suave con nutella y fresas", 
				8000.0, "crepe_nutella.jpg", "Crepe");
		agregarProductoAlMenu("Crepe Salado", "Crepe con jamón, queso y champiñones", 
				9000.0, "crepe_salado.jpg", "Crepe");
		
		// Productos tipo Waffle
		agregarProductoAlMenu("Waffle Clásico", "Waffle crujiente con miel y mantequilla", 
				7000.0, "waffle_clasico.jpg", "Waffle");
		agregarProductoAlMenu("Waffle con Helado", "Waffle con bola de helado de fresa", 
				10000.0, "waffle_helado.jpg", "Waffle");
	}
	
	/**
	 * Agrega un producto al panel de menú
	 * @param tipoProducto: "Helado", "Crepe" o "Waffle"
	 */
	public void agregarProductoAlMenu(String nombre, String descripcion, double precio, 
			String rutaImagen, String tipoProducto) {
		JPanel panelProducto = new JPanel();
		panelProducto.setLayout(new BorderLayout(15, 10));
		panelProducto.setBackground(Color.WHITE);
		panelProducto.setBorder(BorderFactory.createCompoundBorder(
			BorderFactory.createLineBorder(new Color(230, 230, 230), 2),
			BorderFactory.createEmptyBorder(15, 15, 15, 15)
		));
		panelProducto.setMaximumSize(new Dimension(750, 200));
		panelProducto.setPreferredSize(new Dimension(750, 200));
		
		// Panel izquierdo: Imagen
		JPanel panelImagen = new JPanel();
		panelImagen.setLayout(new BorderLayout());
		panelImagen.setBackground(Color.WHITE);
		panelImagen.setPreferredSize(new Dimension(120, 120));
		
		JLabel lblImagen = new JLabel();
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen.setPreferredSize(new Dimension(120, 120));
		
		// Intentar cargar la imagen, si no existe mostrar un placeholder
		try {
			ImageIcon icon = new ImageIcon(rutaImagen);
			// Si la imagen no existe, usar un color de fondo
			if (icon.getIconWidth() == -1) {
				lblImagen.setOpaque(true);
				lblImagen.setBackground(new Color(245, 245, 245));
				lblImagen.setText("🍦");
				lblImagen.setFont(new Font("Arial", Font.PLAIN, 50));
			} else {
				Image img = icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
				lblImagen.setIcon(new ImageIcon(img));
			}
		} catch (Exception e) {
			// Placeholder si hay error
			lblImagen.setOpaque(true);
			lblImagen.setBackground(new Color(245, 245, 245));
			lblImagen.setText("🍦");
			lblImagen.setFont(new Font("Arial", Font.PLAIN, 50));
		}
		
		panelImagen.add(lblImagen, BorderLayout.CENTER);
		panelProducto.add(panelImagen, BorderLayout.WEST);
		
		// Panel central: Información del producto
		JPanel panelInfo = new JPanel();
		panelInfo.setLayout(new BoxLayout(panelInfo, BoxLayout.Y_AXIS));
		panelInfo.setBackground(Color.WHITE);
		
		JLabel lblNombre = new JLabel(nombre);
		lblNombre.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		lblNombre.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		JLabel lblDescripcion = new JLabel(descripcion);
		lblDescripcion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDescripcion.setForeground(new Color(100, 100, 100));
		lblDescripcion.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		JLabel lblPrecio = new JLabel(String.format("$%.2f", precio));
		lblPrecio.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblPrecio.setForeground(new Color(34, 139, 34)); // Verde
		lblPrecio.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		panelInfo.add(lblNombre);
		panelInfo.add(Box.createRigidArea(new Dimension(0, 5)));
		panelInfo.add(lblDescripcion);
		panelInfo.add(Box.createRigidArea(new Dimension(0, 10)));
		panelInfo.add(lblPrecio);
		panelInfo.add(Box.createRigidArea(new Dimension(0, 10)));
		
		// Panel de checkboxes según el tipo de producto
		JPanel panelOpciones = crearPanelOpciones(tipoProducto);
		panelOpciones.setAlignmentX(Component.LEFT_ALIGNMENT);
		panelInfo.add(panelOpciones);
		
		panelProducto.add(panelInfo, BorderLayout.CENTER);
		
		// Panel derecho: Cantidad y botón agregar
		JPanel panelAcciones = new JPanel();
		panelAcciones.setLayout(new BoxLayout(panelAcciones, BoxLayout.Y_AXIS));
		panelAcciones.setBackground(Color.WHITE);
		panelAcciones.setPreferredSize(new Dimension(180, 120));
		
		// Label "Cantidad"
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Arial", Font.BOLD, 14));
		lblCantidad.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		// Spinner para seleccionar cantidad
		SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1, 1, 99, 1);
		JSpinner spinner = new JSpinner(spinnerModel);
		spinner.setFont(new Font("Arial", Font.PLAIN, 18));
		spinner.setMaximumSize(new Dimension(80, 35));
		spinner.setAlignmentX(Component.CENTER_ALIGNMENT);
		((JSpinner.DefaultEditor) spinner.getEditor()).getTextField().setHorizontalAlignment(JLabel.CENTER);
		
		// Botón agregar
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		btnAgregar.setBackground(new Color(77, 49, 0));
		btnAgregar.setForeground(Color.WHITE);
		btnAgregar.setFocusPainted(false);
		btnAgregar.setMaximumSize(new Dimension(150, 40));
		btnAgregar.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		
		// Acción del botón
		btnAgregar.addActionListener(e -> {
			int cantidad = (Integer) spinner.getValue();
			agregarAlCarrito(nombre, precio, cantidad, panelOpciones, tipoProducto);
		});
		
		panelAcciones.add(Box.createVerticalGlue());
		panelAcciones.add(lblCantidad);
		panelAcciones.add(Box.createRigidArea(new Dimension(0, 5)));
		panelAcciones.add(spinner);
		panelAcciones.add(Box.createRigidArea(new Dimension(0, 10)));
		panelAcciones.add(btnAgregar);
		panelAcciones.add(Box.createVerticalGlue());
		
		panelProducto.add(panelAcciones, BorderLayout.EAST);
		
		// Agregar el producto al panel principal
		panelProductos.add(panelProducto);
		panelProductos.add(Box.createRigidArea(new Dimension(0, 15)));
	}
	
	/**
	 * Crea el panel de opciones (checkboxes) según el tipo de producto
	 */
	private JPanel crearPanelOpciones(String tipoProducto) {
		JPanel panelOpciones = new JPanel();
		panelOpciones.setLayout(new BoxLayout(panelOpciones, BoxLayout.X_AXIS));
		panelOpciones.setBackground(Color.WHITE);
		
		Font fontCheckbox = new Font("Arial", Font.PLAIN, 12);
		
		switch(tipoProducto) {
			case "Helado":
				// Opciones para Helado: esCono
				JCheckBox chkCono = new JCheckBox("En cono");
				chkCono.setFont(fontCheckbox);
				chkCono.setBackground(Color.WHITE);
				chkCono.setName("esCono");
				
				// Spinner para cantidad de bolas
				JLabel lblBolas = new JLabel("Bolas:");
				lblBolas.setFont(fontCheckbox);
				SpinnerNumberModel modelBolas = new SpinnerNumberModel(1, 1, 5, 1);
				JSpinner spinnerBolas = new JSpinner(modelBolas);
				spinnerBolas.setFont(new Font("Arial", Font.PLAIN, 12));
				spinnerBolas.setMaximumSize(new Dimension(60, 25));
				spinnerBolas.setName("cantidadBola");
				
				panelOpciones.add(chkCono);
				panelOpciones.add(Box.createRigidArea(new Dimension(15, 0)));
				panelOpciones.add(lblBolas);
				panelOpciones.add(Box.createRigidArea(new Dimension(5, 0)));
				panelOpciones.add(spinnerBolas);
				break;
				
			case "Crepe":
				// Opciones para Crepe: esVegano, esSalado
				JCheckBox chkVegano = new JCheckBox("Vegano");
				chkVegano.setFont(fontCheckbox);
				chkVegano.setBackground(Color.WHITE);
				chkVegano.setName("esVegano");
				
				JCheckBox chkSalado = new JCheckBox("Salado");
				chkSalado.setFont(fontCheckbox);
				chkSalado.setBackground(Color.WHITE);
				chkSalado.setName("esSalado");
				
				panelOpciones.add(chkVegano);
				panelOpciones.add(Box.createRigidArea(new Dimension(15, 0)));
				panelOpciones.add(chkSalado);
				break;
				
			case "Waffle":
				// Opciones para Waffle: tieneHelado
				JCheckBox chkTieneHelado = new JCheckBox("Con helado");
				chkTieneHelado.setFont(fontCheckbox);
				chkTieneHelado.setBackground(Color.WHITE);
				chkTieneHelado.setName("tieneHelado");
				
				panelOpciones.add(chkTieneHelado);
				break;
		}
		
		return panelOpciones;
	}
	
	/**
	 * Método que se ejecuta cuando se agrega un producto al carrito
	 * Aquí debes implementar la lógica para agregar al carrito/pedido
	 */
	private void agregarAlCarrito(String nombreProducto, double precio, int cantidad, 
			JPanel panelOpciones, String tipoProducto) {
		System.out.println("Producto agregado:");
		System.out.println("Tipo: " + tipoProducto);
		System.out.println("Nombre: " + nombreProducto);
		System.out.println("Precio: $" + precio);
		System.out.println("Cantidad: " + cantidad);
		System.out.println("Total: $" + (precio * cantidad));
		
		// Obtener valores de las opciones según el tipo de producto
		Component[] componentes = panelOpciones.getComponents();
		
		switch(tipoProducto) {
			case "Helado":
				boolean esCono = false;
				int cantidadBola = 1;
				
				for (Component comp : componentes) {
					if (comp instanceof JCheckBox) {
						JCheckBox chk = (JCheckBox) comp;
						if ("esCono".equals(chk.getName())) {
							esCono = chk.isSelected();
						}
					} else if (comp instanceof JSpinner) {
						JSpinner spinner = (JSpinner) comp;
						if ("cantidadBola".equals(spinner.getName())) {
							cantidadBola = (Integer) spinner.getValue();
						}
					}
				}
				
				System.out.println("En cono: " + esCono);
				System.out.println("Cantidad de bolas: " + cantidadBola);
				break;
				
			case "Crepe":
				boolean esVegano = false;
				boolean esSalado = false;
				
				for (Component comp : componentes) {
					if (comp instanceof JCheckBox) {
						JCheckBox chk = (JCheckBox) comp;
						if ("esVegano".equals(chk.getName())) {
							esVegano = chk.isSelected();
						} else if ("esSalado".equals(chk.getName())) {
							esSalado = chk.isSelected();
						}
					}
				}
				
				System.out.println("Es vegano: " + esVegano);
				System.out.println("Es salado: " + esSalado);
				break;
				
			case "Waffle":
				boolean tieneHelado = false;
				
				for (Component comp : componentes) {
					if (comp instanceof JCheckBox) {
						JCheckBox chk = (JCheckBox) comp;
						if ("tieneHelado".equals(chk.getName())) {
							tieneHelado = chk.isSelected();
						}
					}
				}
				
				System.out.println("Tiene helado: " + tieneHelado);
				break;
		}
		
		System.out.println("------------------------");
		
		// Aquí puedes llamar a tu controlador para agregar el producto
		// Por ejemplo: controlador.agregarProducto(nombreProducto, precio, cantidad, opciones);
	}
	
	// Getters y setters
	public JPanel getPanelProductos() {
		return panelProductos;
	}

	public void setPanelProductos(JPanel panelProductos) {
		this.panelProductos = panelProductos;
	}

	public JLabel getLblTitulo() {
		return lblTitulo;
	}

	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTitulo = lblTitulo;
	}
}