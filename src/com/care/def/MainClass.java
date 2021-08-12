package com.care.def;

import java.util.Scanner;

public class MainClass {
<<<<<<< HEAD
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num;
      System.out.println("---°¡ÀüÁ¦Ç°---");
      while(true) {
         System.out.println("1.³ÃÀå°í");
         System.out.println("2.Tv");
         System.out.println("3.¼¼Å¹±â");
         System.out.print(">>>> : ");
         num=input.nextInt();
         switch(num) {
         case 1:
            System.out.println("³ÃÀå°í");
            break;
         case 2:
            System.out.println("Tv");
            break;
         case 3:
            System.out.println("¼¼Å¹±â");
            break;
         }
      }
   }
}
=======
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("---°¡ÀüÁ¦Ç°---");
		while(true) {
			System.out.println("1.³ÃÀå°í");
			System.out.println("2.Tv");
			System.out.println("3.¼¼Å¹±â");
			System.out.print(">>>> : ");
			num=input.nextInt();
			switch(num) {
			case 1:
				System.out.println("³ÃÀå°í");
				break;
			case 2:
				System.out.println("Tv");
				break;
			case 3:
				System.out.println("¼¼Å¹±â");
				break;
			}
		}
	}
}
>>>>>>> master
