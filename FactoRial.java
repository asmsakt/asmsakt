
package com.mycompany.productfile;
import java.util.Scanner;

public class FactoRial {
   
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter your terms:");
   int n, factorial=1;
   n = input.nextInt();
   for(int i=1; i<n; i++){
     factorial *=i;
     }
   
   System.out.print("Fcatorial of "+n+" is: "+factorial);
       
   
    
    
    
    
  }
}
    

