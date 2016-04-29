package vista;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import controlador.GestionTarjetas;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.CardLayout;

public class VentanaPrincipal extends JFrame {
	private GestionTarjetas gestionTarjetas;
	private JPanel mainPnl;
	private JMenu mnNuevo;
	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 423);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		mnArchivo.setMnemonic('A');
		menuBar.add(mnArchivo);
		
		mnNuevo = new JMenu("Nuevo");
		mnNuevo.setEnabled(false);
		mnNuevo.setMnemonic('N');
		mnArchivo.add(mnNuevo);
		
		JMenuItem mntmPropietario = new JMenuItem("Propietario");
		mnNuevo.add(mntmPropietario);
		
		JMenuItem mntmRecaudadora = new JMenuItem("Recaudadora");
		mnNuevo.add(mntmRecaudadora);
		
		JMenuItem mntmTarjeta = new JMenuItem("Tarjeta");
		mnNuevo.add(mntmTarjeta);
		
		JMenuItem mntmVehiculo = new JMenuItem("Vehiculo");
		mnNuevo.add(mntmVehiculo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int option = JOptionPane.showConfirmDialog(null, "¿Estás seguro?");
				if (option == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		});
		mnArchivo.add(mntmSalir);
		getContentPane().setLayout(null);
	}
	
	public void loginSuccess() {
		mnNuevo.setEnabled(true);
		getContentPane().setLayout(new CardLayout());
		gestionTarjetas = new GestionTarjetas();
	}
	
	public JPanel getMainPnl() {
		return mainPnl;
	}
	
	public void setMainPnl(JPanel panel) {
		this.mainPnl = panel;
	}
	
}