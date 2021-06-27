package in.anand.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.anand.app.dao.*;
@Service
public class UserService {
	
	private UserDao userdao;

	@Autowired
	public UserService(UserDao userdao)
	{
		this.userdao=userdao;
	}
	
	
	public UserService() {
		System.out.println("Uservice constructor");
	}


	public void registeruser()
	{
		boolean isSave=userdao.saveUser("aanand@gmail.com", "anand", "anand123");
		
		if(isSave)
		{
			System.out.println("user is saved");
		}else {
			System.out.println("user is not saved");
		}
		
	}
	
	
}
