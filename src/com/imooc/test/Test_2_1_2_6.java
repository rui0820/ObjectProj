package com.imooc.test;

public class Test_2_1_2_6 {
	int x,y;
	
	Test_2_1_2_6(int x,int y){
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		Test_2_1_2_6 pt1,pt2;
		pt1 = new Test_2_1_2_6(3,3);
		pt2 = new Test_2_1_2_6(4,4);
		System.out.println(pt1.x + pt2.x);
	}
}
