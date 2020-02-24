package org.epam.oop.home.appliance;

import org.epam.oop.home.appliance.MyException.KitchqnException;
import org.epam.oop.home.appliance.MyException.MaxPowerException;
import org.epam.oop.home.appliance.Supervisor.KitchenDevice;
import org.epam.oop.home.appliance.Supervisor.KitchenMatching;
import org.epam.oop.home.appliance.calc.GetConsumedPower;
import org.epam.oop.home.appliance.defenitionApliance.Appliance;
import org.epam.oop.home.appliance.Supervisor.SequenceSwitchOff;
import org.epam.oop.home.appliance.Supervisor.PowerSupervisor;
import org.epam.oop.home.appliance.sort.of.appliance.SortingByMaxPower;
import org.epam.oop.home.appliance.sort.of.appliance.SortingByKitchen;
import org.epam.oop.home.appliance.sort.of.appliance.SortingByStateOfDevice;
import org.epam.oop.home.appliance.sort.of.appliance.SortingByWeight;

import java.util.Arrays;

public class Run {


    public static void main(String[] args)  {
        Appliance[] dev = Appliance.getDevices();

        try {
            KitchenDevice.kitchen(dev);
        } catch (KitchqnException e) {
            System.out.println("Исправим пренадлежность к кухонным приборам");
            KitchenMatching.kitchenMatching(dev);
        }

        try {
            PowerSupervisor.supervisor(GetConsumedPower.getPower(dev));
            }
        catch (MaxPowerException e){
            System.out.println(e.getMessage());
            System.out.println("последовательное отключение приборов:");
            SequenceSwitchOff.getMaxArray(dev);
            }
        finally {
            screenOut(dev);
        }
    }

    private static void screenOut(Appliance[] dev) {
        System.out.println("\n");
        System.out.println("Сортировка приборов по мощности");
        Arrays.sort(dev, new SortingByMaxPower());
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
        System.out.println("\nМощность приборов включенных в сеть: " +
                Double.valueOf(GetConsumedPower.getPower(dev))/1000  + "кВт");
    }


}
