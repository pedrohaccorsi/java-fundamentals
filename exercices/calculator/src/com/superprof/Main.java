package com.superprof;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the 1st number: "); double firstNumber  = keyboard.nextDouble();
        System.out.print("Enter the 2nd number: "); double secondNumber = keyboard.nextDouble();
        System.out.print("Enter the operation: " ); String operation    = keyboard.next();

        double result = switch (operation) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "/" -> firstNumber / secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> 0;
        };

        System.out.println(
            firstNumber  + " "   +
            operation    + " "   +
            secondNumber + " = " + result
        );

    }

}
