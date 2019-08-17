package com.imooc.test;

public class Test_2_2_1_6 {
	private int add(int a,int b) {
		return a+b;
	}
	private int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		Test_2_2_1_6 test = new Test_2_2_1_6();
		System.out.println(test.add(1, 2)+test.add(3, 4,5));
	}
}
