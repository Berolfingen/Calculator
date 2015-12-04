package com.berolfingen.leo.controller;

public class MethodCalc {

    public static double chooseOperation(double first, double second, String operation) throws NumberFormatException {
        switch (operation) {
            case "+":
                return sum(first, second);
            case "-":
                return minus(first, second);
            case "/":
                return divide(first, second);
            case "*":
                return multiple(first, second);
        }
        return 0;
    }

    public static double sum(double first, double second) {
        return first + second;
    }

    public static double minus(double first, double second) {
        return first - second;
    }

    public static double divide(double first, double second) throws NumberFormatException {
        if (second == 0) {
            throw new NumberFormatException();
        }
        return first / second;
    }

    public static double multiple(double first, double second) {
        return first * second;
    }

    public static double squareRoot(double figure) throws NumberFormatException {
        if (figure < 0) throw new NumberFormatException();
        else return Math.sqrt(figure);
    }

    public static double cos(double figure) {
        if (figure % 180 == 90 || figure % 180 == -90) return 0;
        return Math.cos(Math.toRadians(figure));
    }

    public static double sin(double figure) {
        return Math.sin(Math.toRadians(figure));
    }

    public static double log(double figure) throws NumberFormatException {
        if (figure <= 0) throw new NumberFormatException();
        return Math.log10(figure);
    }
}
