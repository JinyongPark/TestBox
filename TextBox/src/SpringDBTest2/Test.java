package SpringDBTest2;

import java.sql.SQLException;

public class Test{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		NUserDao dao = new NUserDao();
		
		User user = new User();
		
		user.setId("whiteship");
		user.setName("백기선");
		user.setPassword("married");
		
		dao.add(user);
		
		System.out.println(user.getId() + " 등록성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		
		System.out.println(user2.getId() + " 조회 성공");
		
		
		System.out.println();		
		
	}
	/*public static NUserDao send() {
		NUserDao dao = new NUserDao();
		return dao;		
	}*/
}
