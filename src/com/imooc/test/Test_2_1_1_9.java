package com.imooc.test;

public class Test_2_1_1_9 {
	/**
	 * 编写自定义Person类，根据提示以及效果图补全编辑器中代码。
	 * 程序运行草考效果图如下：
	 * 我是一名学生！
	 * 我是一个男孩
	 * 我叫李明，今年10岁了，读小学五年级了。
	 */
	
	/**
	 * 任务1
	 * 创建Person类
	 * 属性：名字（name），年龄（age），年级（grade）
	 * 方法：
	 * 1、无参无返回值的student方法，描述为：我是一个学生！
	 * 2、带参数（性别sex）的方法，描述为：我是一个**孩！
	 * 3、无参无返回值的mySelf方法，介绍自己的姓名、年龄、年级
	 */
	//publice class Person{}
	String name;
	int age;
	String grade;
	
	public void student(){
		System.out.println("我是一个学生!");
	}
	
	public void sex(char sex) {
		System.out.println("我是一个" + sex + "孩！");
	}
	
	public void mySelf() {
		System.out.println("我叫" + name + "，今年" + age + "岁了，该读" + grade + "了。");
	}
	
	/**
	 * 任务2
	 * 创建测试类
	 * 实例化对象，传入参数，调用无参无返回值的student和mySelf方法及带参方法sex
	 */
	//public class Test{}
	public static void main(String[] args) {
		Test_2_1_1_9 test = new Test_2_1_1_9();
		test.name = "李明";
		test.age = 10;
		test.grade = "小学五年级";
		test.student();
		test.sex('男');
		test.mySelf();
	}
}
