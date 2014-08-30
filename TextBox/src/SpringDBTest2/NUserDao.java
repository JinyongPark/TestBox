package SpringDBTest2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NUserDao extends UserDao{

	@Override
	public Connection getConnection() throws ClassNotFoundException,
			SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection(
				"jdbc:mysql://localhost/springtest", "root" , "java1234");
		return c;		
	}	
}
