package controlador;

import modelo.interfaces.InterfaceAcceso;
import vista.LoginScreen;

public class GestionLogin implements InterfaceAcceso{
	public static LoginScreen loginScreen;
	
	public GestionLogin() {
		loginScreen = new LoginScreen(this);
	}

	@Override
	public void signIn() {
		
	}

}
