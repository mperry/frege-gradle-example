package com.github.mperry.frege;

import fj.Unit;

import static fj.Unit.unit;

/**
 * Created by MarkPerry on 10/02/2015.
 */
public class Bridge {

    public static Unit fregeJava(Unit u) {
        System.out.println("in fregeJava");
        return unit();
    }

    public static Unit fregeJava2() {
        System.out.println("in fregeJava2");
        return unit();
    }

    public static String fregeJava3() {
        return "fregeJava3";
    }


}
