package com.care.tv_wonjiun;

import java.util.Scanner;

public class TV_wonjiun {
	public void display() {
		System.out.println("����� �ϴ� ����Դϴ�");
		Scanner in = new Scanner(System.in);
		int num;
		System.out.println("1.�ø� 2.����");
		num = in.nextInt();
		if(num == 1) tempUp();
		else tempDown();
	}
	private void tempUp() {
		System.out.println("�µ��� �ø��ϴ�");
	}
	private void tempDown() {
		System.out.println("�µ��� ����ϴ�");
	}
}
