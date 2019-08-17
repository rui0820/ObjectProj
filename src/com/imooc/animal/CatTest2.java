package com.imooc.animal;

public class CatTest2 {
	public static void main(String[] args) {
		Cat2 one = new Cat2();
		one.setName("凡凡");
		System.out.println(one.getName());
		one.setMonth(2);
		if(one.getMonth() == 0)
			return;
		System.out.println("年龄" + one.getMonth());
	}
}
