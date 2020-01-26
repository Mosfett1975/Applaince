package devices.Sort;

import devices.iDevice;

import java.util.Comparator;

/**
 * Сортировка по статусу прибора в сети - Включен/выключен
 **/

public class SortingByStateOfDevice implements Comparator<iDevice> {
    @Override
    public int compare(iDevice o1, iDevice o2) {
        if (!o1.applainceIsOn() && o2.applainceIsOn()) {
            return 1;
        } else if (o1.applainceIsOn() && !o2.applainceIsOn()) {
            return -1;
        } else return 0;
    }
}
