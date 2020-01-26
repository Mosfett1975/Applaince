package devices.Sort;

import devices.iDevice;

import java.util.Comparator;

/**
 * Сортировка по признаку кухонного прибора
 **/

public class SortingByKitchen implements Comparator<iDevice> {
    @Override
    public int compare(iDevice o1, iDevice o2) {
        if (!o1.applainceIsKitchen() && o2.applainceIsKitchen()) {
            return 1;
        } else if (o1.applainceIsKitchen() && !o2.applainceIsKitchen()) {
            return -1;
        } else return 0;
    }
}