package com.neuedu.date14;

/**
* @ClassName: UserBizLmpl
* @Description: �û��ӿ�ʵ��
* @author student_dt
* @date 2019��8��14�� ����12:02:15
*
*/
public class UserBizImpl implements UserBiz{
	// �����������û�
	public static User[] users = {
			new User("admin","admin","Administrator","admin@123.com"),
			new User("tom","cat","tomcat","tomcat@cat.com")
	};
	

	@Override
	public void register(String username, String password, String password2) {
		// �û����������������Ϣ
		boolean checkUesrNameIsExists = checkUesrNameIsExists(username);
		if(checkUesrNameIsExists) {
			System.err.println("�û����Ѵ���");
			return;
		}
		// �ж����������Ƿ�һ��
		if(!password.equals(password2)) {
			System.err.println("�����������벻һ�£�����������");
			return;
		}
		
	}

	@Override
	public void login(String username, String password) {
		// �û�����������Ϣ����
		boolean checkUesrNameIsExists = checkUesrNameIsExists(username);
		if(!checkUesrNameIsExists) {
			System.err.println("�û��������ڡ���������������");
			return;
		}
		String realpassword = queryPasswordByUserName(username);
		if(!realpassword.equals(password)) {
			System.err.println("�������");
			return;
		}
		
		
	}
	// �����û�����ѯ����
	private String queryPasswordByUserName(String userName) {
		for(int i=0;i<users.length;i++) {
			if(userName.equals(users[i].getUsername())) {
				return users[i].getUsername();
			}
		}
		return null;
	}
	// ����û����Ƿ����
	private boolean checkUesrNameIsExists(String userName) {
		for(int i=0;i<users.length;i++) {
			if(userName.equals(users[i].getUsername())) {
				return true;
			}
		}
		return false;
	}
	
	

}
