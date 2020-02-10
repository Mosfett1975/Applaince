package org.epam.oop.home.appliance.calc;

import org.epam.oop.home.appliance.defenitionApliance.Appliance;
import org.epam.oop.home.appliance.intfc.IDevice;

public class GetConsumedPower {
    public static int getPower(Appliance[] dev) {
        StringBuilder sb = new StringBuilder();
        int consumedPower = 0;
        for (IDevice device : dev) {
            if (device.applianceIsOn()) {
                consumedPower += device.appliancePower();
            }
        }
        sb.append("\n Consumed power of devices included in the network: " + consumedPower);
        return consumedPower;

    }
}