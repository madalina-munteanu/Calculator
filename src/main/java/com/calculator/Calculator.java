package com.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Operation addition = new Addition();
    private Operation subtraction = new Subtraction();
    private Operation multiplication = new Multiplication();
    private Operation division = new Division();
    private HashMap<Operations, Operation> ops  = new HashMap();

    private Operations OPERATIONS;

    public Calculator() {
        ops.put(Operations.ADDITION, addition);
        ops.put(Operations.SUBTRACTION, subtraction);
        ops.put(Operations.MULTIPLICATION, multiplication);
        ops.put(Operations.DIVISION, division);
    }

    public double calculate(String operations, double a, double b) throws CalculatorException {
        if(a > 9) {
            throw new CalculatorException();
        }
        double result = 0;
        result = ops.get(Operations.valueOf(operations)).execute(a, b);
//        switch (OPERATIONS.valueOf(operations)) {
//            case ADDITION:
//                result = getAddition().execute(a, b);
//                break;
//            case SUBTRACTION:
//                result = getSubtraction().execute(a, b);
//                break;
//            case MULTIPLICATION:
//                result = getMultiplication().execute(a, b);
//                break;
//            case DIVISION:
//                result = getDivision().execute(a, b);
//                break;
//        }
        return result;
    }

    private Operation getAddition() {
        return addition;
    }

    private Operation getSubtraction() {
        return subtraction;
    }

    private Operation getMultiplication() {
        return multiplication;
    }

    private Operation getDivision() {
        return division;
    }


}
