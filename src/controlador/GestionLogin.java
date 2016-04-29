package controlador;

import javax.swing.JOptionPane;

import modelo.dao.UsuarioDAO;
import modelo.interfaces.InterfaceAcceso;
import vista.LoginScreen;

public class GestionLogin implements InterfaceAcceso {
	public static LoginScreen log;
	private UsuarioDAO user;
	
	public GestionLogin() {
		log = new LoginScreen(this);
		user = new UsuarioDAO();
		Main.ventanaPrincipal.add(log);
	}

	@Override
	public boolean signIn(String username, String password) {
		if (user.read(username, password) != null) {
			System.out.println("Successful login.");
			JOptionPane.showMessageDialog(null, "Bienvenido.", "Acceso", JOptionPane.INFORMATION_MESSAGE);
			Main.ventanaPrincipal.loginSuccess();
			return true;
		}
		System.out.println("No login.");
		JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Acceso", JOptionPane.INFORMATION_MESSAGE);
		return false;
	}

}
