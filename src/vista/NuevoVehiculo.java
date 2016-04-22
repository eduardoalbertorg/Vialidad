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
import java.awt.Font;

public class NuevoVehiculo extends JFrame {

	private JPanel contentPane;
	private JTextField txtPlacas;
	private JTextField txtColor1;
	private JTextField txtMov;
	private JTextField txtClase;
	private JLabel lblMarca;
	private JTextField txtMarca;
	private JTextField txtColor2;
	private JLabel lblColor2;
	private JLabel lblProced;
	private JTextField txtProced;
	private JLabel lblTipo;
	private JTextField txtTipo;
	private JLabel lblSubmarca;
	private JTextField txtSubmarca;
	private JLabel lblNumeroDeSerie;
	private JTextField txtNumeroDeSerie;
	private JTextField txtComb;
	private JLabel lblComb;
	private JLabel lblCilindros;
	private JTextField txtCilindros;
	private JLabel lblVersion;
	private JTextField txtVersion;
	private JLabel lblNumeroDelMotor;
	private JTextField txtNumeroDelMotor;
	private JLabel lblServicio;
	private JTextField txtServicio;
	private JTextField txtPuertas;
	private JLabel lblPuertas;
	private JLabel lblModelo;
	private JTextField txtModelo;
	private JLabel lblNrpv;
	private JTextField txtNRPV;
	private JLabel lblUso;
	private JTextField txtUso;
	private JLabel lblPasajKg;
	private JTextField txtPasajKg;
	private JLabel lblVehiculo;

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
		setTitle("Vehiculo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 454);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPlacas = new JTextField();
		txtPlacas.setBounds(103, 62, 179, 20);
		contentPane.add(txtPlacas);
		txtPlacas.setColumns(10);
		
		JLabel lblPlacas = new JLabel("Placas:");
		lblPlacas.setForeground(Color.WHITE);
		lblPlacas.setBounds(10, 65, 73, 14);
		contentPane.add(lblPlacas);
		
		JLabel lblColor1 = new JLabel("Color1:");
		lblColor1.setForeground(Color.WHITE);
		lblColor1.setBounds(10, 96, 73, 14);
		contentPane.add(lblColor1);
		
		txtColor1 = new JTextField();
		txtColor1.setColumns(10);
		txtColor1.setBounds(103, 93, 179, 20);
		contentPane.add(txtColor1);
		
		JLabel lblMov = new JLabel("Mov:");
		lblMov.setForeground(Color.WHITE);
		lblMov.setBounds(10, 124, 73, 14);
		contentPane.add(lblMov);
		
		txtMov = new JTextField();
		txtMov.setColumns(10);
		txtMov.setBounds(103, 121, 179, 20);
		contentPane.add(txtMov);
		
		JLabel lblClase = new JLabel("Clase:");
		lblClase.setForeground(Color.WHITE);
		lblClase.setBounds(10, 155, 73, 14);
		contentPane.add(lblClase);
		
		txtClase = new JTextField();
		txtClase.setColumns(10);
		txtClase.setBounds(103, 152, 179, 20);
		contentPane.add(txtClase);
		
		lblMarca = new JLabel("Marca:");
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setBounds(10, 183, 96, 14);
		contentPane.add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(103, 180, 179, 20);
		contentPane.add(txtMarca);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setMnemonic('C');
		btnCrear.setBounds(214, 370, 89, 23);
		contentPane.add(btnCrear);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setMnemonic('a');
		btnCancelar.setBounds(313, 370, 89, 23);
		contentPane.add(btnCancelar);
		
		txtColor2 = new JTextField();
		txtColor2.setColumns(10);
		txtColor2.setBounds(103, 208, 179, 20);
		contentPane.add(txtColor2);
		
		lblColor2 = new JLabel("Color2:");
		lblColor2.setForeground(Color.WHITE);
		lblColor2.setBounds(10, 211, 73, 14);
		contentPane.add(lblColor2);
		
		lblProced = new JLabel("Proced:");
		lblProced.setForeground(Color.WHITE);
		lblProced.setBounds(10, 242, 73, 14);
		contentPane.add(lblProced);
		
		txtProced = new JTextField();
		txtProced.setColumns(10);
		txtProced.setBounds(103, 239, 179, 20);
		contentPane.add(txtProced);
		
		lblTipo = new JLabel("Tipo:");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setBounds(10, 270, 73, 14);
		contentPane.add(lblTipo);
		
		txtTipo = new JTextField();
		txtTipo.setColumns(10);
		txtTipo.setBounds(103, 267, 179, 20);
		contentPane.add(txtTipo);
		
		lblSubmarca = new JLabel("Submarca:");
		lblSubmarca.setForeground(Color.WHITE);
		lblSubmarca.setBounds(10, 301, 73, 14);
		contentPane.add(lblSubmarca);
		
		txtSubmarca = new JTextField();
		txtSubmarca.setColumns(10);
		txtSubmarca.setBounds(103, 298, 179, 20);
		contentPane.add(txtSubmarca);
		
		lblNumeroDeSerie = new JLabel("Numero de Serie:");
		lblNumeroDeSerie.setForeground(Color.WHITE);
		lblNumeroDeSerie.setBounds(10, 329, 96, 14);
		contentPane.add(lblNumeroDeSerie);
		
		txtNumeroDeSerie = new JTextField();
		txtNumeroDeSerie.setColumns(10);
		txtNumeroDeSerie.setBounds(103, 326, 179, 20);
		contentPane.add(txtNumeroDeSerie);
		
		txtComb = new JTextField();
		txtComb.setColumns(10);
		txtComb.setBounds(435, 62, 179, 20);
		contentPane.add(txtComb);
		
		lblComb = new JLabel("Comb:");
		lblComb.setForeground(Color.WHITE);
		lblComb.setBounds(319, 65, 73, 14);
		contentPane.add(lblComb);
		
		lblCilindros = new JLabel("Cilindros:");
		lblCilindros.setForeground(Color.WHITE);
		lblCilindros.setBounds(319, 96, 73, 14);
		contentPane.add(lblCilindros);
		
		txtCilindros = new JTextField();
		txtCilindros.setColumns(10);
		txtCilindros.setBounds(435, 93, 179, 20);
		contentPane.add(txtCilindros);
		
		lblVersion = new JLabel("Version:");
		lblVersion.setForeground(Color.WHITE);
		lblVersion.setBounds(319, 124, 73, 14);
		contentPane.add(lblVersion);
		
		txtVersion = new JTextField();
		txtVersion.setColumns(10);
		txtVersion.setBounds(435, 121, 179, 20);
		contentPane.add(txtVersion);
		
		lblNumeroDelMotor = new JLabel("Numero del Motor:");
		lblNumeroDelMotor.setForeground(Color.WHITE);
		lblNumeroDelMotor.setBounds(319, 155, 106, 14);
		contentPane.add(lblNumeroDelMotor);
		
		txtNumeroDelMotor = new JTextField();
		txtNumeroDelMotor.setColumns(10);
		txtNumeroDelMotor.setBounds(435, 152, 179, 20);
		contentPane.add(txtNumeroDelMotor);
		
		lblServicio = new JLabel("Servicio:");
		lblServicio.setForeground(Color.WHITE);
		lblServicio.setBounds(319, 183, 96, 14);
		contentPane.add(lblServicio);
		
		txtServicio = new JTextField();
		txtServicio.setColumns(10);
		txtServicio.setBounds(435, 180, 179, 20);
		contentPane.add(txtServicio);
		
		txtPuertas = new JTextField();
		txtPuertas.setColumns(10);
		txtPuertas.setBounds(435, 208, 179, 20);
		contentPane.add(txtPuertas);
		
		lblPuertas = new JLabel("Puertas:");
		lblPuertas.setForeground(Color.WHITE);
		lblPuertas.setBounds(319, 211, 73, 14);
		contentPane.add(lblPuertas);
		
		lblModelo = new JLabel("Modelo:");
		lblModelo.setForeground(Color.WHITE);
		lblModelo.setBounds(319, 242, 73, 14);
		contentPane.add(lblModelo);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(435, 239, 179, 20);
		contentPane.add(txtModelo);
		
		lblNrpv = new JLabel("N.R.P.V.:");
		lblNrpv.setForeground(Color.WHITE);
		lblNrpv.setBounds(319, 270, 73, 14);
		contentPane.add(lblNrpv);
		
		txtNRPV = new JTextField();
		txtNRPV.setColumns(10);
		txtNRPV.setBounds(435, 267, 179, 20);
		contentPane.add(txtNRPV);
		
		lblUso = new JLabel("Uso:");
		lblUso.setForeground(Color.WHITE);
		lblUso.setBounds(319, 301, 73, 14);
		contentPane.add(lblUso);
		
		txtUso = new JTextField();
		txtUso.setColumns(10);
		txtUso.setBounds(435, 298, 179, 20);
		contentPane.add(txtUso);
		
		lblPasajKg = new JLabel("Pasaj/Kg:");
		lblPasajKg.setForeground(Color.WHITE);
		lblPasajKg.setBounds(319, 329, 96, 14);
		contentPane.add(lblPasajKg);
		
		txtPasajKg = new JTextField();
		txtPasajKg.setColumns(10);
		txtPasajKg.setBounds(435, 326, 179, 20);
		contentPane.add(txtPasajKg);
		
		lblVehiculo = new JLabel("Veh\u00EDculo");
		lblVehiculo.setForeground(Color.WHITE);
		lblVehiculo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblVehiculo.setBounds(282, 24, 120, 14);
		contentPane.add(lblVehiculo);
	}
}
