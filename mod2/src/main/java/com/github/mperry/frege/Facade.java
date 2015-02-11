package com.github.mperry.frege;

import fj.Unit;

import static fj.Unit.unit;

/**
 * Created by MarkPerry on 10/02/2015.
 */
public class Facade {

    // call Frege code

    public static void main(String [] args) {

        System.out.println("Facade.main");
        String s = realworld.chapter1.Bridge.java2Frege(3);
        System.out.println("java2Frege: " + s);
    }

}
