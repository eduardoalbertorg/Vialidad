package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBSelect extends DBConnection {
	
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

}
