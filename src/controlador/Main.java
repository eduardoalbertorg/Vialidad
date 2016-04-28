package controlador;

import javax.swing.UIManager;

import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import vista.VentanaPrincipal;

public class Main {
	private GestionLogin gestionLogin;
	public static VentanaPrincipal ventanaPrincipal;
	
	public Main() {
		ventanaPrincipal = new VentanaPrincipal();
		ventanaPrincipal.setVisible(true);
		gestionLogin = new GestionLogin();		
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