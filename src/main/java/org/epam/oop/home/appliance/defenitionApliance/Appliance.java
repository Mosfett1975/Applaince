package org.epam.oop.home.appliance.defenitionApliance;

import org.epam.oop.home.appliance.applianceType.TypeOfDevice;
import org.epam.oop.home.appliance.impl.Device;
import org.epam.oop.home.appliance.randomizer.PowerRandom;

public class Appliance extends Device {



    public String name;

    public Appliance(TypeOfDevice typeOfDevice, String name, int powerOfAppliance, int weightOfAppliance,
                     boolean stateOfAppliance, boolean kitchenAppliance) {
        super(typeOfDevice, powerOfAppliance, weightOfAppliance, stateOfAppliance, kitchenAppliance);
        this.name = name;

    }

    public static Appliance[] getDevices() {
        Appliance tvSet = new Appliance(TypeOfDevice.TV, " Sony kdl-40wd653", PowerRandom.powerRandom(),
                3, PowerRandom.randomBoolean(),  PowerRandom.randomBoolean());
        Appliance deskTop = new Appliance(TypeOfDevice.COMPUTER, " AMD K-6 Desktop", PowerRandom.powerRandom(),
                8,  PowerRandom.randomBoolean(),  PowerRandom.randomBoolean());
        Appliance laptop = new Appliance(TypeOfDevice.COMPUTER, " Laptop SONY VAIO Tap 11", PowerRandom.powerRandom(),
                2,  PowerRandom.randomBoolean(),  PowerRandom.randomBoolean());
        Appliance microwave = new Appliance(TypeOfDevice.MICROWAVE, " Midea AM820CMF", PowerRandom.powerRandom(),
                10,  PowerRandom.randomBoolean(),  PowerRandom.randomBoolean());
        Appliance stove = new Appliance(TypeOfDevice.STOVE, " Electrolux IPE 6453", PowerRandom.powerRandom(),
                15,  PowerRandom.randomBoolean(),  PowerRandom.randomBoolean());


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
                + ANSI_PURPLE + "Power:" + getPowerOfAppliance() + "\t" + ANSI_BLUE + "Weight:" + weightOfAppliance
                + "\t" + ANSI_RED + "Device is On?:" + stateOfAppliance + "\t" + ANSI_CYAN + "Device is kitchen?:"
                + kitchenAppliance;
    }


}

