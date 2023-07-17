package Pratik21;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EBOBekok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n1 number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the n2 number: ");
        int n2 = scanner.nextInt();

        int i = 1;
        int ebob = 0;
        if(n1>n2){

            while(i < n1){
                if(n1 % i == 0 && n2 % i == 0){
                    ebob = i;
                }
                i++;
            }
            System.out.println("GCD of " + n1+" and "+n2+ " : " + ebob);

        } else {
            while(i < n2){
                if(n1 % i == 0 && n2 % i == 0){
                    ebob = i;
                }
                i++;
            }
            System.out.println("GCD of " + n1+" and "+n2+ " : " + ebob);
        }

        int j = 0;
        int ekok = (n1*n2)/ebob;
        System.out.println("LCF of " + n1+" and "+n2+ " : " + ekok);


    }
}
