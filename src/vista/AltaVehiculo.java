package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class AltaVehiculo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPlacas;
	private JTextField txtColor;
	private JTextField txtMov;
	private JTextField txtClase;
	private JTextField txtMarca;
	private JTextField txtColor2;
	private JTextField txtProced;
	private JTextField txtTipo;
	private JTextField txtSubmarca;
	private JTextField txtNumeroSerie;
	private JTextField txtComb;
	private JTextField txtCilindros;
	private JTextField txtVersion;
	private JTextField txtNumeroMotor;
	private JTextField txtServicio;
	private JTextField txtPuertas;
	private JTextField txtModelo;
	private JTextField txtNRPV;
	private JTextField txtUso;
	private JTextField txtPasajKg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AltaVehiculo dialog = new AltaVehiculo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AltaVehiculo() {
		setBounds(100, 100, 676, 427);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.textHighlight);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtPlacas = new JTextField();
		txtPlacas.setColumns(10);
		txtPlacas.setBounds(116, 49, 179, 20);
		contentPanel.add(txtPlacas);
		
		JLabel label = new JLabel("Placas:");
		label.setForeground(Color.WHITE);
		label.setBounds(23, 52, 73, 14);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("Color1:");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(23, 83, 73, 14);
		contentPanel.add(label_1);
		
		txtColor = new JTextField();
		txtColor.setColumns(10);
		txtColor.setBounds(116, 80, 179, 20);
		contentPanel.add(txtColor);
		
		JLabel label_2 = new JLabel("Mov:");
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(23, 111, 73, 14);
		contentPanel.add(label_2);
		
		txtMov = new JTextField();
		txtMov.setColumns(10);
		txtMov.setBounds(116, 108, 179, 20);
		contentPanel.add(txtMov);
		
		JLabel label_3 = new JLabel("Clase:");
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(23, 142, 73, 14);
		contentPanel.add(label_3);
		
		txtClase = new JTextField();
		txtClase.setColumns(10);
		txtClase.setBounds(116, 139, 179, 20);
		contentPanel.add(txtClase);
		
		JLabel label_4 = new JLabel("Marca:");
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(23, 170, 96, 14);
		contentPanel.add(label_4);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(116, 167, 179, 20);
		contentPanel.add(txtMarca);
		
		txtColor2 = new JTextField();
		txtColor2.setColumns(10);
		txtColor2.setBounds(116, 195, 179, 20);
		contentPanel.add(txtColor2);
		
		JLabel label_5 = new JLabel("Color2:");
		label_5.setForeground(Color.WHITE);
		label_5.setBounds(23, 198, 73, 14);
		contentPanel.add(label_5);
		
		JLabel label_6 = new JLabel("Proced:");
		label_6.setForeground(Color.WHITE);
		label_6.setBounds(23, 229, 73, 14);
		contentPanel.add(label_6);
		
		txtProced = new JTextField();
		txtProced.setColumns(10);
		txtProced.setBounds(116, 226, 179, 20);
		contentPanel.add(txtProced);
		
		JLabel label_7 = new JLabel("Tipo:");
		label_7.setForeground(Color.WHITE);
		label_7.setBounds(23, 257, 73, 14);
		contentPanel.add(label_7);
		
		txtTipo = new JTextField();
		txtTipo.setColumns(10);
		txtTipo.setBounds(116, 254, 179, 20);
		contentPanel.add(txtTipo);
		
		JLabel label_8 = new JLabel("Submarca:");
		label_8.setForeground(Color.WHITE);
		label_8.setBounds(23, 288, 73, 14);
		contentPanel.add(label_8);
		
		txtSubmarca = new JTextField();
		txtSubmarca.setColumns(10);
		txtSubmarca.setBounds(116, 285, 179, 20);
		contentPanel.add(txtSubmarca);
		
		JLabel label_9 = new JLabel("Numero de Serie:");
		label_9.setForeground(Color.WHITE);
		label_9.setBounds(23, 316, 96, 14);
		contentPanel.add(label_9);
		
		txtNumeroSerie = new JTextField();
		txtNumeroSerie.setColumns(10);
		txtNumeroSerie.setBounds(116, 313, 179, 20);
		contentPanel.add(txtNumeroSerie);
		
		txtComb = new JTextField();
		txtComb.setColumns(10);
		txtComb.setBounds(448, 49, 179, 20);
		contentPanel.add(txtComb);
		
		JLabel label_10 = new JLabel("Comb:");
		label_10.setForeground(Color.WHITE);
		label_10.setBounds(332, 52, 73, 14);
		contentPanel.add(label_10);
		
		JLabel label_11 = new JLabel("Cilindros:");
		label_11.setForeground(Color.WHITE);
		label_11.setBounds(332, 83, 73, 14);
		contentPanel.add(label_11);
		
		txtCilindros = new JTextField();
		txtCilindros.setColumns(10);
		txtCilindros.setBounds(448, 80, 179, 20);
		contentPanel.add(txtCilindros);
		
		JLabel label_12 = new JLabel("Version:");
		label_12.setForeground(Color.WHITE);
		label_12.setBounds(332, 111, 73, 14);
		contentPanel.add(label_12);
		
		txtVersion = new JTextField();
		txtVersion.setColumns(10);
		txtVersion.setBounds(448, 108, 179, 20);
		contentPanel.add(txtVersion);
		
		JLabel label_13 = new JLabel("Numero del Motor:");
		label_13.setForeground(Color.WHITE);
		label_13.setBounds(332, 142, 106, 14);
		contentPanel.add(label_13);
		
		txtNumeroMotor = new JTextField();
		txtNumeroMotor.setColumns(10);
		txtNumeroMotor.setBounds(448, 139, 179, 20);
		contentPanel.add(txtNumeroMotor);
		
		JLabel label_14 = new JLabel("Servicio:");
		label_14.setForeground(Color.WHITE);
		label_14.setBounds(332, 170, 96, 14);
		contentPanel.add(label_14);
		
		txtServicio = new JTextField();
		txtServicio.setColumns(10);
		txtServicio.setBounds(448, 167, 179, 20);
		contentPanel.add(txtServicio);
		
		txtPuertas = new JTextField();
		txtPuertas.setColumns(10);
		txtPuertas.setBounds(448, 195, 179, 20);
		contentPanel.add(txtPuertas);
		
		JLabel label_15 = new JLabel("Puertas:");
		label_15.setForeground(Color.WHITE);
		label_15.setBounds(332, 198, 73, 14);
		contentPanel.add(label_15);
		
		JLabel label_16 = new JLabel("Modelo:");
		label_16.setForeground(Color.WHITE);
		label_16.setBounds(332, 229, 73, 14);
		contentPanel.add(label_16);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(448, 226, 179, 20);
		contentPanel.add(txtModelo);
		
		JLabel label_17 = new JLabel("N.R.P.V.:");
		label_17.setForeground(Color.WHITE);
		label_17.setBounds(332, 257, 73, 14);
		contentPanel.add(label_17);
		
		txtNRPV = new JTextField();
		txtNRPV.setColumns(10);
		txtNRPV.setBounds(448, 254, 179, 20);
		contentPanel.add(txtNRPV);
		
		JLabel label_18 = new JLabel("Uso:");
		label_18.setForeground(Color.WHITE);
		label_18.setBounds(332, 288, 73, 14);
		contentPanel.add(label_18);
		
		txtUso = new JTextField();
		txtUso.setColumns(10);
		txtUso.setBounds(448, 285, 179, 20);
		contentPanel.add(txtUso);
		
		JLabel label_19 = new JLabel("Pasaj/Kg:");
		label_19.setForeground(Color.WHITE);
		label_19.setBounds(332, 316, 96, 14);
		contentPanel.add(label_19);
		
		txtPasajKg = new JTextField();
		txtPasajKg.setColumns(10);
		txtPasajKg.setBounds(448, 313, 179, 20);
		contentPanel.add(txtPasajKg);
		
		JLabel label_20 = new JLabel("Veh\u00EDculo");
		label_20.setForeground(Color.WHITE);
		label_20.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_20.setBounds(295, 11, 120, 14);
		contentPanel.add(label_20);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.textHighlight);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnCrear = new JButton("Crear");
				btnCrear.setMnemonic('c');
				btnCrear.setActionCommand("OK");
				buttonPane.add(btnCrear);
				getRootPane().setDefaultButton(btnCrear);
			}
			{
				JButton btnCancel = new JButton("Cancel");
				btnCancel.setMnemonic('a');
				btnCancel.setActionCommand("Cancel");
				buttonPane.add(btnCancel);
			}
		}
	}
}
