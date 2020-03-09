package org.epam.oop.home.appliance.Supervisor;

import org.epam.oop.home.appliance.calc.GetConsumedPower;
import org.epam.oop.home.appliance.defenitionApliance.Appliance;
import org.epam.oop.home.appliance.sort.of.appliance.SortingByMinPower;
import java.util.Arrays;
/**
Последовательное отключение нагрузки, начиная с самой маломощной
 **/

public final class SequenceSwitchOff {

    public static void getMaxArray(Appliance[] dev) {

        Arrays.sort(dev, new SortingByMinPower());

        for (int i = 0; i < dev.length; i++) {
if (dev[i].applianceIsOn() == true && GetConsumedPower.getPower(dev) > 15000){
    System.out.println("Отключаем прибор " + dev[i].name);
    dev[i].setStateOfAppliance(false);
}
        }
    }


}
