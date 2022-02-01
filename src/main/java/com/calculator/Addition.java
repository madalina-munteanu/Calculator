package com.calculator;

public class Addition implements Operation{

    @Override
    public double execute(double a, double b) {
        return a + b;
    }

    public void hello() {
        System.out.println("addition");
    }
}
