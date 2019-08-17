package com.imooc.test2;//定义包
//import com.imooc.animal.*;//加载com.imooc.animal下所有类
import com.imooc.animal.Cat;//加载指定包下指定类 效率更高
import com.imooc.mechanics.*;
//import com.imooc.*;	//.*只能加载到下面直接管理的类。不会查找子包内容
import com.imooc.animal.Cat2;

public class Test {
	public static void main(String[] args) {
		//优先调用能够直接解析的类
		Cat cat = new Cat(); //调用animal.Cat
		com.imooc.mechanics.Cat cat1 = new com.imooc.mechanics.Cat();
		//CatTest tex = new CatTest(); //未被加载 无法直接使用
		//直接加载com.imooc.animal.CatTest
		com.imooc.animal.CatTest tex = new com.imooc.animal.CatTest();
		
		Cat2 one = new Cat2();
		one.setName("花花");
		one.setMonth(2);
		one.setSpecies("英国短毛猫");
		one.price = 2000;
		Cat2.price =2000;//静态成员访问可以用类名.xxx的形式调用
		System.out.println(one.getName() + ",售价" + one.price);
		
		Cat2 two = new Cat2();
		two.setName("凡凡");
		two.setMonth(1);
		two.setSpecies("中华田园猫");
		two.price = 150;//静态成员赋值 one.price为同一地址 →one.price = two.price = Cat2.price
		
		System.out.println(one.getName() + ",售价" + one.price);
		System.out.println(two.getName() + ",售价" + two.price);
		
		//调用类方法 同静态变量，有两种方法
		one.eat2();
		Cat2.eat2();
		//类前无法加static
		//局部变量前无法加static
		
	}
}
