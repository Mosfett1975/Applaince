package org.epam.oop.home.appliance.sort.of.appliance;

import org.epam.oop.home.appliance.intfc.IDevice;

import java.util.Comparator;

/**
 * Сортировка по мощьности приболра с помощью компаратора
 **/

public class SortingByMaxPower implements Comparator<IDevice> {
    @Override
    public int compare(IDevice o1, IDevice o2) {
        if (o1.appliancePower() > o2.appliancePower()) {
            return -1;
        } else if (o1.appliancePower() < o2.appliancePower()) {
            return 1;

        }
        return 0;
    }

}
