package Odev12;

import java.util.Scanner;

public class RecursivePrime {
    static boolean isNumPrime(int value, int i){
        if(value <= 2){
            if(2 == value){
                return true;
            } else {
                return false;
            }
        }
        if((value % i) == 0){
            return false;
        }
        if(i * i > value)
            return true;
        return isNumPrime(value,i+1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int value = scanner.nextInt();
        if(isNumPrime(value,2)==true){
            System.out.println(value+" is a prime number !");
        }else{
            System.out.println(value+" is not a prime number !");
        }
    }
}
