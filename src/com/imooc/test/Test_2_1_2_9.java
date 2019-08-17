package com.imooc.test;

public class Test_2_1_2_9 {
	private String name;
	public Test_2_1_2_9() {
		this.name = "小新";
	}
	public Test_2_1_2_9(String name) {
		System.out.println("我是" + this.name);
	}
	public static void main(String[] args) {
		Test_2_1_2_9 test = new Test_2_1_2_9("小强");
	}
}
