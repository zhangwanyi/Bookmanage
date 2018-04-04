package bookmanage.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

import bookmanage.biz.UserBiz;
import bookmanage.entity.User;

@Component
@Scope("prototype")
public class UserAction extends ActionSupport{
	
	@Autowired
	private UserBiz userBiz;
	
	private String name;
	
	private String password;
	
	private String message;
	
	private User user;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String login() {
		if(user==null) {
			return "login";
		}
		user=userBiz.checkUser(name, password);
		if(user!=null) {
			return SUCCESS;
		}else {
			message="用户名或者密码错误";
			return "login";
		}
	}
}
