package com.berolfingen.leo.controller;

import com.berolfingen.leo.Main;
import org.junit.After;
import org.junit.Before;


public class CalculatorTestCase {
    protected CalculatorDriver calculatorUI;

    @Before
    public void runTheApplication() {
        Main.main();
        calculatorUI = new CalculatorDriver();
    }

    @After
    public void stopTheApplication() {
        calculatorUI.dispose();
    }
}
