package com.berolfingen.leo.view;

import com.berolfingen.leo.controller.CalcController;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class CalcUI extends JFrame {
    private static final String root = "\u221A";
    public static final String ADD_BUTTON = "+";
    public static final String SUB_BUTTON = "-";
    public static final String MUL_BUTTON = "*";
    public static final String DIV_BUTTON = "\\";
    public static final String CALCULATE_BUTTON = "=";
    public static final String DISPLAY = "display";
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

    public static void createAddDigitButtons(List<JButton> buttons) {
        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(Integer.toString(i));
            button.setName(Integer.toString(i));
            buttons.add(button);
        }
    }

    public static void createAddNewButton(String name, List<JButton> buttons) {
        JButton button = new JButton(name);
        button.setName(name);
        buttons.add(button);
    }

    public static ArrayList<JButton> getButtons() {
        ArrayList<JButton> buttons = new ArrayList<>();
        createAddDigitButtons(buttons);
        createAddNewButton(ADD_BUTTON, buttons);
        createAddNewButton(SUB_BUTTON, buttons);
        createAddNewButton(DIV_BUTTON, buttons);
        createAddNewButton(MUL_BUTTON, buttons);
        createAddNewButton(CALCULATE_BUTTON, buttons);
        JButton buttonBack = new JButton("C");
        JButton buttonPerc = new JButton("%");
        JButton buttonRoot = new JButton(root);
        JButton buttonOn = new JButton("on");
        JButton buttonOff = new JButton("off");
        JButton buttonSin = new JButton("sin");
        JButton buttonCos = new JButton("cos");
        JButton buttonPoint = new JButton(".");
        JButton buttonLog = new JButton("log");

        buttons.add(buttonOn);
        buttons.add(buttonOff);
        buttons.add(buttonRoot);
        buttons.add(buttonPoint);
        buttons.add(buttonPerc);
        buttons.add(buttonSin);
        buttons.add(buttonCos);
        buttons.add(buttonBack);
        buttons.add(buttonLog);

        return buttons;
    }


    public void getjFrameWithButtons() {
        JTextField display = new JTextField();
        display.setName(DISPLAY);
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
