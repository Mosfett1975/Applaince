package org.epam.oop.home.appliance;

public interface IDevice extends Comparable <IDevice>{

    /** Мощность устройства**/

    int appliancePower();

    /** прибор включен в сеть?**/

    boolean applianceIsOn();

    /**Кухонный прибор**/

   boolean applianceIsKitchen();

    /** Вес устройства**/

    int weightOfAppliance();


    @Override
    int compareTo(IDevice o);

}
