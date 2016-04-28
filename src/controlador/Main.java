package controlador;

import vista.VentanaPrincipal;

public class Main {
	private GestionLogin gestionLogin;
	public static VentanaPrincipal ventanaPrincipal;
	
	public Main() {
		gestionLogin = new GestionLogin();
		ventanaPrincipal = new VentanaPrincipal();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}