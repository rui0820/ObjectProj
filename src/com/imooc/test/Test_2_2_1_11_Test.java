package com.imooc.test;

public class Test_2_2_1_11_Test {
/**
 * 编写自定义类实现用户信息类
 * 程序参考运行效果图如下
 * 用户名：Lucy
 * 密码：123456
 * 用户名：Mike
 * 密码：123456
 * ==================
 * 用户名或密码不一致
 */
	
/**
 * 任务
 * ·用户类：
 * 属性：用户名、密码
 * ·用户管理类：
 * 方法：用户信息验证
 */
	
/**
 * 要求
 * 1、设计构造函数实现对属性赋值
 * 2、设置私有属性，get/set方法实现对属性的访问
 * 3、用户信息验证判断两个用户信息是否一致。
 * 当用户名和密码都一致的时候返回：用户名和密码一致。否则返回：用户名或密码不一致
 */
	public static void main(String[] args) {
		Test_2_2_1_11_User user1 = new Test_2_2_1_11_User("Lucy","123456");
		Test_2_2_1_11_User user2 = new Test_2_2_1_11_User("Lucy","123456");
		Test_2_2_1_11_UserManager manager1 = new Test_2_2_1_11_UserManager(user1,user2);
	}
}
