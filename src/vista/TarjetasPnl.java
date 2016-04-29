package vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.dto.TarjetaDTO;
import modelo.interfaces.InterfaceTarjeta;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class TarjetasPnl extends JPanel {
	private JTable tblTarjetasCirculacion;
	private InterfaceTarjeta interTarjeta;
	private DefaultTableModel modelo;
	
	@SuppressWarnings("serial")
	public TarjetasPnl(final InterfaceTarjeta interTarjeta) {
		this.interTarjeta = interTarjeta;
		setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPane = new JScrollPane();
		
		tblTarjetasCirculacion = new JTable();
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