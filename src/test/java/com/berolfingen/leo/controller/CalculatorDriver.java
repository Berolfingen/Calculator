package com.berolfingen.leo.controller;


import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;
import static com.berolfingen.leo.Main.MAIN_WINDOW;

public class CalculatorDriver extends JFrameDriver {
    @SuppressWarnings("unchecked")
    public CalculatorDriver() {
        super(new GesturePerformer(), new AWTEventQueueProber(), named(MAIN_WINDOW), showingOnScreen());
    }
}