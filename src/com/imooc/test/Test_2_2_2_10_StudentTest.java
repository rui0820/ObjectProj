package com.imooc.test;

public class Test_2_2_2_10_StudentTest {
	public static void main(String[] args) {
		Test_2_2_2_10_Student stu = new Test_2_2_2_10_Student();
		stu.setName("小红");
		stu.setAge(13);

		Test_2_2_2_10_Student stu1 = new Test_2_2_2_10_Student();
		stu.setName("小明");
		stu.setAge(18);
		
		System.out.println(stu.getName() + "今年" + stu.getAge() + "岁了！");
		System.out.println(stu1.getName() + "今年" + stu1.getAge() + "岁了！");
	}
}
