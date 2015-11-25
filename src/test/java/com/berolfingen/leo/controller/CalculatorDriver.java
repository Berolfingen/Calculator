package com.berolfingen.leo.controller;


import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.ComponentDriver;
import com.objogate.wl.swing.driver.JButtonDriver;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.driver.JTextFieldDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;

import javax.swing.*;

import static com.berolfingen.leo.Main.MAIN_WINDOW;
import static com.berolfingen.leo.view.CalcUI.ADD_BUTTON;
import static com.berolfingen.leo.view.CalcUI.SUB_BUTTON;
import static com.berolfingen.leo.view.CalcUI.MUL_BUTTON;
import static com.berolfingen.leo.view.CalcUI.DIV_BUTTON;
import static com.berolfingen.leo.view.CalcUI.CALCULATE_BUTTON;
import static com.berolfingen.leo.view.CalcUI.DISPLAY;

import static org.hamcrest.Matchers.equalTo;

public class CalculatorDriver extends JFrameDriver {
    @SuppressWarnings("unchecked")
    public CalculatorDriver() {
        super(new GesturePerformer(), new AWTEventQueueProber(), named(MAIN_WINDOW), showingOnScreen());
    }

    public void inputWithNumberButtons(String numberText) {
        displaysNumber("");
        for (int i = 0; i < numberText.length(); i++) {
            int digit = numberText.charAt(i) - '0';
            clickDigitButton(digit);
        }
        displaysNumber(numberText);
    }

    public void clickDigitButton(int digit) {
        if (0 <= digit && digit <= 9) {
            button(Integer.toString(digit)).click();
        } else {
            throw new IllegalArgumentException("invalid character in number: " + digit);
        }
    }

    public void clickAddButton() {
        button(ADD_BUTTON).click();
    }

    public void clickSubtractButton() {
        button(SUB_BUTTON).click();
    }

    public void clickMultiplyButton() {
        button(MUL_BUTTON).click();
    }

    public void clickDivideButton() {
        button(DIV_BUTTON).click();
    }

    public void performCalculation() {
        calculate().click();
    }

    public JButtonDriver calculate() {
        return button(CALCULATE_BUTTON);
    }

    public void displaysNumber(String expectedResult) {
        display().hasText(equalTo(expectedResult));
    }

    @SuppressWarnings("unchecked")
    private JTextFieldDriver display() {
        return new JTextFieldDriver(this, JTextField.class, ComponentDriver.named(DISPLAY));
    }

    @SuppressWarnings("unchecked")
    private JButtonDriver button(String name) {
        return new JButtonDriver(this, JButton.class, ComponentDriver.named(name));
    }
}