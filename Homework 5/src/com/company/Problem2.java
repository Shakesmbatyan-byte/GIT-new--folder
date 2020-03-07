package com.company;
 import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Enter size of array:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Input element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Print array values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input element" + i + ":" + arr[i]);
        }
    }
}



