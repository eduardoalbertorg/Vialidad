package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;

public class NuevaRecaudadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtCodigoPostal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevaRecaudadora frame = new NuevaRecaudadora();
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
	public NuevaRecaudadora() {
		setTitle("Recaudadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 308, 225);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(103, 36, 179, 20);
		contentPane.add(txtNombre);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(10, 39, 73, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setForeground(Color.WHITE);
		lblDireccion.setBounds(10, 70, 73, 14);
		contentPane.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(103, 67, 179, 20);
		contentPane.add(txtDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setBounds(10, 98, 73, 14);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(103, 95, 179, 20);
		contentPane.add(txtTelefono);
		
		JLabel lblCodigoPostal = new JLabel("Codigo Postal:");
		lblCodigoPostal.setForeground(Color.WHITE);
		lblCodigoPostal.setBounds(10, 126, 96, 14);
		contentPane.add(lblCodigoPostal);
		
		txtCodigoPostal = new JTextField();
		txtCodigoPostal.setColumns(10);
		txtCodigoPostal.setBounds(103, 123, 179, 20);
		contentPane.add(txtCodigoPostal);
		
		JButton button = new JButton("Crear");
		button.setMnemonic('C');
		button.setBounds(59, 151, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setMnemonic('a');
		button_1.setBounds(158, 151, 89, 23);
		contentPane.add(button_1);
		
		JLabel lblRecaudadora = new JLabel("Recaudadora");
		lblRecaudadora.setForeground(Color.WHITE);
		lblRecaudadora.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRecaudadora.setBounds(88, 11, 120, 14);
		contentPane.add(lblRecaudadora);
	}
}
