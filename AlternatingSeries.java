package com.mycompany.productfile;

import java.util.Scanner;

public class AlternatingSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        int sum = 0;
        
        // Compute the alternating sum series
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        
        // Display the result
        System.out.println("Sum of the series: " + sum);
        
        scanner.close();
    }
}