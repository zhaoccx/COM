package com.imooc;

public class SmartPhone extends Telphone3 implements IPlayGame {

	@Override
	public void call() {
		System.out.println("ͨ��������绰");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("ͨ������������");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("����������Ϸ�Ĺ���");
	}

}