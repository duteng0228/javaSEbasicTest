package com.neuedu.date14;

import java.util.Scanner;

/**
* @ClassName: UserViewImpl
* @Description: 用户视图接口实现
* @author student_dt
* @date 2019年8月14日 下午3:26:52
*
*/
public class UserViewImpl implements UserView {
	private Scanner scanner = new Scanner(System.in);
	
	private UserBizImpl userBizImpl = new UserBizImpl();
	@Override
	public void login() {
		System.out.println("请输入您的用户名：");
		String userName = scanner.next();
		System.out.println("请输入您的密码：");
		String password = scanner.next();
		userBizImpl.login(userName, password);
	}

	@Override
	public void register() {
		System.out.println("请输入您的用户名：");
		String userName = scanner.next();
		System.out.println("请输入您的密码：");
		String password = scanner.next();
		System.out.println("请确认您的密码：");
		String password2 = scanner.next();
		userBizImpl.register(userName, password, password2);
	}

}
