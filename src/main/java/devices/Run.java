package devices;

import devices.Sort.SortingByKitchen;
import devices.Sort.SortingByPower;
import devices.Sort.SortingByStateOfDevice;
import devices.Sort.SortingByWeight;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {

        Devices[] dev = Applainces.getDevices();

        System.out.println("Сортировка приборов по мощности");
        Arrays.sort(dev, new SortingByPower());
        Arrays.asList(dev).forEach(System.out::println);
        System.out.println("\n Сортировка приборов по весу");
        Arrays.sort(dev, new SortingByWeight());
        Arrays.asList(dev).forEach(System.out::println);
        System.out.println("\n Сортировка приборов по статусу вкл/выкл");
        Arrays.sort(dev, new SortingByStateOfDevice());
        Arrays.asList(dev).forEach(System.out::println);
        System.out.println("\n Сортировка приборов по принадлежности к кухонным приборам");
        Arrays.sort(dev, new SortingByKitchen());
        Arrays.asList(dev).forEach(System.out::println);
    }


}
