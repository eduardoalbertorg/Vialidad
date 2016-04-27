package modelo.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	/* 
	 * Pregunta si la instancia ya esta creada
	 * para usar la misma y si no se crea
	 * una nueva
	 */
	public static Conexion instance; // Singleton
	private Connection cnn;
	
	/*
	 * Constructor privado
	 * para no crear instancias desde afuera
	 */
	private Conexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // driver
			cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vialidad", "root", "asda");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * Unica forma de crear una conexion y que aplica el Singleton.
	 * La palabra synchronized hace una lista de espera para que
	 * si hay muchos usuarios, estos esperen su turno hasta que termine
	 * el usuario que lo está usando
	 */
	public synchronized static Conexion saberEstado() {
		if (instance == null) {
			instance = new Conexion();
		}
		return instance;
	}
	
	public Connection getConnection() {
		return cnn;
	}
	
	public void cerrarConexion() {
		instance = null;
	}
}
