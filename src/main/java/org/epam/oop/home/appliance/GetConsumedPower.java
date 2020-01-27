package org.epam.oop.home.appliance;

public class GetConsumedPower {
    static String getPower(Appliance[] dev) {
        StringBuilder sb = new StringBuilder();
        int consumedPower = 0;
        for (IDevice device : dev) {
            if (device.applianceIsOn()) {
                consumedPower += device.appliancePower();
            }
        }
        sb.append("\n Consumed power of devices included in the network: " + consumedPower);
        return sb.toString();

    }
}