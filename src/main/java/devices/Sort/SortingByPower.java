package devices.Sort;

import devices.Devices;
import devices.iDevice;

import java.util.Comparator;

/**
 * Сортировка по мощьности приболра с помощью компаратора
 **/

public class SortingByPower implements Comparator<iDevice> {
    private Devices devices;

    @Override
    public int compare(iDevice o1, iDevice o2) {
        if (o1.applaincePower() > o2.applaincePower()) {
            return -1;
        } else if (o1.applaincePower() < o2.applaincePower()) {
            return 1;

        }
        return 0;
    }

}
