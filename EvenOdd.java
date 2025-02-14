
package com.mycompany.experimentno2;
import java.util.Scanner;

public class EvenOdd {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter your num = ");
        num = input.nextInt();
        
        if(num%2==0){
            
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        
    }
    
}
