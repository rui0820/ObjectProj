package com.imooc.test;

public class Test_2_2_1_11_User {
	private String userName;
	private String passWord;
	
	public Test_2_2_1_11_User(String userName,String passWord) {
		setUserName(userName);
		setPassWord(passWord);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
}
