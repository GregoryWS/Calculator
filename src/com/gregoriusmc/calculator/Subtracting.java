package com.gregoriusmc.calculator;

import java.util.Scanner;

public class Subtracting {
    //Subtracts numbers, try running this with an IDE.

    static int sub1, sub2;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("[Subtracting] Enter your first number.");
        sub1 = s.nextInt();
        System.out.println("[Subtracting] Enter your second number.");
        sub2 = s.nextInt();
        System.out.println("[Subtracting] " + sub1 + " - " + sub2 + " = " + (sub1 - sub2));
        //Symbol to subtract numbers is "-".
    }
}
