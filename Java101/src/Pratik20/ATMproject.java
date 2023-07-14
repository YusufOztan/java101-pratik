package Pratik20;

import java.util.Scanner;

public class ATMproject {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        Scanner scanner = new Scanner(System.in);

        while(right > 0){
            System.out.print("Your Username: ");
            userName = scanner.nextLine();

            System.out.print("Your Password: ");
            password = scanner.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("-------------------------------");
                System.out.println("Welcome to KodluyoruzATM! ");
                do {
                    System.out.println("-------------------------------");
                    System.out.print("1-Deposit\n" +
                            "2-Withdraw Money\n" +
                            "3-Balance Query\n" +
                            "4-Exit");
                    System.out.println();
                    System.out.print("Please select the action you want to: ");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1 -> {
                            System.out.print("Amount of money: ");
                            int price = scanner.nextInt();
                            balance += price;
                        }
                        case 2 -> {
                            System.out.print("Amount of money: ");
                            int price2 = scanner.nextInt();
                            if (balance - price2 >= 0) {
                                balance -= price2;
                            } else {
                                System.out.println("You do not have enough money in your account");
                            }
                        }
                        case 3 -> System.out.println("Your balance: " + balance);
                    }
                } while(select != 4);
                System.out.println("See you again later!");
                break;
            } else {
                right--;
                System.out.println("Wrong Username or Password. Try again. ");
                if(right==0){
                    System.out.println("Your account has been blocked. Please contact your bank.");
                }else {
                System.out.println("Your remaining right: " + right);
                }
            }
        }
    }
}
