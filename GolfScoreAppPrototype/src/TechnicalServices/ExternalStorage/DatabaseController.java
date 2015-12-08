package TechnicalServices.ExternalStorage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseController {
	
	public void writeToDatabase(String fileName, String data){
		try
		{
			// create a mysql database connection
			String myDriver = "com.mysql.jdbc.Driver";
			String myUrl = "jdbc:mysql://localhost:3307/golf_tracker";
			
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, "root", "ly0qpZkP");
			
			
			// the mysql insert statement
			String query = " insert into round_information (round_name, round_information)"
			+ " values (?, ?)";
			
			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setString (1, fileName);
			preparedStmt.setString (2, data);
	
			// execute the preparedstatement
			preparedStmt.execute();
			conn.close();
		}
			catch(Exception e)
		{
//			System.err.println("Got an exception!");
//			System.err.println(e.getClass().toString() + ": " + e.getMessage());
		}
	}
}
	
