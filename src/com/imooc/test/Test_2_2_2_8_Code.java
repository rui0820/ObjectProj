package com.imooc.test;

public class Test_2_2_2_8_Code {
	// 创建外部类Code构造块（构造块）
	{
		System.out.println("Code的构造块");
	}
	// 创建外部类Code静态代码块（静态代码块）
	static {
		System.out.println("Code的静态代码块");
	}

	// 创建外部类Code构造方法（构造方法）
	public Test_2_2_2_8_Code() {
		System.out.println("Code的构造方法");
	}
}
