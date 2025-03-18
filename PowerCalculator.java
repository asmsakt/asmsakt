package com.mycompany.productfile;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for base and exponent input
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        double result = Math.pow(base, exponent);
        
        // Display the result
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
        
        scanner.close();
    }
}
