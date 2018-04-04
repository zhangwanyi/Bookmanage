package bookmanage.biz;

import bookmanage.entity.User;

public interface UserBiz {
	public User checkUser(String name,String password);
}
