package Odev13;

import java.util.Scanner;

public class RecursivePattern {
    static void Pattern(int i){
        System.out.print(i + " ");
        if (i<=0){
            return;
        }
        Pattern(i - 5);
        System.out.print(i + " ");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Number: ");
        int value = scanner.nextInt();
        System.out.print("Output: ");
        Pattern(value);
    }
}
