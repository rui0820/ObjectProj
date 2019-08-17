package com.imooc.animal;

public class CatTest {
	public static void main(String[] args) {
		//对象实例化
		Cat one; //声明对象
		one = new Cat();//实例化操作 →Cat one = new Cat();
		Cat two = new Cat();//开辟新的对象空间
		Cat three = one;//three 与 one 指同一地址
		//测试
		one.eat();
		one.run();
		//在类里定义的成员属性有默认值
		System.out.println("----------默认值---------");
		System.out.println("昵称" + one.name);//字符串类型默认初始值：null
		System.out.println("年龄" + one.month);//整型默认初始值：0
		System.out.println("体重" + one.weight);//浮点数默认初始值：0.0
		System.out.println("品种" + one.species);
		System.out.println("-------------------");
		//赋值
		System.out.println("---------对one赋值并显示----------");
		one.name = "花花";
		one.month = 2;
		one.weight = 1000;
		one.species = "英国短毛猫";
		System.out.println("昵称" + one.name);
		System.out.println("年龄" + one.month);
		System.out.println("体重" + one.weight);
		System.out.println("品种" + one.species);
		one.run(one.name);
		//对two的修改不会影响One的内容
		System.out.println("---------对two赋值并显示----------");
		two.name = "凡凡";
		two.month = 1;
		two.weight = 800;
		two.species = "中华田园猫";
		System.out.println("昵称" + two.name);
		System.out.println("年龄" + two.month);
		System.out.println("体重" + two.weight);
		System.out.println("品种" + two.species);
		one.run(two.name);
		System.out.println("---------对two的赋值不会影响one的内容----------");
		System.out.println("昵称" + one.name);
		System.out.println("年龄" + one.month);
		System.out.println("体重" + one.weight);
		System.out.println("品种" + one.species);
		one.run(one.name);
		//对three的修改=对one修改
		System.out.println("---------对three赋值----------");
		three.name = "一一";
		three.month = 3;
		three.weight = 900;
		three.species = "中华田园猫";
		System.out.println("昵称" + three.name);
		System.out.println("年龄" + three.month);
		System.out.println("体重" + three.weight);
		System.out.println("品种" + three.species);
		one.run(three.name);
		System.out.println("---------one的内容也被改变----------");
		System.out.println("昵称" + one.name);
		System.out.println("年龄" + one.month);
		System.out.println("体重" + one.weight);
		System.out.println("品种" + one.species);
		one.run(one.name);
		
		//构造方法
		System.out.println("---------构造方法----------");
		Cat one1 = new Cat();
		Cat one2 = new Cat("喵喵");
		//带参构造方法
		System.out.println("---------带参构造方法----------");
		Cat one3 = new Cat("花花",2,1000,"英国短毛猫");
		System.out.println("昵称" + one3.name);
		System.out.println("年龄" + one3.month);
		System.out.println("体重" + one3.weight);
		System.out.println("品种" + one3.species);
		one1.Cat();//可以正常调用
		
	}
}
