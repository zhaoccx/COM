package com.imooc;

public class InitailTelphone2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 通过无参的构造方法可以创建对象
		// Telphone phone = new Telphone();
		// 通过有参的构造方法也可以创建对象 并给对象中的实例变量赋初值

		Telphone2 phone2 = new Telphone2(1.5f, 1.4f, 2.0f);
		// phone2.screen = 6.0f;
		phone2.setScreen(7.0f);
		// phone2.screen = 6.0f;
		// phone2.cpu = 6.0f;
		// phone2.setScreen(6.0f);
		System.out.println("screen:" + phone2.getScreen());
	}

}
