package com.imooc.animal;

public class Cat2 {
	//修改属性的可见性---private 限定只能在当前类内访问
	private String name;	
	private int month;
	private double weight;
	private String species;
	
	public static int price;//静态变量
	
	{
		name = "aa";//可给成员属性赋值
		price = 10;//可给静态成员赋值
		System.out.println("我是构造代码块");
	}//构造代码块
	//创建对象时调用，优先于构造方法执行
	//同一个类中可以有多个
	//每次创建类都会执行
	
	static{
		price = 10;//可给静态成员赋值
		//name = "bb";//不可给成员属性赋值
		System.out.println("我是静态代码块");
	}//静态代码块
	//类加载时调用，优先于构造代码块执行
	//只在第一次加载类时执行（只执行一次）
	
	//static + 方法 → 类方法，静态方法
	public static void run() {
		//eat();//静态方法中不能直接访问同一个类的非静态成员（包括方法和属性）
		eat2();//只能直接调用同一个类的静态成员
		//一定要调用时的方法
		Cat2 temp = new Cat2();
		temp.eat2();
		//this.name = "小胖"；//静态方法中不能使用this.不能方法非静态的变量
		System.out.println("小猫快跑");
	}
	
	public void eat() {
		System.out.println("小猫吃鱼");
		this.price = 20;//成员方法中，可以直接访问类中静态成员
	}
	
	public static void eat2() {
		{
			System.out.println("我是普通代码块");
		}//方法中出现：普通代码块
		System.out.println("小猫吃鱼");
		{
			System.out.println("我是普通代码块2");
		}//普通代码块：顺序执行，先出现，先执行
		//同一个方法中可以有多个
	}
	
	{
		System.out.println("我是构造代码块2");
	}//构造代码块
	
	//创建get/set方法
	//在get/set方法中添加对属性的限定
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return "我是一只名叫" + this.name + "的猫咪";
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month <= 0)
			System.out.println("输入信息错误，宠物猫年龄必须大于0");
		else
			this.month = month;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
}
