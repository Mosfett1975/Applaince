package org.epam.oop.home.appliance.sort.of.appliance;

import org.epam.oop.home.appliance.intfc.IDevice;

import java.util.Comparator;

/**
 * Сортировка по признаку кухонного прибора
 **/

public class SortingByKitchen implements Comparator<IDevice> {
    @Override
    public int compare(IDevice o1, IDevice o2) {
        if (!o1.applianceIsKitchen() && o2.applianceIsKitchen()) {
            return 1;
        } else if (o1.applianceIsKitchen() && !o2.applianceIsKitchen()) {
            return -1;
        } else return 0;
    }
}