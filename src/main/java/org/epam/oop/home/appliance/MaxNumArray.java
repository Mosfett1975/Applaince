package org.epam.oop.home.appliance;

import org.epam.oop.home.appliance.calc.GetConsumedPower;
import org.epam.oop.home.appliance.defenitionApliance.Appliance;


public class MaxNumArray {

    public static void getMaxArray(Appliance[] dev){

        int max = dev[0].getPowerOfAppliance();

        for (int i=0; i < dev.length; i++){
            if (max > dev[i].getPowerOfAppliance()
   //                && dev[i].getStateOfAppliance() == true && GetConsumedPower.getPower(dev) > 15000
            ) { max = dev[i].getPowerOfAppliance();
                dev[i].setStateOfAppliance(false);}}
            System.out.println("Отключаем приборы начиная с самого маломощного");
        System.out.println(max);


    }
}
