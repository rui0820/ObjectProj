package com.imooc.test;

public class Test_2_1_2_10 {
	/**
	 * 编写自定义猴子类，程序参考运行效果图如下
	 * 我是使用无参构造产生的猴子：
	 * 名称：长尾猴
	 * 特征：尾巴长
	 * =======================
	 * 我是使用带参构造产生的猴子
	 * 名称：白头叶猴
	 * 特征：头上有白毛，喜欢吃树叶
	 */
	
	/**
	 * 任务1
	 * 创建Monkey类
	 * 属性:名称（name）和特征（feature）
	 * 方法:
	 * 1)无参构造方法（默认初始化name和feature的属性值，属性值参考效果图）
	 * 2)带参构造方法，接受外部传入的参数，分别向name和feature赋值
	 */
	String name,feature;
	public Test_2_1_2_10() {
		System.out.println("我是使用无参构造产生的猴子");
		this.name = "长尾猴";
		this.feature = "尾巴长";
	}
	public Test_2_1_2_10(String name,String feature) {
		System.out.println("我是使用带参构造产生的猴子");
		this.name = name;
		this.feature = feature;
	}
	
	/**
	 * 任务2
	 * 创建测试类
	 */
	public static void main(String[] args) {
		//调用无参构造方法实例对象
		Test_2_1_2_10 test1 = new Test_2_1_2_10();
		//打印输出对象属性
		System.out.println("名称:" + test1.name);
		System.out.println("特征:" + test1.feature);
		System.out.println("=======================");
		//调用带参构造方法实例对象
		Test_2_1_2_10 test2 = new Test_2_1_2_10("白头叶猴","头上有白毛，喜欢吃树叶");
		//打印输出对象属性
		System.out.println("名称:" + test2.name);
		System.out.println("特征:" + test2.feature);
	}
}
