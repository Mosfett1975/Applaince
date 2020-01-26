package devices;

public interface iDevice extends Comparable <iDevice>{

    /** Мощность устройства**/

    int applaincePower();

    /** прибор включен в сеть?**/

    boolean applainceIsOn();

    /**Кухонный прибор**/

   boolean applainceIsKitchen();

    /** Вес устройства**/

    int weightOfApplaince();

    Devices clone() throws CloneNotSupportedException;

    @Override
    int compareTo(iDevice o);

}
