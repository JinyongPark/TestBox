package SpringConnecTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDBConnector implements ConnectionMaker {

	@Override
	public Connection makeNewConnection() throws ClassNotFoundException,
			SQLException {	
			
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection(
				"jdbc:mysql://localhost/springtest", "root" , "java1234");
		return c;	
	}

}
