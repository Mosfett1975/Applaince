package org.epam.oop.home.appliance;

public class Appliance extends Device {

    private String name;
    private TypeOfDevice typeOfDevice;
    private int powerOfAppliance;
    private int weightOfAppliance;
    private boolean stateOfAppliance;
    private boolean kitchenAppliance;


    public Appliance(TypeOfDevice typeOfDevice, String name, int powerOfAppliance, int weightOfAppliance,
                     boolean stateOfAppliance, boolean kitchenAppliance) {
        super(typeOfDevice, powerOfAppliance, weightOfAppliance, stateOfAppliance, kitchenAppliance);
        this.name = name;
        this.typeOfDevice = typeOfDevice;
        this.powerOfAppliance = powerOfAppliance;
        this.weightOfAppliance = weightOfAppliance;
        this.stateOfAppliance = stateOfAppliance;
        this.kitchenAppliance = kitchenAppliance;
    }

    public static Appliance[] getDevices() {
        Appliance tvSet = new Appliance(TypeOfDevice.TV, " Sony kdl-40wd653", 100,
                3, false, false);
        Appliance deskTop = new Appliance(TypeOfDevice.COMPUTER, " AMD K-6 Desktop", 1000,
                8, true, false);
        Appliance laptop = new Appliance(TypeOfDevice.COMPUTER, " Laptop SONY VAIO Tap 11", 300,
                2, false, false);
        Appliance microwave = new Appliance(TypeOfDevice.MICROWAVE, " Midea AM820CMF", 1500,
                10, true, true);
        Appliance stove = new Appliance(TypeOfDevice.STOVE, " Electrolux IPE 6453", 7000,
                15, true, true);


        Appliance[] dev = new Appliance[5];
        dev[0] = tvSet;
        dev[1] = deskTop;
        dev[2] = microwave;
        dev[3] = stove;
        dev[4] = laptop;
        return dev;
    }

    @Override
    public String toString() {
        return ANSI_GREEN + "Device type:" + typeOfDevice + "\t" + ANSI_RED + "Name of device:" + name + "\t"
                + ANSI_PURPLE + "Power:" + powerOfAppliance + "\t" + ANSI_BLUE + "Weight:" + weightOfAppliance
                + "\t" + ANSI_RED + "Device is On?:" + stateOfAppliance + "\t" + ANSI_CYAN + "Device is kitchen?:"
                + kitchenAppliance;
    }


}

