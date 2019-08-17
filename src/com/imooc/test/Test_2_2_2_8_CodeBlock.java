package com.imooc.test;

public class Test_2_2_2_8_CodeBlock {
/**
 * 程序参考运行效果图如下：
 * CodeBlock的静态代码块
 * CodeBlock的主方法
 * 产生Code类实例对象
 * Code的静态代码块
 * Code的构造块
 * Code的构造方法
 * 产生CodeBlock类实例对象
 * CodeBlock的构造块
 * CodeBlock的构造方法
 */
	
/**
 * 任务
 * 1、创建类Code，类中编写构造块，静态代码块以及构造方法
 * 2、创建CodeBlock，类中编写的构造块、静态代码以及构造方法
 * 3、在主函数中测试他们的执行的优先顺序（运行结果参见效果图）
 */

	// 创建CodeBlock的构造块
	{
		System.out.println("CodeBlock的构造块");
	}
	// 创建CodeBlock的静态代码块
	static {
		System.out.println("CodeBlock的静态代码块");
	}

	// 创建CodeBlock的构造方法
	public Test_2_2_2_8_CodeBlock() {
		System.out.println("CodeBlock的构造方法");
	}

	public static void main(String[] args) {
		// 编写代码测试运行优先顺序，运行结果参见效果图
		System.out.println("CodeBlock的主方法");
		System.out.println("产生Code类实例对象");
		Test_2_2_2_8_Code test1 = new Test_2_2_2_8_Code();
		System.out.println("产生CodeBlock类实例对象");
		Test_2_2_2_8_CodeBlock test2 = new Test_2_2_2_8_CodeBlock();

	}
}
