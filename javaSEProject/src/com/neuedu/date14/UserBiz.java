package com.neuedu.date14;
/**
* @ClassName: UserBiz
* @Description: 用户接口
* @author student_dt
* @date 2019年8月14日 上午11:53:03
*
*/
public interface UserBiz {
	// 用户注册
	void register(String username,String password,String password2);
	// 用户登录
	void login(String username,String password);

}
