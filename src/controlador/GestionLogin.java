package controlador;

import javax.swing.JOptionPane;

import modelo.dao.UserDAO;
import modelo.interfaces.InterfaceAcceso;
import vista.LoginScreen;

public class GestionLogin implements InterfaceAcceso{
	public static LoginScreen loginScreen;
	
	
	public GestionLogin() {
		loginScreen = new LoginScreen(this);
	}

	@Override
	public boolean signIn(String username, String password) {
		UserDAO user = new UserDAO();
		if (user.read(username, password) != null) {
			System.out.println("Successful login.");
			JOptionPane.showMessageDialog(null, "Bienvenido.", "Acceso", JOptionPane.INFORMATION_MESSAGE);
			Main.ventanaPrincipal.setVisible(true);
			return true;
		}
		System.out.println("No login.");
		JOptionPane.showMessageDialog(null, "Usuario o contraseņa incorrectos", "Acceso", JOptionPane.INFORMATION_MESSAGE);
		return false;
	}

}
