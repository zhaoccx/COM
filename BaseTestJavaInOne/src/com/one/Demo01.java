package com.one;

import java.util.Scanner;

/*
 * ���ܣ�Ϊָ���ĳɼ��ӷ֣�ֱ���������ڵ���60Ϊֹ
 * ����ӷ�ǰ�ĳɼ��ͼӷֺ�ĳɼ�������ͳ�ƼӷֵĴ���
 * ���裺
 * 1.����һ������������ͳ�ƼӷֵĴ���
 * 2.ʹ��ѭ��Ϊ�ɼ��ӷ�
 * 3.ÿ��ִ��ѭ��ʱ��1�֣�����ͳ�ƼӷֵĴ���
 * 
 * ʹ��Scanner����������ȡ�û������ֵ
 * Scanner��λ��java.util���У�ʹ��ʱ��Ҫ����˰�
 * ���裺
 * 1.����java.util.Scanner
 * 2.����Scanner����
 * 3.���ղ������û������ֵ
 */
public class Demo01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // ����Scanner����
		// print��println����println�����Ϣ��ỻ�У���print���ỻ��
		System.out.println("���������Ŀ��Գɼ���");
		int score = input.nextInt(); // ��ȡ�ɼ���Ϣ�������ڱ���score��
		int count = 0; // ͳ�ƴ���
		System.out.println("�ӷ�ǰ�ĳɼ���" + score);
		while (score < 60) {
			score++;// ÿ��ѭ����1��
			count++;// ͳ�ƼӷֵĴ���
		}
		System.out.println("�ӷֺ�ĳɼ���" + score);
		System.out.println("������" + count + "�Σ�");
		input.close();
	}
}
