package com.codegnan.controlstatements;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int code;
		int days;
		int fine=0;
		do {
		System.out.println("Enter code[1-3]: ");
		code=sc.nextInt();
		System.out.println("Enter number of days: [1-30]: ");
		days=sc.nextInt();
		switch(code) {
		case 1:
			if(days>=1 && days<=5) {
				fine=days*1;
				System.out.println("Total Fine : "+fine);
			}else {
				System.out.println("Enter days between 1-5");
			}
			break;
		case 2:
			if(days>=6 && days<=10) {
				fine=days*2;
				System.out.println("Total Fine : "+fine);
			}
			else {
				System.out.println("Enter days between 6-10");
			}
			break;
		case 3:
			if(days>10) {
				fine=days*5;
				System.out.println("Total Fine : "+fine);
			}else {
				System.out.println("Enter days more 10");
			}
			break;
		default:
			System.out.println("Invalid code");
			break;
		}
	} while(code!=3);
		sc.close();
	}

}
