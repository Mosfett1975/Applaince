package org.epam.oop.home.appliance.Supervisor;


import org.epam.oop.home.appliance.defenitionApliance.Appliance;
import static org.epam.oop.home.appliance.applianceType.TypeOfDevice.MICROWAVE;
import static org.epam.oop.home.appliance.applianceType.TypeOfDevice.STOVE;

public final class KitchenMatching {

    public static void kitchenMatching(Appliance[] dev){

        for(int i = 0; i < dev.length; i++){
            if (!(dev[i].typeOfDevice == MICROWAVE || dev[i].typeOfDevice == STOVE)){
                dev[i].setKitchenAppliance(false);
            }
            else dev[i].setKitchenAppliance(true);
        }
}
}