package org.epam.oop.home.appliance;

import org.epam.oop.home.appliance.calc.GetConsumedPower;
import org.epam.oop.home.appliance.defenitionApliance.Appliance;
import org.epam.oop.home.appliance.sort.of.appliance.SortingByPower;
import org.epam.oop.home.appliance.sort.of.appliance.SortingByKitchen;
import org.epam.oop.home.appliance.sort.of.appliance.SortingByStateOfDevice;
import org.epam.oop.home.appliance.sort.of.appliance.SortingByWeight;

import java.util.Arrays;

public class Run {


    public static void main(String[] args) {
        Appliance[] dev = Appliance.getDevices();

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
        System.out.println(GetConsumedPower.getPower(dev));


    }


}
