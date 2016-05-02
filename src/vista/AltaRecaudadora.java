package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import modelo.dto.RecaudadoraDTO;
import modelo.interfaces.InterfaceRecaudadora;

import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaRecaudadora extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtDireccion;
	private JTextField txtNombre;
	private JFormattedTextField fTxtTelefono;
	private JFormattedTextField fTxtCodigoPostal;

	private RecaudadoraDTO recaudadora;
	private InterfaceRecaudadora interRecaudadora;

	/**
	 * Create the dialog.
	 */
	public AltaRecaudadora(final InterfaceRecaudadora interRecaudadora) {
		setBounds(100, 100, 312, 226);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.textHighlight);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.interRecaudadora = interRecaudadora;
		try {
			final MaskFormatter mascaraTelefono = new MaskFormatter("(##)####-##");
			final MaskFormatter mascaraCP = new MaskFormatter("#####");
			mascaraTelefono.setPlaceholderCharacter(' ');
			mascaraCP.setPlaceholderCharacter(' ');
			fTxtTelefono = new JFormattedTextField(mascaraTelefono);
			fTxtCodigoPostal = new JFormattedTextField(mascaraCP);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(103, 36, 179, 20);
		contentPanel.add(txtNombre);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(10, 39, 73, 14);
		contentPanel.add(lblNombre);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setForeground(Color.WHITE);
		lblDireccion.setBounds(10, 67, 73, 14);
		contentPanel.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(103, 64, 179, 20);
		contentPanel.add(txtDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setBounds(10, 98, 73, 14);
		contentPanel.add(lblTelefono);
		
		JLabel lblCodigoPostal = new JLabel("Codigo Postal:");
		lblCodigoPostal.setForeground(Color.WHITE);
		lblCodigoPostal.setBounds(10, 129, 96, 14);
		contentPanel.add(lblCodigoPostal);
		
		JLabel label_4 = new JLabel("Recaudadora");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(88, 11, 120, 14);
		contentPanel.add(label_4);
		
		fTxtTelefono.setBounds(103, 95, 82, 20);
		contentPanel.add(fTxtTelefono);
		
		fTxtCodigoPostal.setBounds(103, 123, 82, 20);
		contentPanel.add(fTxtCodigoPostal);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.textHighlight);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnCrear = new JButton("Crear");
				btnCrear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (validateFields()) {
							recaudadora = new RecaudadoraDTO(
									txtNombre.getText(), txtDireccion.getText(), 
									fTxtTelefono.getText(), fTxtCodigoPostal.getText());
							if (interRecaudadora.createRecaudadora(recaudadora)) {
								JOptionPane.showMessageDialog(null, "Recaudadora registrada.", "Alta recaudadora", JOptionPane.INFORMATION_MESSAGE);
								dispose();
							}
						} else {
							JOptionPane.showMessageDialog(null, "Lllene todos los campos.", "Alta recaudadora", JOptionPane.INFORMATION_MESSAGE);
						}
					}
				});
				btnCrear.setMnemonic('c');
				btnCrear.setActionCommand("OK");
				buttonPane.add(btnCrear);
				getRootPane().setDefaultButton(btnCrear);
			}
			{
				JButton btnCancel = new JButton("Cancelar");
				btnCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancel.setMnemonic('a');
				btnCancel.setActionCommand("Cancel");
				buttonPane.add(btnCancel);
			}
		}
	}
	
	public boolean validateFields() {
		if (txtNombre.getText().equals("") || txtDireccion.getText().equals("") 
			|| fTxtTelefono.getText().equals("") || fTxtCodigoPostal.getText().equals("")) {
			return false;
		}
		return true;
	}
	
}
