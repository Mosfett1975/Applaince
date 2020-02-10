package org.epam.oop.home.appliance.powerSupervisor;

public final class Supervisor {

    private static int maxPower = 15000;


    public static void supervisor(int totalPower) throws Exception {
        if (totalPower <= maxPower) {
            System.out.println("Total power correct - "+totalPower + " Watt");
        } else {
            throw new IllegalArgumentException("Your power line was overloaded. Max power - " + maxPower + " Current power - " + totalPower );
        }

    }
}
