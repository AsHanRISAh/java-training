package ola.com.booking.dao;

import ola.com.booking.model.User;

public interface UserDao {

	void saveUser(User user);
    User validateUser(String name, String password);
  //  boolean validateUser(String username, String password);
    
}
