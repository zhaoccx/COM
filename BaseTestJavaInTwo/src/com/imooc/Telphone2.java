package com.imooc;

public class Telphone2 {
	private float screen;
	private float cpu;
	private float mem;

	public void sendMessage() {
		System.out.println("sendMessage");
	}

	public float getScreen() {
		return screen;
	}

	public void setScreen(float screen) {
		this.screen = screen;
		this.sendMessage();
	}

	public float getCpu() {
		return cpu;
	}

	public void setCpu(float cpu) {
		this.cpu = cpu;
	}

	public float getMem() {
		return mem;
	}

	public void setMem(float mem) {
		this.mem = mem;
	}

	public Telphone2() {

		System.out.println("com.imooc.Telphone �޲εĹ��췽��ִ����!");
	}

	public Telphone2(float newScreen, float newCpu, float newMem) {
		if (newScreen < 3.5f) {
			System.out.println("����������ݲ���ȷ��������һ����С��Ĭ��ֵ��");
			screen = 3.5f;
		}
		cpu = newCpu;
		mem = newMem;
		System.out.println("�вεĹ��췽������!");
	}
}
