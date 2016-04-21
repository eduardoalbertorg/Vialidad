package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;

public class NuevoPropietario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblCodigopostal;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoPropietario frame = new NuevoPropietario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NuevoPropietario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 307, 223);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(103, 8, 179, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre(s):");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(10, 11, 73, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setBounds(10, 42, 73, 14);
		contentPane.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(103, 39, 179, 20);
		contentPane.add(txtApellido);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setForeground(Color.WHITE);
		lblDireccion.setBounds(10, 70, 73, 14);
		contentPane.add(lblDireccion);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(103, 67, 179, 20);
		contentPane.add(textField);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setBounds(10, 101, 73, 14);
		contentPane.add(lblTelefono);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(103, 98, 179, 20);
		contentPane.add(textField_1);
		
		lblCodigopostal = new JLabel("Codigo Postal:");
		lblCodigopostal.setForeground(Color.WHITE);
		lblCodigopostal.setBounds(10, 129, 96, 14);
		contentPane.add(lblCodigopostal);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(103, 126, 179, 20);
		contentPane.add(textField_2);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setMnemonic('C');
		btnCrear.setBounds(56, 157, 89, 23);
		contentPane.add(btnCrear);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setMnemonic('a');
		btnCancelar.setBounds(155, 157, 89, 23);
		contentPane.add(btnCancelar);
	}
}
