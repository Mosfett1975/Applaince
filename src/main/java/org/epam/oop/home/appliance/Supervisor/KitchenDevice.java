package org.epam.oop.home.appliance.Supervisor;

import org.epam.oop.home.appliance.MyException.KitchenException;
import org.epam.oop.home.appliance.defenitionApliance.Appliance;
import static org.epam.oop.home.appliance.applianceType.TypeOfDevice.*;

public final class KitchenDevice {

    public static void kitchen(Appliance[] dev) throws KitchenException {

        for (int i = 0; i < dev.length; i++) {
            if (!(dev[i].typeOfDevice == STOVE || dev[i].typeOfDevice == MICROWAVE)  &&
                    dev[i].applianceIsKitchen() == true ){
                throw new KitchenException( "Неверный тип для кухонного устройства");
            }
        }
    }


}
