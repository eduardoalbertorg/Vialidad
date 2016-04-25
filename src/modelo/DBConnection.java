package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
    
    public static Connection getConnection() throws Exception {
    	try {
    		String driver = "com.mysql.jdbc.Driver";
    		String url = "jdbc:mysql://localhost:3306/vialidad";
    		String username = "root";
    		String password = "asda";
    		Class.forName(driver);    		
    		Connection conn = DriverManager.getConnection(url, username, password);
    		System.out.println("Connected");
    		return conn;
    	} catch (SQLException ex) {
    	    // handle any errors
    	    System.out.println("SQLException: " + ex.getMessage());
    	    System.out.println("SQLState: " + ex.getSQLState());
    	    System.out.println("VendorError: " + ex.getErrorCode());
    	}
    	return null;
    }

}
