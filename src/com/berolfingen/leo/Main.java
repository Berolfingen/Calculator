package com.berolfingen.leo;

import com.berolfingen.leo.view.CalcUI;


public class Main {
    //добавить логи и тесты
    public static void main(String[] args) {

        CalcUI calcUI = new CalcUI("Calculator"); //добавить возможность изменить размеры окна
        calcUI.getjFrameWithButtons();
    }
}
