package com.company;
import java.util.Arrays;
public class Problem4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[6];

        for (int i = 0; i < arr1.length; ++i) {
            arr2[i] = arr1[i];
        }

        System.out.println("arr2="+Arrays.toString(arr2));
    }
}
