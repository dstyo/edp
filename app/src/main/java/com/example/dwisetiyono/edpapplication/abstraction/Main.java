package com.example.dwisetiyono.edpapplication.abstraction;

/**
 * @author dstyo (dwi.setiyono@dana.id)
 * @version Main.java, v 0.1 17/01/19 01.04 by dstyo
 */
public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Cat cat = new Cat();

        duck.talk();
        cat.talk();
        cat.breath();
    }
}
