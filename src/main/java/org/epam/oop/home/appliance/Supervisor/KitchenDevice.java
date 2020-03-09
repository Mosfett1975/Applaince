package org.epam.oop.home.appliance.Supervisor;

import org.epam.oop.home.appliance.MyException.KitchqnException;
import org.epam.oop.home.appliance.defenitionApliance.Appliance;
import static org.epam.oop.home.appliance.applianceType.TypeOfDevice.*;

public final class KitchenDevice {

    public static void kitchen(Appliance[] dev) throws KitchqnException {

        for (int i = 0; i < dev.length; i++) {
            if (!(dev[i].typeOfDevice == STOVE || dev[i].typeOfDevice == MICROWAVE)  &&
                    dev[i].applianceIsKitchen() == true ){
                throw new KitchqnException( "Неверный тип для кухонного устройства", dev[i].isKitchenAppliance());
            }
        }
    }


}
