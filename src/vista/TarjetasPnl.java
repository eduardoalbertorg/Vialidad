package vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TarjetasPnl extends JPanel {
	private JTable tblTarjetasCirculacion;
	
	public TarjetasPnl() {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 752, 341);
		
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
		this.add(scrollPane);
		this.setBounds(0, 0, 752, 341);
	}
}
