package vista;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import modelo.interfaces.InterfaceAcceso;

import javax.swing.JPasswordField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginScreen extends JInternalFrame {
	private JTextField txtUsername;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private InterfaceAcceso interAcceso;

	/**
	 * Create the frame.
	 */
	public LoginScreen(final InterfaceAcceso interAcceso) {
		this.interAcceso = interAcceso;
		getContentPane().setBackground(SystemColor.textHighlight);
		setBounds(100, 100, 212, 124);
		setSize(210, 130);
		getContentPane().setLayout(null);
		
		Action actionPressEnter = new AbstractAction()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	if (btnLogin.isEnabled()) {
		    		String username = txtUsername.getText();
					String password = String.valueOf(passwordField.getPassword());
					if (interAcceso.signIn(username, password)) {
						dispose();
					}
					passwordField.setText("");	
				}				
		    }
		};
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(10, 14, 63, 14);
		getContentPane().add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(83, 11, 101, 20);
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
		txtUsername.addActionListener(actionPressEnter);
		getContentPane().add(txtUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(12, 39, 61, 14);
		getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(83, 36, 101, 20);
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
		passwordField.addActionListener(actionPressEnter);
		getContentPane().add(passwordField);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(actionPressEnter);
		btnLogin.setEnabled(false);
		btnLogin.setMnemonic('l');
		btnLogin.setBounds(8, 64, 82, 23);
		getContentPane().add(btnLogin);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(null, "¿Estás seguro?");
				if (option == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		});
		btnClose.setMnemonic('c');
		btnClose.setBounds(93, 64, 84, 23);
		getContentPane().add(btnClose);
		
		setVisible(true);
	}
	
	private void allowLogin() {
		if ((!txtUsername.getText().equals("") || !String.valueOf(passwordField.getPassword()).equals(""))
				&& (txtUsername.getText().length() > 3 && String.valueOf(passwordField.getPassword()).length() > 3)) {
			btnLogin.setEnabled(true);
		} else {
			btnLogin.setEnabled(false);
		}
	}
	
}
