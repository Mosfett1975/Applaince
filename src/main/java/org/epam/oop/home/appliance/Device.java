package org.epam.oop.home.appliance;

public class Device implements IDevice {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    private TypeOfDevice typeOfDevice;
    private int powerOfAppliance;
    private int weightOfAppliance;
    private boolean stateOfAppliance;
    private boolean kitchenAppliance;


    public Device(TypeOfDevice typeOfDevice, int powerOfAppliance, int weightOfAppliance, boolean stateOfAppliance,
                  boolean kitchenAppliance) {
        super();
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

    @Override
    public Device clone() throws CloneNotSupportedException {
        return (Device) super.clone();
    }


}
