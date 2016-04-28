package vista;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import modelo.interfaces.InterfaceAcceso;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class LoginScreenPnl extends JPanel {
	private JPasswordField passwordField;
	private JTextField txtUsername;
	private InterfaceAcceso interAcceso;
	JButton btnLogin = new JButton("Login");

	/**
	 * Create the panel.
	 */
	public LoginScreenPnl(final InterfaceAcceso interAcceso) {
		this.interAcceso = interAcceso;
		setBackground(SystemColor.textHighlight);
		
		passwordField = new JPasswordField();
		passwordField.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent e) {
				allowLogin();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				allowLogin();				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				allowLogin();				
			}
			
		});
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(Color.WHITE);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent e) {
				allowLogin();
			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				allowLogin();
			}

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				allowLogin();				
			}
		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = String.valueOf(passwordField.getPassword());
				if (interAcceso.signIn(username, password)) {
					//dispose();
				}
				passwordField.setText("");
			}
		});

		
		btnLogin.setMnemonic('L');
		btnLogin.setEnabled(false);
		
		JButton btnClose = new JButton("Close");
		btnClose.setMnemonic('C');
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(8)
					.addComponent(lblUsername)
					.addGap(5)
					.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(lblPassword)
					.addGap(5)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(52)
					.addComponent(btnLogin)
					.addGap(5)
					.addComponent(btnClose))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblUsername))
						.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblPassword))
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLogin)
						.addComponent(btnClose)))
		);
		setLayout(groupLayout);

	}
	
	private void allowLogin() {
		if (txtUsername.getText().equals("") || String.valueOf(passwordField.getPassword()).equals("")) {
			btnLogin.setEnabled(false);
		} else {
			btnLogin.setEnabled(true);
		}
	}
}
