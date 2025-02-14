
package com.mycompany.productfile;
import java.util.Scanner;

public class FactoRial {
   
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n, factorial=1;
    n = scanner.nextInt();
    
    for (int i = 1; i <= n; i++) {
      factorial =factorial * i;
    }
    
    System.out.println("Factorial of " + n + " is: " + factorial);
  }
}
    


