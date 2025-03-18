package com.mycompany.productfile;

public class LargestNumber {
    public static void main(String[] args) {
    
        int[] numbers = {10, 5, 20, 15, 25};

        int largest = findLargest(numbers);

        System.out.println("The largest number is: " + largest);
    }

    public static int findLargest(int[] array) {
        
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        return largest;
    }
}
