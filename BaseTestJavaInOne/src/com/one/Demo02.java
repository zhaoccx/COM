package com.one;

import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		int classNum = 3; // �༶��Ŀ
		int stuNum = 4; // ѧ����Ŀ
		double sum = 0; // �ɼ��ܺ�
		double avg = 0; // ƽ����
		Scanner input = new Scanner(System.in);
		for (int i = 1; i <= classNum; i++) { // ���ѭ�����ư༶��
			sum = 0; // �ɼ��ܺ͹�0
			System.out.println("***�������" + i + "���༶�ĳɼ�***");
			for (int j = 1; j <= stuNum; j++) { // �ڲ�ѭ������ÿ���༶ѧԱ��
				System.out.print("��" + j + "��ѧԱ�ĳɼ���");
				int score = input.nextInt(); // ��ȡ����ĳɼ�
				sum = sum + score; // �ɼ��ۼ����
			}
			avg = sum / stuNum; // ����ƽ����
			System.out.println("��" + i + "���༶ѧԱ��ƽ�����ǣ�" + avg + "\n");
		}
		input.close();
	}
}
