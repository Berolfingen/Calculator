package com.berolfingen.leo.controller;

public class MethodCalc {

    public static double sumMinDivMul(double first, double second, String operation) throws NumberFormatException {
        switch (operation) {
            case "+":
                return first + second;

            case "-":
                return first - second;

            case "/":
                if (second == 0) {
                    throw new NumberFormatException();
                }
                return first / second;
            case "*":
                return first * second;
        }
        return 0;
    }

    public static double squareRoot(double figure) throws NumberFormatException{
        if(figure<0) throw new NumberFormatException();
        else return Math.sqrt(figure);
    }
}
