package controlador;

import vista.LoginScreen;

public class Main {
	private LoginScreen logScreen;
	
	public Main() {
		logScreen = new LoginScreen();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}