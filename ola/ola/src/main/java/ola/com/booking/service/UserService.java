package ola.com.booking.service;

import ola.com.booking.model.User;

public interface UserService {

	public void saveUser(User user);
	public User validateUser(String name, String password);

	//public boolean validateUser(String username, String password);
}
