package com.imooc;

public class InitailTelphone2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ͨ���޲εĹ��췽�����Դ�������
		// Telphone phone = new Telphone();
		// ͨ���вεĹ��췽��Ҳ���Դ������� ���������е�ʵ����������ֵ

		Telphone2 phone2 = new Telphone2(1.5f, 1.4f, 2.0f);
		// phone2.screen = 6.0f;
		phone2.setScreen(7.0f);
		// phone2.screen = 6.0f;
		// phone2.cpu = 6.0f;
		// phone2.setScreen(6.0f);
		System.out.println("screen:" + phone2.getScreen());
	}

}
