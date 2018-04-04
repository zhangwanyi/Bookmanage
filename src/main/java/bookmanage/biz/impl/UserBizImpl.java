package bookmanage.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookmanage.biz.UserBiz;
import bookmanage.dao.UserDao;
import bookmanage.entity.User;

@Service
public class UserBizImpl implements UserBiz{
	
	@Autowired
	private UserDao userDao;

	@Override
	public User checkUser(String name, String password) {
		return userDao.checkUser(name, password);
	}
}
