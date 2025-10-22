package com.codegnan.controlstatements;

import java.util.Scanner;

public class ATMOperations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double balance =50000;
		int pin=1234;
		int enteredPin;
		System.out.println("Enter Your Pin:");
		enteredPin=sc.nextInt();
		if(enteredPin!=pin) {
			System.out.println("Invalid Pin. Exiting");
			return;
		}
		int choice;
		do {
			System.out.println("||=================================||");
			System.out.println("||============ATM Menu=============||");
			System.out.println("||===========1.Deposit=============||");
			System.out.println("||===========2.Withdraw============||");
			System.out.println("||===========3.Check balance=======||");
			System.out.println("||===========4.Exit================||");
			System.out.println("||=================================||");
			System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Deposit Amount: ");
				double depositAmount=sc.nextDouble();
				if(depositAmount%100!=0) {
					System.out.println("Please Deposite Multiples of Hundreds" +  "like[700,1000,2000");
				}else {
					if(depositAmount<500) {
						System.out.println("Please deposit More than 500 rupees");
					}else {
						balance+=depositAmount;
						System.out.println("Deposited: " + depositAmount+ "Amount Succesfully Deposited. New balance:" +balance);
					}
				}
				break;
			case 2:
				System.out.println("Enter Withdraw Amount: ");
				double withhdrawAmount=sc.nextDouble();
				if(withhdrawAmount%100!=0) {
					System.out.println("Please withhdraw Multiples of Hundreds" +  "like[700,1000,2000]");
				}else {
					if(withhdrawAmount<500) {
						System.out.println("Please deposit More than 500 rupees");
					}else {
						if(withhdrawAmount>balance) {
							System.out.println("Insufficient Funds");
						}else {
							balance-=withhdrawAmount;
							System.out.println("Amount withdrawn succesfully." +withhdrawAmount +" New Balance" +balance);
						}
					}
				}	
				break;
			case 3:
				System.out.println("Your account Balance is:" +balance);
				break;
			case 4:
				System.out.println("Exiting.... Thank you for using ATM");
				break;
			default:
				System.out.println("Invalid choice. Please choose a valid option[1-4]");
				break;
			}
		} while(choice!=4);
		sc.close();
		
	}

}
