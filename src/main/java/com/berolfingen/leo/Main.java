package com.berolfingen.leo;

import com.berolfingen.leo.view.CalcUI;


public class Main {
    public static final String MAIN_WINDOW = "Calculator";

    public static void main(String... args) {

        CalcUI calcUI = new CalcUI(MAIN_WINDOW);
        calcUI.setName(MAIN_WINDOW);
        calcUI.getjFrameWithButtons();
    }
}
