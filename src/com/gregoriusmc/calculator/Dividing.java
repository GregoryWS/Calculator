package com.gregoriusmc.calculator;

import java.util.Scanner;

public class Dividing {
    //Divides numbers, try running this with an IDE.

    static int div1, div2;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("[Dividing] Enter your first number.");
        div1 = s.nextInt();
        System.out.println("[Dividing] Enter your second number.");
        div2 = s.nextInt();
        System.out.println("[Dividing] " + div1 + " / " + div2 + " = " + (div1 / div2));
        //Symbol to divide numbers is "/".
    }
}
