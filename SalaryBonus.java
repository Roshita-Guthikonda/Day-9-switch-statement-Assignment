package com.codegnan.controlstatements;

import java.util.Scanner;

public class SalaryBonus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter role code 1.Manager 2.Developer 3.Intern : ");
		int code=sc.nextInt();
		System.out.println("Enter salary: ");
		int salary=sc.nextInt();
		double bonus;
		switch(code) {
		case 1:
			bonus=salary*0.1;
			System.out.println("Total bonus = "+bonus);
			break;
		case 2:
			bonus=salary*0.05;
			System.out.println("Total bonus = "+bonus);
			break;
		case 3:
			bonus=500;
			System.out.println("Total bonus = "+bonus);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		sc.close();
	}

}
