package com.imooc;

public class SmartPhone extends Telphone3 implements IPlayGame {

	@Override
	public void call() {
		System.out.println("ͨ��������绰");
	}

	@Override
	public void message() {
		
		System.out.println("ͨ������������");
	}

	@Override
	public void playGame() {
		
		System.out.println("����������Ϸ�Ĺ���");
	}

}
