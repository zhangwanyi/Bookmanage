package bookmanage.dao;

import bookmanage.entity.User;

public interface UserDao {
	public User checkUser(String name,String password);
}
