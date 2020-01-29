package org.epam.oop.home.appliance.sort.of.appliance;

import org.epam.oop.home.appliance.intfc.IDevice;

import java.util.Comparator;

/**
 * Сортировка по весу прибора
 **/

public class SortingByWeight implements Comparator<IDevice> {
    @Override
    public int compare(IDevice o1, IDevice o2) {
        if (o1.weightOfAppliance() > o2.weightOfAppliance()) {
            return -1;
        } else if (o1.weightOfAppliance() < o2.weightOfAppliance()) {
            return 1;
        }
        return 0;
    }
}
