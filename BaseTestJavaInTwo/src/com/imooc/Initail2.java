package com.imooc;

public class Initail2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Animal obj1 = new Animal(); Animal obj2 = new Dog();//����������ǿ���ָ����������
		 * Animal obj3 = new Cat(); //Dog obj3 = new Animal();//�� obj1.eat();
		 * obj2.eat(); obj3.eat();
		 */
		Dog dog = new Dog();
		Animal animal = dog;// ��������ת�� �Զ�����ת��
		if (animal instanceof Dog) {
			Dog dog2 = (Dog) animal;
			dog2.eat();
		} else {
			System.out.println("�޷���������ת�� ת����Dog����");
		}
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal;// 1.����ʱ Cat���� 2.����ʱ Dog����
			cat.eat();
		} else {
			System.out.println("�޷���������ת�� ת����Cat����");
		}
	}
}
