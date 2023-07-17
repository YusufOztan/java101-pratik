package Odev11;

import java.util.Scanner;

public class RecursiveExponential {

    static int Expo(int value,int exp){
        if(exp == 0){
            return 1;
        }
        return value *= Expo(value,exp-1);


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number to be exponentiated: ");
        int value = scanner.nextInt();
        System.out.print("Number to be exponent: ");
        int exp = scanner.nextInt();
        System.out.print("Answer: " + value + "^" + exp + "=" + Expo(value,exp));
    }
}
