package com.imooc.animal;
/**
 * 宠物猫类
 * @author karaku
 *
 */
public class Cat {
	//品种属性：昵称、年龄、体重、品种
	String name;//昵称 String类型默认值 null
	int month;//年龄	int类型默认值 0
	double weight;//体重 double类型默认值为0.0
	String species;//品种
	
	
	//不指定时，系统自动添加无参的构造方法
	//有指定时，系统不会自动添加
	public Cat() {
		System.out.println("我是宠物猫");
		System.out.println("我是无参构造方法");
	}
	//一个类中可以有多个构造方法
	public Cat(String name) {	
		System.out.println("我是带参构造方法");
	}
	//定义一个与类名相同的方法
	//不会报错且可以被调用，但不推荐使用
	public void Cat() {
		System.out.println("我只是一个普通方法，恰好叫Cat");
	}
	
	public Cat(String name,int month,double weight,String species) {
		this();//构造方法之间可互相调用，且必须在第一行调用。方法： this();
		//name = name;		
		//警告，根据就近原则，无法赋值
		//方法一：更换参数名
		//方法二：this.
		this.name = name;	//传入的参数赋值给当前类的对象属性
		this.month = month;
		this.weight = weight;
		this.species = species;
		this.eat();//调用当前类的方法
		run();//同一类中普通成员方法调用可不写this

	}

	//方法：跑动、吃东西
	//跑动的方法
	public void run() {
		//Cat();//构造方法无法被普通方法调用
		System.out.println("小猫快跑");
	}
	public void run(String name) {
		System.out.println(name + "快跑");
	}
	
	//吃东西的方法
	public void eat() {
		//int age;
		System.out.println("小猫吃鱼");
		//System.out.println(age);	//方法里定义的局部变量没有初始值
	}
}
