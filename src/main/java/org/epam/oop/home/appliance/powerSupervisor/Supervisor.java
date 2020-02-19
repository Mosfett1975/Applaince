package org.epam.oop.home.appliance.powerSupervisor;

import org.epam.oop.home.appliance.MaxPowerExeption;

public final class Supervisor {

    private static int maxPower = 15000;


    public static void supervisor(int totalPower) throws MaxPowerExeption {
        if (totalPower > maxPower) throw new MaxPowerExeption("При текущей нагрузке линия будет перегружена",
                maxPower);
        System.out.println("Total power correct - "+totalPower + " Watt");
    }
}
