package vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.interfaces.InterfaceTarjeta;
import java.awt.GridLayout;

public class TarjetasPnl extends JPanel {
	private JTable tblTarjetasCirculacion;
	private InterfaceTarjeta interTarjeta;
	
	public TarjetasPnl(InterfaceTarjeta interTarjeta) {
		this.interTarjeta = interTarjeta;
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		
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
		setVisible(true);
	}
	
	
}