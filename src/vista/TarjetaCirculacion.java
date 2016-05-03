package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.dto.PropietarioDTO;
import modelo.dto.RecaudadoraDTO;
import modelo.dto.TarjetaDTO;
import modelo.dto.VehiculoDTO;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.ActionEvent;

public class TarjetaCirculacion extends JDialog {
	private final JPanel contentPanel = new JPanel();
	
	private PropietarioDTO propietario;
	private RecaudadoraDTO recaudadora;
	private VehiculoDTO vehiculo;
	private TarjetaDTO tarjeta;

	/**
	 * Create the dialog.
	 */
	public TarjetaCirculacion(PropietarioDTO propietario, RecaudadoraDTO recaudadora, VehiculoDTO vehiculo, TarjetaDTO tarjeta) {
		this.propietario = propietario;
		this.recaudadora = recaudadora;
		this.vehiculo = vehiculo;
		this.tarjeta = tarjeta;
		setBounds(100, 100, 820, 578);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.window);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblPropietario = new JLabel(propietario.getNombre() + " " + propietario.getApellido());
		lblPropietario.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPropietario.setBounds(100, 144, 286, 19);
		contentPanel.add(lblPropietario);

		JLabel lblRecaudadora = new JLabel(recaudadora.getNombre());
		lblRecaudadora.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRecaudadora.setBounds(118, 200, 98, 19);
		contentPanel.add(lblRecaudadora);

		JLabel lblLugarFecha = new JLabel(recaudadora.getDireccion() + " " + tarjeta.getDate());
		lblLugarFecha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLugarFecha.setBounds(201, 173, 278, 19);
		contentPanel.add(lblLugarFecha);

		JLabel lblIdTarjeta = new JLabel(String.valueOf(tarjeta.getId()));
		lblIdTarjeta.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdTarjeta.setBounds(562, 173, 98, 19);
		contentPanel.add(lblIdTarjeta);

		JLabel lblCodigoPostal = new JLabel(propietario.getCodigoPostal());
		lblCodigoPostal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCodigoPostal.setBounds(696, 144, 98, 19);
		contentPanel.add(lblCodigoPostal);

		JLabel lblIdVehiculo = new JLabel(String.valueOf(vehiculo.getId()));
		lblIdVehiculo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdVehiculo.setBounds(601, 200, 98, 19);
		contentPanel.add(lblIdVehiculo);

		JLabel lblPlacas = new JLabel(vehiculo.getPlacas());
		lblPlacas.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPlacas.setBounds(77, 248, 98, 19);
		contentPanel.add(lblPlacas);

		JLabel lblMarca = new JLabel(vehiculo.getMarca());
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMarca.setBounds(77, 278, 98, 19);
		contentPanel.add(lblMarca);

		JLabel lblSubmarca = new JLabel(vehiculo.getSubmarca());
		lblSubmarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubmarca.setBounds(139, 308, 98, 19);
		contentPanel.add(lblSubmarca);

		JLabel lblVersion = new JLabel(vehiculo.getVersion());
		lblVersion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVersion.setBounds(77, 334, 98, 19);
		contentPanel.add(lblVersion);

		JLabel lblModelo = new JLabel(vehiculo.getModelo());
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblModelo.setBounds(77, 361, 98, 19);
		contentPanel.add(lblModelo);

		JLabel lblColor1 = new JLabel(vehiculo.getColor1());
		lblColor1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblColor1.setBounds(323, 248, 98, 19);
		contentPanel.add(lblColor1);

		JLabel lblColor2 = new JLabel(vehiculo.getColor2());
		lblColor2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblColor2.setBounds(323, 278, 98, 19);
		contentPanel.add(lblColor2);

		JLabel lblNumeroSerie = new JLabel(vehiculo.getNumeroSerie());
		lblNumeroSerie.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumeroSerie.setBounds(323, 308, 98, 19);
		contentPanel.add(lblNumeroSerie);

		JLabel lblNumeroMotor = new JLabel(vehiculo.getNumeroMotor());
		lblNumeroMotor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumeroMotor.setBounds(323, 334, 98, 19);
		contentPanel.add(lblNumeroMotor);

		JLabel lblNrpv = new JLabel(vehiculo.getNrpv());
		lblNrpv.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNrpv.setBounds(357, 361, 98, 19);
		contentPanel.add(lblNrpv);

		JLabel lblMov = new JLabel(vehiculo.getMov());
		lblMov.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMov.setBounds(562, 248, 98, 19);
		contentPanel.add(lblMov);

		JLabel lblProced = new JLabel(vehiculo.getProced());
		lblProced.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProced.setBounds(584, 278, 76, 19);
		contentPanel.add(lblProced);

		JLabel lblComb = new JLabel(vehiculo.getComb());
		lblComb.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComb.setBounds(584, 308, 76, 19);
		contentPanel.add(lblComb);

		JLabel lblServicio = new JLabel(vehiculo.getServicio());
		lblServicio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblServicio.setBounds(584, 334, 76, 19);
		contentPanel.add(lblServicio);

		JLabel lblUso = new JLabel(vehiculo.getUso());
		lblUso.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUso.setBounds(584, 361, 76, 19);
		contentPanel.add(lblUso);

		JLabel lblClase = new JLabel(vehiculo.getClase());
		lblClase.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClase.setBounds(718, 248, 76, 19);
		contentPanel.add(lblClase);

		JLabel lblTipo = new JLabel(vehiculo.getTipo());
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTipo.setBounds(700, 278, 25, 19);
		contentPanel.add(lblTipo);

		JLabel lblCc = new JLabel(vehiculo.getCc());
		lblCc.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCc.setBounds(757, 278, 25, 19);
		contentPanel.add(lblCc);

		JLabel lblCilindros = new JLabel(vehiculo.getCilindros());
		lblCilindros.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCilindros.setBounds(734, 308, 60, 19);
		contentPanel.add(lblCilindros);

		JLabel lblPuertas = new JLabel(vehiculo.getPuertas());
		lblPuertas.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPuertas.setBounds(722, 334, 60, 19);
		contentPanel.add(lblPuertas);

		JLabel lblPasajKg = new JLabel(vehiculo.getPasaj());
		lblPasajKg.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPasajKg.setBounds(739, 361, 44, 19);
		contentPanel.add(lblPasajKg);

		JPanel buttonPane = new JPanel();
		buttonPane.setBackground(SystemColor.window);
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		JButton okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon("C:\\Users\\Hemad\\workspace\\Vialidad\\src\\imagenes\\TarjetaCirculacion.jpg"));
		lblBackground.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBackground.setBounds(0, 0, 800, 504);

		contentPanel.add(lblBackground);
		
	}
}
