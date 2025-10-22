package com.codegnan.controlstatements;

import java.util.Scanner;

public class RegionTaxCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double tax;
		int ch;
		do {
			System.out.println("-----1.North-----");
			System.out.println("-----2.South-----");
			System.out.println("-----3.East-----");
			System.out.println("-----4.West-----");
			System.out.println("-----5.Exit-----");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			System.out.println("Enter your income : ");
			int income=sc.nextInt();
			switch(ch) {
			case 1:
				tax=income*0.05;
				System.out.println("Tax for your income "+income +"is "+tax);
				break;
			case 2:
				tax=income*0.06;
				System.out.println("Tax for your income "+income +"is "+tax);
				break;
			case 3:
				tax=income*0.07;
				System.out.println("Tax for your income "+income +"is "+tax);
				break;
			case 4:
				tax=income*0.08;
				System.out.println("Tax for your income "+income +"is "+tax);
				break;
			case 5:
				System.out.println("Exiting..");
				break;
			default:
				System.out.println("Invalid choice");
				break;
				
			}
			
		} while(ch!=5);
		sc.close();
	}

}
