package org.epam.oop.home.appliance.randommizer;

import java.util.Random;

public class PowerRandom {


    public static final int powerRandom() {
        {
            int min = 100;
            int max = 7000;
            Random rnd = new Random();
            return rnd.ints(min,(max+1)).findFirst().getAsInt();
        }

    }
}
