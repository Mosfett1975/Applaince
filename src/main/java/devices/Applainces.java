package devices;

public class Applainces {
    public static  Devices[] getDevices() {
        Devices tvSet = new Devices(TypeOfDevice.TV, 100, 3, false, false);
        Devices deskTop = new Devices(TypeOfDevice.COMPUTER, 1000, 8, true, false);
        Devices microwave = new Devices(TypeOfDevice.Microwave, 1500, 10, true, true);
        Devices stove = new Devices(TypeOfDevice.STOVE, 7000, 15, true, true);

        Devices[] dev = new Devices[4];
        dev[0] = tvSet;
        dev[1] = deskTop;
        dev[2] = microwave;
        dev[3] = stove;
        return dev;
    }

}
