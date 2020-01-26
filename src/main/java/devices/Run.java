package devices;

import devices.Sort.SortingByKitchen;
import devices.Sort.SortingByPower;
import devices.Sort.SortingByStateOfDevice;
import devices.Sort.SortingByWeight;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {

        Devices[] dec = Applainces.getDevices();

        System.out.println("Сортировка приборов по мощности");
        Arrays.sort(dec, new SortingByPower());
        Arrays.asList(dec).forEach(System.out::println);
        System.out.println("\n Сортировка приборов по весу");
        Arrays.sort(dec, new SortingByWeight());
        Arrays.asList(dec).forEach(System.out::println);
        System.out.println("\n Сортировка приборов по статусу вкл/выкл");
        Arrays.sort(dec, new SortingByStateOfDevice());
        Arrays.asList(dec).forEach(System.out::println);
        System.out.println("\n Сортировка приборов по принадлежности к кухонным приборам");
        Arrays.sort(dec, new SortingByKitchen());
        Arrays.asList(dec).forEach(System.out::println);
    }


}
