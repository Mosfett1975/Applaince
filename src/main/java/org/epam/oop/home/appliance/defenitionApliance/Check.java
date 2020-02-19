package org.epam.oop.home.appliance.defenitionApliance;

import org.epam.oop.home.appliance.applianceType.TypeOfDevice;



public class Check extends Appliance {

    Check check = new Check(typeOfDevice, name, getPowerOfAppliance(), weightOfAppliance, stateOfAppliance, kitchenAppliance);


    public Check(TypeOfDevice typeOfDevice, String name, int powerOfAppliance, int weightOfAppliance, boolean stateOfAppliance, boolean kitchenAppliance) {
        super(typeOfDevice, name, powerOfAppliance, weightOfAppliance, stateOfAppliance, kitchenAppliance);
    }




    public void arrayex() {
       System.out.println(check);

}
}
