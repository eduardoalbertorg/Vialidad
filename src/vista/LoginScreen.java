package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import modelo.interfaces.InterfaceAcceso;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginScreen extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField txtUsername;
	private JButton btnLogin = new JButton("Login");
	private InterfaceAcceso interAcceso;

	/**
	 * Create the frame.
	 */
	public LoginScreen(InterfaceAcceso interAcceso) {
		this.interAcceso = interAcceso;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 232, 145);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		passwordField.setBounds(107, 42, 100, 20);
		contentPane.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(10, 42, 71, 14);
		contentPane.add(lblPassword);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(10, 11, 71, 14);
		contentPane.add(lblUsername);
		
		txtUsername = new JTextField();
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
		txtUsername.setBounds(107, 11, 100, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		btnLogin.setEnabled(false);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] loginInfo = {"username", "password"};
				try {	
				} catch (Exception e) {
				
				}				
			}
		});
		btnLogin.setBounds(20, 73, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(117, 73, 89, 23);
		contentPane.add(btnClose);
		
		setVisible(true); // Muestra la ventana
		setLocationRelativeTo(null); // Centra la ventana
	}

	private void allowLogin() {
		if (txtUsername.getText().equals("") || String.valueOf(passwordField.getPassword()).equals("")) {
			btnLogin.setEnabled(false);
		} else {
			btnLogin.setEnabled(true);
		}
	}
}