package com.mycompany.productfile;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        long factorial = 1;
        
        // Compute factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        // Display the result
        System.out.println("Factorial of " + n + " is: " + factorial);
        
        scanner.close();
    }
}

