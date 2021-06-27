package in.anand.app.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	public UserDao() {
		System.out.println("constructor from app.dao");// TODO Auto-generated constructor stub
	}
	
	public boolean saveUser(String email,String username,String password)
	{
		
		return true;
	}

}
