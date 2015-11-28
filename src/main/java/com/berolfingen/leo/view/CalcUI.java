package com.berolfingen.leo.view;

import com.berolfingen.leo.controller.CalcController;
import com.objogate.wl.swing.driver.ComponentDriver;
import com.objogate.wl.swing.driver.JButtonDriver;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class CalcUI extends JFrame {

    public static final String ADD_BUTTON = "+";
    public static final String SUB_BUTTON = "-";
    public static final String MUL_BUTTON = "*";
    public static final String DIV_BUTTON = "\\";
    public static final String CALCULATE_BUTTON = "=";
    public static final String DISPLAY = "display";
    public static final String BACKSPACE_BUTTON = "C";
    public static final String PERCENT_BUTTON = "%";
    public static final String ROOT_BUTTON = "\u221A";
    public static final String ON_BUTTON = "on";
    public static final String OFF_BUTTON = "off";
    public static final String SIN_BUTTON = "sin";
    public static final String COS_BUTTON = "cos";
    public static final String LOG_BUTTON = "log";
    public static final String DOT_BUTTON = ".";

    private String title;
    private static JButton calcButton = new JButton(CALCULATE_BUTTON);

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
        calcButton.setName(CALCULATE_BUTTON);
        buttons.add(calcButton);
        createAddNewButton(BACKSPACE_BUTTON, buttons);
        createAddNewButton(PERCENT_BUTTON, buttons);
        createAddNewButton(ROOT_BUTTON, buttons);
        createAddNewButton(ON_BUTTON, buttons);
        createAddNewButton(OFF_BUTTON, buttons);
        createAddNewButton(SIN_BUTTON, buttons);
        createAddNewButton(COS_BUTTON, buttons);
        createAddNewButton(LOG_BUTTON, buttons);
        createAddNewButton(DOT_BUTTON, buttons);

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

    public static void updateCalculateButton(boolean isEnabled) {
       calcButton.setEnabled(isEnabled);
    }


}
