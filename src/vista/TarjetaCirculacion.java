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
import modelo.dto.VehiculoDTO;

public class TarjetaCirculacion extends JDialog {
	private final JPanel contentPanel = new JPanel();
	
	private PropietarioDTO propietario;
	private RecaudadoraDTO recaudadora;
	private VehiculoDTO vehiculo;

	/**
	 * Create the dialog.
	 */
	public TarjetaCirculacion(PropietarioDTO propietario, RecaudadoraDTO recaudadora, VehiculoDTO vehiculo) {
		this.propietario = propietario;
		this.recaudadora = recaudadora;
		this.vehiculo = vehiculo;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.textHighlight);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.textHighlight);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
