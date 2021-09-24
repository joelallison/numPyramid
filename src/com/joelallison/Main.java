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
            for (int j = 1; j < i-1; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
    static void paddedNumberPyramid(int maxValue) {
        String line = "";
        for (int i = 1; i < maxValue + 1; i++) {
            for (int j = 1; j<= i; j++) {
                line = line + j;
            }for (int x = 0; x < (maxValue+line.length())/2; i++){ System.out.print(" ");System.out.print(line + "\n"); }
        }
        for (int i = maxValue + 1; i > 0; i--) {
            for (int j = 1; j < i-1; j++) {
                line = line + j;
                System.out.println(line + "\t\t" + j);
            }for (int x = 0; x < (maxValue+line.length())/2; i++){ System.out.print(" ");System.out.print(line + "\n"); }
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
                paddedNumberPyramid(chosenValue);
                break;
        }
    }
}
