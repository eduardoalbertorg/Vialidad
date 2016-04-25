package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	
    public static void main(String[] args) throws Exception {
    	//getConnection();
    	//insert("asda", "asda");
    }
    
    public static ArrayList<String> select(String[] columns, String database) throws Exception {
    	try {
    		Connection conn = getConnection();
    		PreparedStatement selectStatement = null;
    		ResultSet result = null;
    		String fields = "";
    		int columnsQuantity = columns.length; 
    		for (int i = 0; i < (columnsQuantity - 1); i++) {
    			fields = fields.concat(columns[i] +  ", ");
    		}
    		fields = fields.concat(columns[columnsQuantity]);
    		System.out.println(fields);
    		selectStatement = conn.prepareStatement("SELECT " + fields + " FROM " + database + ";");
    		result = selectStatement.executeQuery();
    		ArrayList<String> selectArray = new ArrayList<String>();
    		while (result.next()) {
    			for (int i = 0; i < columnsQuantity; i++) {
    				selectArray.add(result.getString(i));	
    			}    			
    		}
    		selectStatement.close();
    		result.close();
    		System.out.println("Select completed.");
    		return selectArray;
    	} catch (Exception e) {
    		System.out.println(e);
    	}
    	return null;
    }
    
    public static void insert(String database, String values, String[] columns) throws Exception {
    	try {
    		Connection conn = getConnection();
    		int numberOfColumns = columns.length;
    		String fields = "";
    		for (int i = 0; i < (numberOfColumns - 1); i++) {
    			fields = fields.concat(columns[i] + ", ");
    		}
    		fields = fields.concat(columns[numberOfColumns]);
    		PreparedStatement insertStatement = conn.prepareStatement("INSERT INTO "
    																+ database +  "(" + fields + ") "+ "VALUES ('" + values + "');");
    		insertStatement.executeUpdate();
    		insertStatement.close();
    	} catch (Exception e) {
    		System.out.println(e);
    	} finally {
    		System.out.println("Insert completed.");
    	}
    }
    
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
