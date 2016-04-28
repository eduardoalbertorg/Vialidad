package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controlador.GestionTarjetas;
import modelo.interfaces.InterfaceTarjeta;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class VentanaPrincipal extends JFrame {
	private GestionTarjetas gestionTarjetas;
	private InterfaceTarjeta interTarjeta;
	private JPanel pnlPrincipal = new JPanel();

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
				gestionTarjetas = new GestionTarjetas();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 423);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		mnArchivo.setMnemonic('A');
		menuBar.add(mnArchivo);
		
		JMenu mnNuevo = new JMenu("Nuevo");
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
		pnlPrincipal.setBounds(0, 0, 772, 363);
		
		getContentPane().add(pnlPrincipal);
	}	
	
	public JPanel getPanel() {
		return pnlPrincipal;
	}
	
	public void setPanel(JPanel panel) {
		this.pnlPrincipal = panel;
	}
	
}