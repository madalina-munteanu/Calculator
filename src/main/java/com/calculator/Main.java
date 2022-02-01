package com.calculator;

import org.tinylog.Logger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Logger.info("Insert type of operation: ");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        try {
            System.out.println(calculator.calculate(operation, a, b));
        } catch (CalculatorException ex) {
//            ex.printStackTrace();
            System.out.println("The value inserted is bigger than 9");
        }

    }
}
