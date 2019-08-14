package com.neuedu.date14;

import java.util.Scanner;

/**
* @ClassName: UserViewImpl
* @Description: �û���ͼ�ӿ�ʵ��
* @author student_dt
* @date 2019��8��14�� ����3:26:52
*
*/
public class UserViewImpl implements UserView {
	private Scanner scanner = new Scanner(System.in);
	
	private UserBizImpl userBizImpl = new UserBizImpl();
	@Override
	public void login() {
		System.out.println("�����������û�����");
		String userName = scanner.next();
		System.out.println("�������������룺");
		String password = scanner.next();
		userBizImpl.login(userName, password);
	}

	@Override
	public void register() {
		System.out.println("�����������û�����");
		String userName = scanner.next();
		System.out.println("�������������룺");
		String password = scanner.next();
		System.out.println("��ȷ���������룺");
		String password2 = scanner.next();
		userBizImpl.register(userName, password, password2);
	}

}
