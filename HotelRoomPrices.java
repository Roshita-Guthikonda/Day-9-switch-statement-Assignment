package com.codegnan.controlstatements;

import java.util.Scanner;

public class HotelRoomPrices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		int price;
		do {
			System.out.println("---------------------------");
			System.out.println("------1.Standard Room------");
			System.out.println("-------2.Delux Room--------");
			System.out.println("---------------------------");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter season (peak/off peak): ");
				boolean peak=sc.next().equalsIgnoreCase("peak");
				if(peak) {
					price=100;
					System.out.println("Price for Standard room in peak season is: "+price);
				}else {
						price=80;
						System.out.println("Price for Standard room in offpeak season is: "+price);
				}
				break;
			case 2:
				System.out.println("Enter season (peak/off peak): ");
				 peak=sc.next().equalsIgnoreCase("peak");
				if(peak) {
					price=200;
					System.out.println("Price for Delux room in peak season is: "+price);
				}else {
						price=150;
						System.out.println("Price for Delux room in offpeak season is: "+price);
				}
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
			
			
		} while(ch!=2);
		sc.close();
		

	}

}
