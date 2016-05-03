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

public class TarjetasPnl extends JPanel {
	private JTable tblTarjetasCirculacion;
	private InterfaceTarjeta interTarjeta;
	private DefaultTableModel modelo;
	private TarjetaCirculacion tarjetaCirculacion;
	private PropietarioDTO propietario;
	private RecaudadoraDTO recaudadora;
	private VehiculoDTO vehiculo;
	
	
	@SuppressWarnings("serial")
	public TarjetasPnl(final InterfaceTarjeta interTarjeta) {
		this.interTarjeta = interTarjeta;
		setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPane = new JScrollPane();
		
		tblTarjetasCirculacion = new JTable();
		tblTarjetasCirculacion.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getClickCount() == 2) {
					JTable valorEnTabla = (JTable)e.getSource();
					int row = valorEnTabla.getSelectedRow();
					int column = valorEnTabla.getSelectedColumn();
					int idTarjeta = (int)valorEnTabla.getValueAt(row, column);
					PropietarioDAO propietarioDAO = new PropietarioDAO();
					RecaudadoraDAO recaudadoraDAO = new RecaudadoraDAO();
					VehiculoDAO vehiculoDAO = new VehiculoDAO();
					propietario = interTarjeta.getTarjeta(idTarjeta).getPropietario();
					recaudadora = interTarjeta.getTarjeta(idTarjeta).getRecaudadora();
					vehiculo = interTarjeta.getTarjeta(idTarjeta).getVehiculo();
					tarjetaCirculacion = new TarjetaCirculacion(propietario, recaudadora, vehiculo);
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
		this.add(scrollPane);
		this.setBounds(0, 0, 752, 341);
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