package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getDBConnection() {
		Connection conn = null;
		try {
			//step1
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step2
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware_db", "root",
					"root1234");
		}
			 catch (ClassNotFoundException e) {

					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		return conn;	
	}

}
