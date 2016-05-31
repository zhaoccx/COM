package com.imooc.proj_1;

import java.util.Scanner;

public class BookManagerEasy {
	private static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		//���塱ͼ�顰����
		String[] books = { "C����", "���ݽṹ", "�������", "����", "��ѧ����", "ë��" };
		while (true) {
			System.out.println("�������1-�������Ʋ���ͼ�飻2-������Ų���ͼ��");
			String book;
			try {
				//ȡ����������
				int command = inputCommand();
				//���ݲ�ͬ����ֵ�����в�ͬ����
				switch (command) {
				case 1://����ͼ������ѡ��ͼ��
					book = getBookByName(books);
					System.out.println("book:" + book);
					break;
				case 2://����ͼ����ţ������±꣩ѡ��ͼ��
					book = getBookByNumber(books);
					System.out.println("book:" + book);
					break;
				case -1://����ֵΪ-1��˵����������
					System.out.println("������������������ʾ�����������");
					continue;
				default://����ֵ���������Ϊ�Ǵ�������
					System.out.println("�����������");
					continue;
				}
				break;//�˳�����
			} catch (Exception bne) {
				//����ͼ�鲻�����쳣��ʱ��Ҫ��������������
				System.out.println(bne.getMessage());
				continue;
			} 
		}
	}

	//����ͼ�����Ʋ�ѯͼ��
	private static String getBookByName(String[] books)
			throws Exception {
		System.out.println("����ͼ�����ƣ�");
		//��ȡ�����ͼ������
		String name = console.next();
		for (int i = 0; i < books.length; i++) {
			if (name.equals(books[i]))
				//�����������ĳһͼ������ƥ�䣬���ظ�ͼ��
				return books[i];
		}
		//����ƥ�䣬�׳���ͼ�鲻�����쳣��
		throw new Exception("ͼ�鲻���ڣ�");
	}

	//����ͼ����ţ������±꣩��ѯͼ��
	private static String getBookByNumber(String[] books)
			throws Exception {
		while (true) {
			System.out.println("����ͼ����ţ�");
			try {
				//��ȡ�����ͼ����ţ������±꣩
				int index = inputCommand();
				//������ֵΪ-1
				if(index == -1){
					System.out.println("������������������ʾ�����������");
					continue;
				}
				//�������֡������±�Խ���쳣�����򷵻���Ӧλ�õ�ͼ��
				String book = books[index];
				return book;
			} catch (ArrayIndexOutOfBoundsException e) {
				//�������Ų����ڣ������������±�Խ���쳣���������׳���ͼ�鲻�����쳣��
				Exception bookNotExists = new Exception("ͼ�鲻���ڣ�");
				bookNotExists.initCause(e);
				throw bookNotExists;
			}
		}
	}

	//�ӿ���̨������������������������ͼ�����
	private static int inputCommand(){
		int command;
		try {
			command = console.nextInt();
			return command;
		} catch (Exception e) {
			//�������ַ��ͻ����ַ��������׳��쳣��������쳣���׳������������쳣��
			console = new Scanner(System.in);
			//����-1
			return -1;
		}
	}
}
