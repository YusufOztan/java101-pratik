package Pratik26;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ClosestValueInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Value: ");
        int value = scanner.nextInt();
        int[] list = {15,12,788,1,-1,-778,2,0};
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int min = 0;
        int max = 0;
        for (int i : list) {
            if(i < value){
                list1.add(i);
            }else{
                list2.add(i);
            }
        }
        list1.sort(null);
        list2.sort(null);

        System.out.println("The nearest number smaller than the entered number: " + list1.get(list2.size()-1));
        System.out.println("The nearest number greater than the entered number: " + list2.get(0));
    }
}

