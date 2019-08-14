package com.neuedu.date14;

/**
* @ClassName: UserBizLmpl
* @Description: 用户接口实现
* @author student_dt
* @date 2019年8月14日 下午12:02:15
*
*/
public class UserBizImpl implements UserBiz{
	// 创建数组存放用户
	public static User[] users = {
			new User("admin","admin","Administrator","admin@123.com"),
			new User("tom","cat","tomcat","tomcat@cat.com")
	};
	

	@Override
	public void register(String username, String password, String password2) {
		// 用户名存在输出错误信息
		boolean checkUesrNameIsExists = checkUesrNameIsExists(username);
		if(checkUesrNameIsExists) {
			System.err.println("用户名已存在");
			return;
		}
		// 判断两次密码是否一致
		if(!password.equals(password2)) {
			System.err.println("两次密码输入不一致，请重新输入");
			return;
		}
		
	}

	@Override
	public void login(String username, String password) {
		// 用户名不存在信息错误
		boolean checkUesrNameIsExists = checkUesrNameIsExists(username);
		if(!checkUesrNameIsExists) {
			System.err.println("用户名不存在。。。请重新输入");
			return;
		}
		String realpassword = queryPasswordByUserName(username);
		if(!realpassword.equals(password)) {
			System.err.println("密码错误");
			return;
		}
		
		
	}
	// 根据用户名查询密码
	private String queryPasswordByUserName(String userName) {
		for(int i=0;i<users.length;i++) {
			if(userName.equals(users[i].getUsername())) {
				return users[i].getUsername();
			}
		}
		return null;
	}
	// 检查用户名是否存在
	private boolean checkUesrNameIsExists(String userName) {
		for(int i=0;i<users.length;i++) {
			if(userName.equals(users[i].getUsername())) {
				return true;
			}
		}
		return false;
	}
	
	

}
