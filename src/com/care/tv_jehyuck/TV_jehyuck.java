package com.care.tv_jehyuck;

import java.util.Scanner;

public class TV_jehyuck {
	public void display() {
		System.out.println("����� �ϴ� ����Դϴ�.");
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("1.�ø�, 2.����");
		num=input.nextInt();
		if(num==1)tempUp();
		else tempDown();
	}
	private void tempUp() {
		System.out.println("�µ��� �ø��ϴ�.");
	}
	private void tempDown() {
		System.out.println("�µ��� ����ϴ�.");
	}
}
