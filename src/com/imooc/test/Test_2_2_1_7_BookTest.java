package com.imooc.test;

public class Test_2_2_1_7_BookTest {
	 /* 运行参考效果如下：
	 * 图书价格最低10元
	 * 书名：红楼梦
	 * 作者：曹雪芹
	 * 出版社：人民文学出版社
	 * 价格：10.0元
	 * ===================
	 * 书名：小李飞刀
	 * 作者：古龙
	 * 出版社：中国长安出版社
	 * 价格55.5元
	 */
	public static void main(String[] args) {
		Test_2_2_1_7_Book book1 = new Test_2_2_1_7_Book("红楼梦", "曹雪芹", "人民文学出版社", 8);
		Test_2_2_1_7_Book book2 = new Test_2_2_1_7_Book("小李飞刀", "古龙", "中国长安出版社", 55.5f);
		
		book1.display();
		book2.display();
	}
}
