package com.codegnan.controlstatements;

import java.util.Scanner;

public class WeatherAlert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("Enter your choice 1.Sunny 2.Rainy 3.Stormy : ");
			ch=sc.nextInt();
			System.out.println("Enter temperature(-20 to 50): ");
			double temp=sc.nextDouble();
			switch(ch) {
			case 1:
				System.out.println("Sunny");
				break;
			case 2:
				System.out.println("Rainy");
				break;
			case 3:
				if(temp<10) {
					System.out.println("Severe Warning");
				}else {
					System.out.println("Stormy");
				}
				break;
			default:
				System.out.println("Invalid condition");
				break;
			}
		}while(ch!=4);
		
		sc.close();

	}

}
