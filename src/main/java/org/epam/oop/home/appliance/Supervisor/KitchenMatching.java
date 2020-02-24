package org.epam.oop.home.appliance.Supervisor;

import org.epam.oop.home.appliance.defenitionApliance.Appliance;
import static org.epam.oop.home.appliance.applianceType.TypeOfDevice.MICROWAVE;
import static org.epam.oop.home.appliance.applianceType.TypeOfDevice.STOVE;

public class KitchenMatching {

    public static void kitchenMatching(Appliance[] dev){

            for (int i = 0; i < dev.length; i++) {
        if (dev[i].typeOfDevice != MICROWAVE
                || dev[i].typeOfDevice != STOVE )

                {
            System.out.println(dev[i].typeOfDevice.name());
            dev[i].setKitchenAppliance(false);
        }

    }
}
}
