package com.neuedu.date14;
/**
* @ClassName: UserBiz
* @Description: �û��ӿ�
* @author student_dt
* @date 2019��8��14�� ����11:53:03
*
*/
public interface UserBiz {
	// �û�ע��
	void register(String username,String password,String password2);
	// �û���¼
	void login(String username,String password);

}
