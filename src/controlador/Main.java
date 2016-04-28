package controlador;

import javax.swing.UIManager;

import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import vista.VentanaPrincipal;

public class Main {
	private GestionLogin gestionLogin;
	public static VentanaPrincipal ventanaPrincipal;
	
	public Main() {
		gestionLogin = new GestionLogin();
		ventanaPrincipal = new VentanaPrincipal();
	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
		} catch (Exception e) {
			e.printStackTrace();
		}
		new Main();
	}

}