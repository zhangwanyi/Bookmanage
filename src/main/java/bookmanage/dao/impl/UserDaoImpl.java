package bookmanage.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import bookmanage.dao.UserDao;
import bookmanage.entity.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private HibernateTemplate hi;
	
	public User checkUser(String name, String password) {
		List<User> list=(List<User>)hi.find("from User u where u.name=? and u.password=?",name,password);
		if(list.size()>0) {
			return list.get(0);
		}else {
			return null;
		}
	}

}
