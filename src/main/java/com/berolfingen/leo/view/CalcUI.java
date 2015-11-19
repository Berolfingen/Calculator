package com.berolfingen.leo.view;

import com.berolfingen.leo.controller.CalcController;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class CalcUI extends JFrame {
    private static final String root = "\u221A";
    private String title;

    public CalcUI(String title) {
        this.title = title;
        setBounds(350, 350, 350, 350);
        setLayout(new BorderLayout());
        setVisible(true);
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public static ArrayList<JButton> getButtons() {
        ArrayList<JButton> buttons = new ArrayList<>();
        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonSum = new JButton("+");
        JButton buttonBack = new JButton("C");
        JButton buttonDivide = new JButton("/");
        JButton buttonSub = new JButton("-");
        JButton buttonMul = new JButton("*");
        JButton buttonResult = new JButton("=");
        JButton buttonPerc = new JButton("%");
        JButton buttonRoot = new JButton(root);
        JButton buttonOn = new JButton("on");
        JButton buttonOff = new JButton("off");
        JButton buttonSin = new JButton("sin");
        JButton buttonCos = new JButton("cos");
        JButton buttonPoint = new JButton(".");
        JButton buttonLog = new JButton("log");

        buttons.add(buttonSum);
        buttons.add(buttonDivide);
        buttons.add(buttonMul);
        buttons.add(buttonSub);
        buttons.add(button0);
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(buttonOn);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(buttonOff);
        buttons.add(button6);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(buttonRoot);
        buttons.add(button9);
        buttons.add(buttonPoint);
        buttons.add(buttonResult);
        buttons.add(buttonPerc);
        buttons.add(buttonSin);
        buttons.add(buttonCos);
        buttons.add(buttonBack);
        buttons.add(buttonLog);

        return buttons;
    }


    public void getjFrameWithButtons() {
        JTextArea display = new JTextArea();
        JPanel buttonsPanel = new JPanel(new GridLayout(6, 4));

        this.add(display, BorderLayout.NORTH);
        add(buttonsPanel, BorderLayout.CENTER);

        ArrayList<JButton> buttons = getButtons();

        for (int i = 0; i < buttons.size(); i++) {
            buttonsPanel.add(buttons.get(i));
        }

        this.setVisible(true);

        CalcController.addListenersToButtons(buttons, display);
    }
}
