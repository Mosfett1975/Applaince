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
    private int powerOfAppliance;
    protected int weightOfAppliance;
    protected boolean stateOfAppliance;
    protected boolean kitchenAppliance;




    public Device(TypeOfDevice typeOfDevice, int powerOfAppliance, int weightOfAppliance, boolean stateOfAppliance,
                  boolean kitchenAppliance) {
        this.typeOfDevice = typeOfDevice;
        this.setPowerOfAppliance(powerOfAppliance);
        this.weightOfAppliance = weightOfAppliance;
        this.setStateOfAppliance(stateOfAppliance);
        this.kitchenAppliance = kitchenAppliance;

    }

    @Override
    public String toString() {
        return ANSI_GREEN + "Device type:" + typeOfDevice + "\t" + ANSI_PURPLE + "Power:" + getPowerOfAppliance() + "\t" +
                ANSI_BLUE + "Weight:" + weightOfAppliance + "\t" + ANSI_RED + "Device is On?:" + getPowerOfAppliance() + "\t"
                + ANSI_CYAN + "Device is kitchen?:" + kitchenAppliance;
    }

    @Override
    public int appliancePower() {
        return getPowerOfAppliance();
    }

    @Override
    public boolean applianceIsOn() {
        return getStateOfAppliance();
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


    public void setPowerOfAppliance(int powerOfAppliance) {
        this.powerOfAppliance = powerOfAppliance;
    }

    public int getPowerOfAppliance() {
        return powerOfAppliance;
    }

    public boolean getStateOfAppliance() {
        return stateOfAppliance;
    }

    public void setStateOfAppliance(boolean stateOfAppliance) {
        this.stateOfAppliance = stateOfAppliance;
    }
}

