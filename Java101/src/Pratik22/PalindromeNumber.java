package Pratik22;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class PalindromeNumber {
    static boolean isPalindrome(int number) {
        int temp = number, reversenumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reversenumber = (reversenumber * 10) + lastNumber;
            temp /= 10;

        }
        if (number == reversenumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a value: ");
        int value = scanner.nextInt();
        System.out.println(isPalindrome(value));;
    }
}
