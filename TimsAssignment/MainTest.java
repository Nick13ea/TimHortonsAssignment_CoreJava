package com.company.TimsAssignment;

import java.util.Scanner;

public class MainTest {
    static int counter = 0;
    static int choice = 0;

    public static void main(String[] args) {
        TimsItem[] items = new TimsItem[100];
        double total = 0;
        boolean exit;
        TimsItem timsItem = null;
        System.out.println("Do you want to order: Yes or No");
        Scanner scanner = new Scanner(System.in);
        String validate = scanner.next();
        while (validate.equals("Yes") || validate.equals("YES")) {
            System.out.println(
                    "Please give your input: \n" +
                            "Press 1 for Merchandise: \n" +
                            "Press 2 for Consumables: \n" +
                            "Press 3 if you are Done Ordering....\n");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("What do you want to order: \n" +
                        "Press 1 for Mugs: \n" +
                        "Press 2 for Coffee Powder: \n" +
                        "Press 3 for Gift Cards: \n" +
                        "Press 4 for Hockey Cards: \n");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        itemDescription(new Mugs(), items, scanner);
                        break;
                    case 2:
                        itemDescription(new CoffeePowder(), items, scanner);
                        break;
                    case 3:
                        itemDescription(new GiftCards(), items, scanner);
                        break;
                    case 4:
                        itemDescription(new HockeyCards(), items, scanner);
                        break;
                    default:
                        System.out.println("Please enter between 1 and 4 only");
                }
            } else if (choice == 2) {
                System.out.println("What do you want to order: \n" +
                        "Press 1 for Donut: \n" +
                        "Press 2 for Bagel: \n" +
                        "Press 3 for Wrap: \n" +
                        "Press 4 for Sandwich: \n");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        itemDescription(new Donuts(), items, scanner);
                        break;
                    case 2:
                        itemDescription(new Bagel(), items, scanner);
                        break;
                    case 3:
                        itemDescription(new Wraps(), items, scanner);
                        break;
                    case 4:
                        itemDescription(new Sandwich(), items, scanner);
                        break;
                    default:
                        System.out.println("Please enter between 1 and 4 only");
                }

            } else {
                System.out.println("Invalid Entry");
                break;
            }
            System.out.println("Do you want to order anything else: Yes or No: ");
            validate = scanner.next();
        }

            System.out.println("Here is the list of items you ordered:\n");
            for (int i = 0; i < items.length; i++) {
                total = total + items[i].getPrice();
                System.out.println("\n" + items);
            }
            System.out.println("Your total is" + total);
            paymentAuthorization(total, scanner);
        }



    private static void itemDescription(TimsItem item, TimsItem[] items, Scanner scanner) {
        if (item instanceof TimsMerchandise) {
            System.out.println(item);
            System.out.println("Do you want to continue. Press 1 for yes & 2 for no: ");
            choice = scanner.nextInt();
        } else if (item instanceof TimsConsumable) {
            System.out.println(item);
            System.out.println("Do you want to continue. Press 1 for yes & 2 for no: ");
            choice = scanner.nextInt();
        }

    }

    private static void paymentAuthorization(double total, Scanner scanner) {
        System.out.println("Please enter Credit Card details: ");
        String ccNo = scanner.next();
        System.out.println("Please enter CVV: ");
        String cvv = scanner.next();
        System.out.println("Please enter expiry date & month in MMYY format: ");
        String expiry = scanner.next();
        if (ccNo.equals(PaymentGateway.creditNo) && cvv.equals(PaymentGateway.cvvNo) && expiry.equals(PaymentGateway.expiryDate)) {
            System.out.println("Payment Successful: \n" + "Thank You");
        } else {
            System.out.println("Please Try again with correct details.");
        }
    }
}
