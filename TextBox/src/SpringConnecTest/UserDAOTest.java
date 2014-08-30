package SpringConnecTest;

import java.sql.Connection;

public class UserDAOTest {

	ConnectionMaker connectionMaker = new TestDBConnector();
	UserDAO user = new UserDAO(connectionMaker);
	
}
