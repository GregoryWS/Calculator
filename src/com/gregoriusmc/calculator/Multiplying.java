package com.gregoriusmc.calculator;

import java.util.Scanner;

public class Multiplying {
    //Multiplies numbers, try running this with an IDE.

    static int mul1, mul2;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("[Multiplying] Enter your first number.");
        mul1 = s.nextInt();
        System.out.println("[Multiplying] Enter your second number.");
        mul2 = s.nextInt();
        System.out.println("[Multiplying] " + mul1 + " * " + mul2 + " = " + (mul1 * mul2));
        //Symbol to multiply numbers is "*".
    }
}
