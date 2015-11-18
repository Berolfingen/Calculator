package com.berolfingen.leo.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class CalcController {

    private static double previousValue = 0;
    private static String operation = "";
    private static final String root = "\u221A";

    public static List<ActionEvent> actions = new ArrayList<>();

    //если только ноль, то не добавляем еще нули
    public static void addListenersToButtons(ArrayList<JButton> list, JTextArea display) {
        for (int i = 0; i < list.size(); i++) {
            switch (list.get(i).getText()) {
                case "0":
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (resettingDisplay(display.getText())) display.setText("");
                            display.setText(display.getText() + "0");
                        }

                    });
                    break;
                case "1":
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (resettingDisplay(display.getText())) display.setText("");
                            display.setText(display.getText() + "1");
                        }
                    });
                    break;
                case "2":
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (resettingDisplay(display.getText())) display.setText("");
                            display.setText(display.getText() + "2");
                        }
                    });
                    break;
                case "3":
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (resettingDisplay(display.getText())) display.setText("");
                            display.setText(display.getText() + "3");
                        }
                    });
                    break;
                case "4":
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (resettingDisplay(display.getText())) display.setText("");
                            display.setText(display.getText() + "4");
                        }
                    });
                    break;
                case "5":
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (resettingDisplay(display.getText())) display.setText("");
                            display.setText(display.getText() + "5");
                        }
                    });
                    break;
                case "6":
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (resettingDisplay(display.getText())) display.setText("");
                            display.setText(display.getText() + "6");
                        }
                    });
                    break;
                case "7":
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (resettingDisplay(display.getText())) display.setText("");
                            display.setText(display.getText() + "7");
                        }
                    });
                    break;
                case "8":
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (resettingDisplay(display.getText())) display.setText("");
                            display.setText(display.getText() + "8");
                        }
                    });
                    break;
                case "9":
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (resettingDisplay(display.getText())) display.setText("");
                            display.setText(display.getText() + "9");
                        }
                    });
                    break;
                case "C":
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (resettingDisplay(display.getText())) display.setText("");
                            String temp = display.getText();
                            if (temp.length() > 0) display.setText(temp.substring(0, temp.length() - 1));
                        }
                    });
                    break;
                case root:
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            display.setText(Double.toString(Math.sqrt(Double.parseDouble(display.getText().trim()))) + " ");
                        }
                    });
                    break;
                case "+":
                    //todo: сделать, чтобы работало и без очищения экрана и float
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            previousValue = Double.parseDouble(display.getText());
                            display.setText("");
                            operation = "+";
                        }
                    });
                    break;
                case "-":
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            previousValue = Double.parseDouble(display.getText());
                            display.setText("");
                            operation = "-";
                        }
                    });
                    break;
                case "*":
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            previousValue = Double.parseDouble(display.getText());
                            display.setText("");
                            operation = "*";
                        }
                    });
                    break;
                case "/":
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            previousValue = Double.parseDouble(display.getText());
                            display.setText("");
                            operation = "/";
                        }
                    });
                    break;
                case "=":
                    list.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int secondValue = Integer.parseInt(display.getText());
                            if ("+".equals(operation)) {
                                display.setText(Double.toString(previousValue + secondValue) + " ");
                            }
                            if ("-".equals(operation)) {
                                display.setText(Double.toString(previousValue - secondValue) + " ");
                            }
                            if ("*".equals(operation)) {
                                display.setText(Double.toString(previousValue * secondValue) + " ");
                            }
                            if ("/".equals(operation)) {
                                display.setText(Double.toString(previousValue / secondValue) + " ");
                            }
                        }
                    });
                    break;
            }
        }
    }

    public static boolean resettingDisplay(String str) {
        if (str.isEmpty() || str == null) return false;
        if (str.charAt(str.length() - 1) == ' ') {
            return true;
        }
        return false;
    }
}
