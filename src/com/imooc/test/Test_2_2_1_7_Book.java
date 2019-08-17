package com.imooc.test;

public class Test_2_2_1_7_Book {
/**
 * 编写自定义类实现图书信息设置。完成程序设计
 * 运行参考效果如下：
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

/**
 * 任务
 * 属性：书名、作者、出版社、价格
 * 方法：信息介绍
 * 要求：
 * 1、设计构造函数实现对属性赋值
 * 2、设置私有属性，get/set方法实现对属性的访问
 * 3、设定图书价格必须大于10，如果无效需进行提示，并强制赋值为10
 * 4、限定作者、书名为只读属性
 * 5、信息介绍方法描述图书所有信息
 */
	//变数定义
	private String bookName;
	private String author;
	private String press;
	private float price;

	public Test_2_2_1_7_Book(String bookName,String author,String press,float price) {
		this.bookName = bookName;
		this.author = author;
		this.setPress(press);
		this.setPrice(price);
	}

	public String getPress() {
		return this.press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		if(price >= 10) {
		this.price = price;
		}else {
			System.out.println("图书价格不能低于10元");
			this.price = 10;
		}
	}

	public String getBookName() {
		return this.bookName;
	}

	public String getAuthor() {
		return this.author;
	}
	
	public void display() {
	      System.out.println("书名："+getBookName());
	      System.out.println("作者："+getAuthor());
	      System.out.println("出版社："+getPress());
	      System.out.println("价格："+getPrice()+"元");
	      System.out.println("===================");
	}
	
}
