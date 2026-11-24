package database_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database_connection {
	
	String url="jdbc:mysql://localhost:3306/college_db";
	String username="root";
	String password="root";
	
	public Connection conn() {
		
		Connection con=null;
		try {
			con=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return con;
	}
	
	
	
}
