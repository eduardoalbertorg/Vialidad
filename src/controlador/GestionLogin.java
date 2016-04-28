package controlador;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JOptionPane;

import modelo.dao.UserDAO;
import modelo.interfaces.InterfaceAcceso;
import vista.LoginScreenPnl;

public class GestionLogin implements InterfaceAcceso {
	public static LoginScreenPnl loginScreen;
	private UserDAO user;	
	
	public GestionLogin() {
		loginScreen = new LoginScreenPnl(this);
		user = new UserDAO();
		
		Main.ventanaPrincipal.getPanel().removeAll();
		Main.ventanaPrincipal.getPanel().setLayout(new FlowLayout());
		Main.ventanaPrincipal.getPanel().add(loginScreen);
		Main.ventanaPrincipal.getPanel().updateUI();
	}

	@Override
	public boolean signIn(String username, String password) {
		if (user.read(username, password) != null) {
			System.out.println("Successful login.");
			JOptionPane.showMessageDialog(null, "Bienvenido.", "Acceso", JOptionPane.INFORMATION_MESSAGE);
			return true;
		}
		System.out.println("No login.");
		JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Acceso", JOptionPane.INFORMATION_MESSAGE);
		return false;
	}

}
