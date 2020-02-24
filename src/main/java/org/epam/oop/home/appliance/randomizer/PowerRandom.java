package org.epam.oop.home.appliance.randomizer;

import java.util.Random;

public class PowerRandom {


    public static final int powerRandom() {
        {
            int min = 100;
            int max = 10000;
            Random rnd = new Random();
            return rnd.ints(min,(max+1)).findFirst().getAsInt();
        }

    }

    public static boolean randomBoolean(){
        return Math.random() < 0.5;
    }
}
