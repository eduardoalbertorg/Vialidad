package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBInsert extends DBConnection {
	
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
	
}
