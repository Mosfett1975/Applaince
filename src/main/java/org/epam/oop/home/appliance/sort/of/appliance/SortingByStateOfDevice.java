package org.epam.oop.home.appliance.sort.of.appliance;

import org.epam.oop.home.appliance.IDevice;

import java.util.Comparator;

/**
 * Сортировка по статусу прибора в сети - Включен/выключен
 **/

public class SortingByStateOfDevice implements Comparator<IDevice> {
    @Override
    public int compare(IDevice o1, IDevice o2) {
        if (!o1.applianceIsOn() && o2.applianceIsOn()) {
            return 1;
        } else if (o1.applianceIsOn() && !o2.applianceIsOn()) {
            return -1;
        } else return 0;
    }
}
