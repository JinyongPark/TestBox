package SpringConnecTest;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDAO {
	private ConnectionMaker connectionMaker;
	
	public UserDAO(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}	
	public void add() throws ClassNotFoundException, SQLException {
		Connection c = connectionMaker.makeNewConnection();
		if(c != null) {
			System.out.println("Connection 성공!");
		}		
		System.out.println("add메소드 실행");
	}
	public void get() throws ClassNotFoundException, SQLException {
		Connection c = connectionMaker.makeNewConnection();
		if(c != null) {
			System.out.println("Connection 성공!");
		}		
		System.out.println("get메소드 실행");
	}	
}
