package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void starSquare() {
        System.out.println("Star square example ----");
        // Change the following variables to change the width and height of the drawing
        int lineCount = 5; // We want 5 lines of...
        int starPerLineCount = 5; // ... 5 stars
        // => will print a 5x5 square of stars
        for(int lineIndex = 1; lineIndex <= lineCount; lineIndex++) {
            // This inner loop will print exactly 5 stars on this line
            for(int starIndex = 1; starIndex <= starPerLineCount; starIndex++) {
                // We use .print instead of .println because each star
                // should be printed on the same line
                System.out.print("*");
            }
            // We only go back to the line after we print all the stars of this line
            System.out.println();
        }

        System.out.println();
    }
    public static void main(String[] args) {
        starSquare();
        diminishingStars();
        increasingStars();
        cumulativeSum(1, 10);
        cumulativeProduct(1, 10);
    }

    public static void cumulativeProduct(int startNumber, int endNumber) {
        System.out.println("Cumulative product example ----");
        int product = 1;
        for(int number = startNumber; number <= endNumber; number++) {
            product *= number;
        }
        System.out.println("The cumulative product from " + startNumber + " to " + endNumber + " is " + product);

        System.out.println();
    }

    public static void cumulativeSum(int startNumber, int endNumber) {
        System.out.println("Cumulative sum example ----");
        int sum = 0;
        for(int number = startNumber; number <= endNumber; number++) {
            sum += number;
        }
        System.out.println("The cumulative sum from " + startNumber + " to " + endNumber + " is " + sum);

        System.out.println();
    }

    public static void increasingStars() {
        System.out.println("Increasing stars example ----");
        // Change the following variable to change the number of lines
        int lineCount = 5; // We want 5 lines of stars...
        for(int lineIndex = 1; lineIndex <= lineCount; lineIndex++) {
            // Each line will print exactly `lineIndex` stars
            // so for lineIndex == ...
            // 1 -> 1
            // 2 -> 2
            // 3 -> 3
            // 4 -> 4
            // 5 -> 5
            // etc ...
            // You can see the pattern ;)
            int starPerLineCount = lineIndex;
            for(int starIndex = 1; starIndex <= starPerLineCount; starIndex++) {
                System.out.print("*");
            }
            // Println to go back to the line after all the stars of the current line
            // have been printed
            System.out.println();
        }

        System.out.println();
    }

    public static void diminishingStars() {
        System.out.println("Diminishing stars example ----");
        // Change the following variables to change the width and height of the drawing
        int lineCount = 5; // We want 5 lines of stars...
        for(int lineIndex = 1; lineIndex <= lineCount; lineIndex++) {
            // Each line will print exactly `lineCount - lineIndex + 1` stars
            // let's consider lineCount == 5
            // so for lineIndex == ...
            // 1 -> 5
            // 2 -> 4
            // 3 -> 3
            // 4 -> 2
            // 5 -> 1
            // etc ...
            // You can see the pattern ;)
            int starPerLineCount = lineCount - lineIndex + 1;
            for(int starIndex = 1; starIndex <= starPerLineCount; starIndex++) {
                System.out.print("*");
            }
            // Println to go back to the line after all the stars of the current line have been
            // printed
            System.out.println();
        }

        System.out.println();
    }
}

