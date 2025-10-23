package com.codegnan.controlstatements;

import java.util.Scanner;

public class CanteenMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        final int PRICE_TEA = 10;
        final int PRICE_COFFEE = 15;
        final int PRICE_SAMOSA = 20;
        final double TAX_RATE = 0.05;
        int qtyTea = 0;
        int qtyCoffee = 0;
        int qtySamosa = 0;

        boolean exit = false;

        while (!exit) {
            System.out.println("\n||=========== CANTEEN MENU ===========||");
            System.out.println("1. View Menu");
            System.out.println("2. Order Items");
            System.out.println("3. View Bill");
            System.out.println("4. Checkout and Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("\n--- MENU ---");
                    System.out.println("1. Tea     - ₹" + PRICE_TEA);
                    System.out.println("2. Coffee  - ₹" + PRICE_COFFEE);
                    System.out.println("3. Samosa  - ₹" + PRICE_SAMOSA);
                    break;
                case 2:
                    System.out.print("Enter item number to order (1-3): ");
                    int item = sc.nextInt();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();

                    if (quantity <= 0) {
                        System.out.println("Quantity must be greater than 0.");
                        break;
                    }
                    switch (item) {
                        case 1:
                            qtyTea += quantity;
                            System.out.println(quantity + " Tea(s) added.");
                            break;
                        case 2:
                            qtyCoffee += quantity;
                            System.out.println(quantity + " Coffee(s) added.");
                            break;
                        case 3:
                            qtySamosa += quantity;
                            System.out.println(quantity + " Samosa(s) added.");
                            break;
                        default:
                            System.out.println("Invalid item number.");
                    }
                    break;
                case 3:
                    int totalTea = qtyTea * PRICE_TEA;
                    int totalCoffee = qtyCoffee * PRICE_COFFEE;
                    int totalSamosa = qtySamosa * PRICE_SAMOSA;
                    int subtotal = totalTea + totalCoffee + totalSamosa;
                    double tax = subtotal * TAX_RATE;
                    double total = subtotal + tax;
                    System.out.println("\n--- BILL ---");
                    if (qtyTea > 0) {
                        System.out.println("Tea x" + qtyTea + " = ₹" + totalTea);
                    }
                    if (qtyCoffee > 0) {
                        System.out.println("Coffee x" + qtyCoffee + " = ₹" + totalCoffee);
                    }
                    if (qtySamosa > 0) {
                        System.out.println("Samosa x" + qtySamosa + " = ₹" + totalSamosa);
                    }
                    System.out.println("Subtotal = ₹" + subtotal);
                    System.out.println("Tax (5%) = ₹" + tax);
                    System.out.println("Total = ₹" + total);
                    break;
                case 4:
                    System.out.println("Thank you! Exiting system");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }
        }
        sc.close();

	}

}
