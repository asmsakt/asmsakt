package com.mycompany.productfile;

import java.util.Scanner;

public class BanglaSeasonFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        
        String season;
        
        switch (month) {
            case 3: case 4:
                season = "Spring (Basanta)";
                break;
            case 5: case 6:
                season = "Summer (Grishma)";
                break;
            case 7: case 8:
                season = "Monsoon (Barsha)";
                break;
            case 9: case 10:
                season = "Autumn (Shorot)";
                break;
            case 11: case 12:
                season = "Late Autumn (Hemonto)";
                break;
            case 1: case 2:
                season = "Winter (Sheet)";
                break;
            default:
                season = "Invalid month! Please enter a number between 1 and 12.";
        }
        
        System.out.println("The Bangla season for month " + month + " is: " + season);
    }
}