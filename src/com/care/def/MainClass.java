package com.care.def;

import java.util.Scanner;

import com.care.tv_L22.TV_L22;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TV_L22 tv = new TV_L22();
		int num;
		System.out.println("---������ǰ---");
		while(true) {
			System.out.println("1.�����");
			System.out.println("2.Tv");
			System.out.println("3.��Ź��");
			System.out.print(">>>> : ");
			num=input.nextInt();
			switch(num) {
			case 1:
				tv.display();
				System.out.println("�����");
				break;
			case 2:
				System.out.println("Tv");
				break;
			case 3:
				System.out.println("��Ź��");
				break;
			}
		}
	}
}
