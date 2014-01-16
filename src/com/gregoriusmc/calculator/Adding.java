package com.gregoriusmc.calculator;

import java.util.Scanner;

public class Adding {
    //Adds numbers, try running this with an IDE.

    static int add1, add2;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("[Adding] Enter your first number.");
        add1 = s.nextInt();
        System.out.println("[Adding] Enter your second number.");
        add2 = s.nextInt();
        System.out.println("[Adding] " + add1 + " + " + add2 + " = " + (add1 + add2));
        //Symbol to add numbers is "+".
    }
}
