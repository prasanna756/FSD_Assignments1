package dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	public static Connection getDBConnection() {
		Connection conn = null;
		
		try {
		FileReader reader = new FileReader("resources/database.properties");
		Properties properties= new Properties();
		properties.load(reader);
		String driverclass = properties.getProperty("driverclass");
		
		String url= properties.getProperty("url");
		String username= properties.getProperty("username");
		String password= properties.getProperty("password");
		
		try {
			//step1
			Class.forName(driverclass);

			// step2
			 conn = DriverManager.getConnection(url,username,password);
		}
			 catch (ClassNotFoundException e) {

					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		return conn;	
}
		catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}