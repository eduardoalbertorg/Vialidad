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

public class NuevoVehiculo extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblCodigopostal;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label;
	private JLabel label_1;
	private JTextField textField_4;
	private JLabel label_2;
	private JTextField textField_5;
	private JLabel label_3;
	private JTextField textField_6;
	private JLabel label_4;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel label_5;
	private JLabel label_6;
	private JTextField textField_9;
	private JLabel label_7;
	private JTextField textField_10;
	private JLabel label_8;
	private JTextField textField_11;
	private JLabel label_9;
	private JTextField textField_12;
	private JTextField textField_13;
	private JLabel label_10;
	private JLabel label_11;
	private JTextField textField_14;
	private JLabel label_12;
	private JTextField textField_15;
	private JLabel label_13;
	private JTextField textField_16;
	private JLabel label_14;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoVehiculo frame = new NuevoVehiculo();
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
	public NuevoVehiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 533);
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
		btnCrear.setBounds(57, 460, 89, 23);
		contentPane.add(btnCrear);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setMnemonic('a');
		btnCancelar.setBounds(156, 460, 89, 23);
		contentPane.add(btnCancelar);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(103, 154, 179, 20);
		contentPane.add(textField_3);
		
		label = new JLabel("Nombre(s):");
		label.setForeground(Color.WHITE);
		label.setBounds(10, 157, 73, 14);
		contentPane.add(label);
		
		label_1 = new JLabel("Apellido:");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(10, 188, 73, 14);
		contentPane.add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(103, 185, 179, 20);
		contentPane.add(textField_4);
		
		label_2 = new JLabel("Direccion:");
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(10, 216, 73, 14);
		contentPane.add(label_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(103, 213, 179, 20);
		contentPane.add(textField_5);
		
		label_3 = new JLabel("Telefono:");
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(10, 247, 73, 14);
		contentPane.add(label_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(103, 244, 179, 20);
		contentPane.add(textField_6);
		
		label_4 = new JLabel("Codigo Postal:");
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(10, 275, 96, 14);
		contentPane.add(label_4);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(103, 272, 179, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(412, 8, 179, 20);
		contentPane.add(textField_8);
		
		label_5 = new JLabel("Nombre(s):");
		label_5.setForeground(Color.WHITE);
		label_5.setBounds(319, 11, 73, 14);
		contentPane.add(label_5);
		
		label_6 = new JLabel("Apellido:");
		label_6.setForeground(Color.WHITE);
		label_6.setBounds(319, 42, 73, 14);
		contentPane.add(label_6);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(412, 39, 179, 20);
		contentPane.add(textField_9);
		
		label_7 = new JLabel("Direccion:");
		label_7.setForeground(Color.WHITE);
		label_7.setBounds(319, 70, 73, 14);
		contentPane.add(label_7);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(412, 67, 179, 20);
		contentPane.add(textField_10);
		
		label_8 = new JLabel("Telefono:");
		label_8.setForeground(Color.WHITE);
		label_8.setBounds(319, 101, 73, 14);
		contentPane.add(label_8);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(412, 98, 179, 20);
		contentPane.add(textField_11);
		
		label_9 = new JLabel("Codigo Postal:");
		label_9.setForeground(Color.WHITE);
		label_9.setBounds(319, 129, 96, 14);
		contentPane.add(label_9);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(412, 126, 179, 20);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(412, 154, 179, 20);
		contentPane.add(textField_13);
		
		label_10 = new JLabel("Nombre(s):");
		label_10.setForeground(Color.WHITE);
		label_10.setBounds(319, 157, 73, 14);
		contentPane.add(label_10);
		
		label_11 = new JLabel("Apellido:");
		label_11.setForeground(Color.WHITE);
		label_11.setBounds(319, 188, 73, 14);
		contentPane.add(label_11);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(412, 185, 179, 20);
		contentPane.add(textField_14);
		
		label_12 = new JLabel("Direccion:");
		label_12.setForeground(Color.WHITE);
		label_12.setBounds(319, 216, 73, 14);
		contentPane.add(label_12);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(412, 213, 179, 20);
		contentPane.add(textField_15);
		
		label_13 = new JLabel("Telefono:");
		label_13.setForeground(Color.WHITE);
		label_13.setBounds(319, 247, 73, 14);
		contentPane.add(label_13);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(412, 244, 179, 20);
		contentPane.add(textField_16);
		
		label_14 = new JLabel("Codigo Postal:");
		label_14.setForeground(Color.WHITE);
		label_14.setBounds(319, 275, 96, 14);
		contentPane.add(label_14);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(412, 272, 179, 20);
		contentPane.add(textField_17);
	}
}
