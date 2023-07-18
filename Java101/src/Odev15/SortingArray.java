package Odev15;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array's length: ");
        int len = scanner.nextInt();
        int[] list = new int[len];
        System.out.println("Please enter elements of array: ");
        int index = 1;
        for( int i = 0; i < list.length; i++){
            System.out.print(index++ + ".element: ");
            int value = scanner.nextInt();
            list[i] = value;
        }
        Arrays.sort(list);
        System.out.print("Sorted Array : ");
        for(int j : list){
            System.out.print(j + " ");
        }
    }
}
