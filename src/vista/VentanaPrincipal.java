package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTable tblTarjetasCirculacion;

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
		mnArchivo.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 752, 341);
		contentPane.add(scrollPane);
		
		tblTarjetasCirculacion = new JTable();
		tblTarjetasCirculacion.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Propietario", "Placas", "Marca", "Submarca", "Modelo", "Color"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(tblTarjetasCirculacion);
	}
}