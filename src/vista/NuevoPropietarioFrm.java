package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import modelo.interfaces.InterfacePropietario;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class NuevoPropietarioFrm extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JFormattedTextField ftxtTelefono;
	private JFormattedTextField ftxtCodigoPostal;
	
	private InterfacePropietario interPropietario;
	
	/**
	 * Create the dialog.
	 */
	public NuevoPropietarioFrm(InterfacePropietario interPropietario) {
		this.interPropietario = interPropietario;
		try {
			final MaskFormatter mascaraTelefono = new MaskFormatter("(##)####-##");
			final MaskFormatter mascaraCP = new MaskFormatter("#####");
			mascaraTelefono.setPlaceholderCharacter(' ');
			mascaraCP.setPlaceholderCharacter(' ');
			ftxtTelefono = new JFormattedTextField(mascaraTelefono);
			ftxtCodigoPostal = new JFormattedTextField(mascaraCP);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		setBackground(SystemColor.textHighlight);
		setBounds(100, 100, 310, 276);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.textHighlight);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtNombre = new JTextField();
			txtNombre.setColumns(10);
			txtNombre.setBounds(103, 45, 179, 20);
			contentPanel.add(txtNombre);
		}
		{
			JLabel lblNombre = new JLabel("Nombre(s):");
			lblNombre.setForeground(Color.WHITE);
			lblNombre.setBounds(10, 48, 73, 14);
			contentPanel.add(lblNombre);
		}
		{
			JLabel lblApellido = new JLabel("Apellido:");
			lblApellido.setForeground(Color.WHITE);
			lblApellido.setBounds(10, 79, 73, 14);
			contentPanel.add(lblApellido);
		}
		{
			txtApellido = new JTextField();
			txtApellido.setColumns(10);
			txtApellido.setBounds(103, 76, 179, 20);
			contentPanel.add(txtApellido);
		}
		{
			JLabel lblDireccion = new JLabel("Direccion:");
			lblDireccion.setForeground(Color.WHITE);
			lblDireccion.setBounds(10, 107, 73, 14);
			contentPanel.add(lblDireccion);
		}
		{
			txtDireccion = new JTextField();
			txtDireccion.setColumns(10);
			txtDireccion.setBounds(103, 104, 179, 20);
			contentPanel.add(txtDireccion);
		}
		{
			JLabel lblTelefono = new JLabel("Telefono:");
			lblTelefono.setForeground(Color.WHITE);
			lblTelefono.setBounds(10, 138, 73, 14);
			contentPanel.add(lblTelefono);
		}
		{
			JLabel lblCodigoPostal = new JLabel("Codigo Postal:");
			lblCodigoPostal.setForeground(Color.WHITE);
			lblCodigoPostal.setBounds(10, 166, 96, 14);
			contentPanel.add(lblCodigoPostal);
		}
		{
			JLabel label = new JLabel("Propietario");
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Tahoma", Font.BOLD, 18));
			label.setBounds(103, 11, 120, 20);
			contentPanel.add(label);
		}
		
		ftxtTelefono.setBounds(103, 135, 82, 20);
		contentPanel.add(ftxtTelefono);
		
		ftxtCodigoPostal.setBounds(103, 163, 82, 20);
		contentPanel.add(ftxtCodigoPostal);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.textHighlight);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnCrear = new JButton("Crear");
				btnCrear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (validateFields()) {
							
						}
					}
				});
				btnCrear.setMnemonic('c');
				btnCrear.setActionCommand("OK");
				buttonPane.add(btnCrear);
				getRootPane().setDefaultButton(btnCrear);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancelar.setMnemonic('a');
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
	
	public boolean validateFields() {
		if (txtNombre.getText().equals("") || txtApellido.getText().equals("")
			|| txtDireccion.getText().equals("") || ftxtTelefono.getText().equals("")
			|| ftxtCodigoPostal.getText().equals("")) {
			return false;
		}
		return true;
	}
}
