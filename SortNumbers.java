package com.mycompany.productfile;

import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
       
        int[] numbers = {5, 2, 8, 1, 3};

        Arrays.sort(numbers);

        System.out.println("Sorted numbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
