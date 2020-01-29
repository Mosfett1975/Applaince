package org.epam.oop.home.appliance.impl;

import org.epam.oop.home.appliance.intfc.IDevice;
import org.epam.oop.home.appliance.applianceType.TypeOfDevice;

public class Device implements IDevice {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    protected TypeOfDevice typeOfDevice;
    protected int powerOfAppliance;
    protected int weightOfAppliance;
    protected boolean stateOfAppliance;
    protected boolean kitchenAppliance;


    public Device(TypeOfDevice typeOfDevice, int powerOfAppliance, int weightOfAppliance, boolean stateOfAppliance,
                  boolean kitchenAppliance) {
        this.typeOfDevice = typeOfDevice;
        this.powerOfAppliance = powerOfAppliance;
        this.weightOfAppliance = weightOfAppliance;
        this.stateOfAppliance = stateOfAppliance;
        this.kitchenAppliance = kitchenAppliance;

    }

    @Override
    public String toString() {
        return ANSI_GREEN + "Device type:" + typeOfDevice + "\t" + ANSI_PURPLE + "Power:" + powerOfAppliance + "\t" +
                ANSI_BLUE + "Weight:" + weightOfAppliance + "\t" + ANSI_RED + "Device is On?:" + stateOfAppliance + "\t"
                + ANSI_CYAN + "Device is kitchen?:" + kitchenAppliance;
    }

    @Override
    public int appliancePower() {
        return powerOfAppliance;
    }

    @Override
    public boolean applianceIsOn() {
        return stateOfAppliance;
    }

    @Override
    public int weightOfAppliance() {
        return weightOfAppliance;
    }

    @Override
    public boolean applianceIsKitchen() {
        return kitchenAppliance;
    }

    @Override
    public int compareTo(IDevice o) {
        return 0;
    }
}
