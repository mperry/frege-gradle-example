package com.github.mperry.frege;

import fj.Unit;
import com.github.mperry.frege.External;

import static fj.Unit.unit;

/**
 * Created by MarkPerry on 10/02/2015.
 */
public class Facade {

    // call Frege code

    public static void main(String [] args) {

        System.out.println("Facade.main");
        String s = External.java2Frege(3);
        System.out.println("java2Frege: " + s);
    }

}
