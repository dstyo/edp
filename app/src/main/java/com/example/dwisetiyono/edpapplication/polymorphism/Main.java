package com.example.dwisetiyono.edpapplication.polymorphism;

/**
 * @author dstyo (dwi.setiyono@dana.id)
 * @version Main.java, v 0.1 17/01/19 01.32 by dstyo
 */
public class Main {

    public static void main(String[] args) {
        Holiday day = new NewYear();
        day.showHoliday();
        day.info();

        ((NewYear) day).happy();

        Holiday day2 = new Holiday();
        day2.showHoliday();
    }
}

