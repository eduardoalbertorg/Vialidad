package vista;

import java.awt.Dialog;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.dao.PropietarioDAO;
import modelo.dao.RecaudadoraDAO;
import modelo.dao.VehiculoDAO;
import modelo.dto.PropietarioDTO;
import modelo.dto.RecaudadoraDTO;
import modelo.dto.TarjetaDTO;
import modelo.dto.VehiculoDTO;
import modelo.interfaces.InterfaceTarjeta;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TarjetasPnl extends JPanel {
	private JTable tblTarjetasCirculacion;
	private InterfaceTarjeta interTarjeta;
	private DefaultTableModel modelo;
	private TarjetaCirculacion tarjetaCirculacion;
	private PropietarioDTO propietario;
	private RecaudadoraDTO recaudadora;
	private VehiculoDTO vehiculo;
	private JTextField txtBuscar;
	private JRadioButton rdbtnPlacas;
	private JRadioButton rdbtnPropietario;
	
	
	@SuppressWarnings("serial")
	public TarjetasPnl(final InterfaceTarjeta interTarjeta) {
		this.interTarjeta = interTarjeta;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		rdbtnPropietario = new JRadioButton("Propietario");
		rdbtnPropietario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnPropietario.setSelected(true);
				rdbtnPlacas.setSelected(false);
			}
		});
		
		rdbtnPlacas = new JRadioButton("Placas");
		rdbtnPlacas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnPropietario.setSelected(false);
				rdbtnPlacas.setSelected(true);
			}
		});
		panel.add(rdbtnPlacas);
		panel.add(rdbtnPropietario);
		
		JLabel lblBuscar = new JLabel("Buscar:");
		panel.add(lblBuscar);
		
		txtBuscar = new JTextField();
		panel.add(txtBuscar);
		txtBuscar.setColumns(20);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String valorABuscar = txtBuscar.getText();
				if (valorABuscar.equals("")) {
					
				}
			}
		});
		btnBuscar.setMnemonic('b');
		panel.add(btnBuscar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// Limpiar
				
			}
		});
		btnLimpiar.setMnemonic('l');
		panel.add(btnLimpiar);
		this.setBounds(0, 0, 752, 341);
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		tblTarjetasCirculacion = new JTable();
		tblTarjetasCirculacion.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getClickCount() == 2) {
					JTable valorEnTabla = (JTable)e.getSource();
					int row = valorEnTabla.getSelectedRow();
					int idTarjeta = (int)valorEnTabla.getValueAt(row, 0);
					TarjetaDTO tarjeta = new TarjetaDTO();
					PropietarioDAO propietarioDAO = new PropietarioDAO();
					RecaudadoraDAO recaudadoraDAO = new RecaudadoraDAO();
					VehiculoDAO vehiculoDAO = new VehiculoDAO();
					tarjeta = interTarjeta.getTarjeta(idTarjeta);
					
					propietario = propietarioDAO.read(tarjeta.getIdPropietario());
					recaudadora = recaudadoraDAO.read(tarjeta.getIdRecaudadora());
					vehiculo = vehiculoDAO.read(tarjeta.getIdVehiculo());
					tarjetaCirculacion = new TarjetaCirculacion(propietario, recaudadora, vehiculo, tarjeta);
					tarjetaCirculacion.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
					tarjetaCirculacion.setVisible(true);
				}
			}
		});
		tblTarjetasCirculacion.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Recaudadora", "Propietario", "Placas", "Marca", "Submarca", "Modelo", "Color"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblTarjetasCirculacion.getColumnModel().getColumn(2).setPreferredWidth(106);
		scrollPane.setViewportView(tblTarjetasCirculacion);
		modelo = (DefaultTableModel) tblTarjetasCirculacion.getModel();
		updateTable();
		setVisible(true);
	}
	
	public void updateTable() {
		if (modelo.getRowCount() > 0) {
			eraseTable();
		}
		for (TarjetaDTO tarjeta : interTarjeta.getTarjetas()) {
			modelo.addRow(new Object[]{tarjeta.getId(), tarjeta.getRecaudadora().getNombre(),
					tarjeta.getPropietario().getNombre() + " " + tarjeta.getPropietario().getApellido(),
					tarjeta.getVehiculo().getPlacas(), tarjeta.getVehiculo().getMarca(),
					tarjeta.getVehiculo().getSubmarca(), tarjeta.getVehiculo().getModelo(), tarjeta.getVehiculo().getColor1()});
		}
	}	
	
	public void eraseTable() {
		for (int i = 0; i < interTarjeta.getTarjetas().size(); i++) {
			modelo.removeRow(0);
		}
	}
	
}