package devices.Sort;

import devices.iDevice;

import java.util.Comparator;

/**
 * Сортировка по весу прибора
 **/

public class SortingByWeight implements Comparator<iDevice> {
    @Override
    public int compare(iDevice o1, iDevice o2) {
        if (o1.weightOfApplaince() > o2.weightOfApplaince()) {
            return -1;
        } else if (o1.weightOfApplaince() < o2.weightOfApplaince()) {
            return 1;
        }
        return 0;
    }
}
