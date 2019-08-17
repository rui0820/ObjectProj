package com.imooc.test;

public class Test_2_2_1_11_UserManager {

	public Test_2_2_1_11_UserManager(Test_2_2_1_11_User user1,Test_2_2_1_11_User user2) {
		System.out.println("用户名：" + user1.getUserName());
		System.out.println("密码：" + user1.getPassWord());
		System.out.println("用户名：" + user2.getUserName());
		System.out.println("密码：" + user2.getPassWord());
		System.out.println("=====================");
		if(user1.getUserName().equals(user2.getUserName())&user1.getPassWord().equals(user2.getPassWord())) {
			System.out.println("用户名和密码一致");
		}else {
			System.out.println("用户名或密码不一致");
		}
	}
}
