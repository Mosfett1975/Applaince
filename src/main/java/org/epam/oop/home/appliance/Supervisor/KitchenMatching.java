package org.epam.oop.home.appliance.Supervisor;

import org.epam.oop.home.appliance.applianceType.TypeOfDevice;
import org.epam.oop.home.appliance.defenitionApliance.Appliance;
import static org.epam.oop.home.appliance.applianceType.TypeOfDevice.MICROWAVE;
import static org.epam.oop.home.appliance.applianceType.TypeOfDevice.STOVE;

public class KitchenMatching {

    public static void kitchenMatching(Appliance[] dev){

//        for(Appliance dev1:dev){
//            if (dev1.typeOfDevice ==
//        }
            for (int i = 0; i < dev.length; i++) {
        if (!(dev[i].typeOfDevice == MICROWAVE
                || dev[i].typeOfDevice == STOVE ))
                {
            dev[i].setKitchenAppliance(false);
        }

    }
}
}
