package SpringDBTest2;

import java.sql.Connection;
import java.sql.SQLException;

public interface IDBUtil {
	public Connection getConnection() throws ClassNotFoundException, SQLException;
}
