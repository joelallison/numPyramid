package com.joelallison;

import java.util.Scanner;

public class Main {
    static void numberPyramid(int maxValue) {
        for (int i = 1; i < maxValue + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
        for (int i = maxValue + 1; i > 0; i--) {
            for (int j = 1; j <= maxValue; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("std or padded mode? [s/p]");
        String userChoice = input.next();
        System.out.println("max value:");
        int chosenValue = input.nextInt();
        switch (userChoice) {
            case "s":
                numberPyramid(chosenValue);
                break;
            case "p":
                //paddedNumberPyramid(chosenValue);
                break;
        }
        /* Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();
        if ((userChoice % 2) == 0){
            System.out.println("value is even.");
        }else{ System.out.println("value is odd."); } */
    }
}
