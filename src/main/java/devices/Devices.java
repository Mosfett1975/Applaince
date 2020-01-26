package devices;

public class Devices implements iDevice, Cloneable {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    private TypeOfDevice typeOfDevice;
    private int powerOfApplaince;
    private int weightOfApplience;
    private boolean stateOfApplience;
    private boolean kitchenApplience;

    public Devices(TypeOfDevice typeOfDevice, int powerOfApplaince, int weightOfApplience, boolean stateOfApplience,
                   boolean kitchenApplience) {
        super();
        this.typeOfDevice = typeOfDevice;
        this.powerOfApplaince = powerOfApplaince;
        this.weightOfApplience = weightOfApplience;
        this.stateOfApplience = stateOfApplience;
        this.kitchenApplience = kitchenApplience;

    }

    @Override
    public String toString() {
        return ANSI_GREEN + "Device type:" + typeOfDevice + "\t" + ANSI_PURPLE + "Power:" + powerOfApplaince + "\t" +
                ANSI_BLUE + "Weight:" + weightOfApplience + "\t" + ANSI_RED + "Device is On?:" + stateOfApplience + "\t"
                + ANSI_CYAN + "Device is kitchen?:" + kitchenApplience;
    }

    @Override
    public int applaincePower() {
        return powerOfApplaince;
    }

    @Override
    public boolean applainceIsOn() {
        return stateOfApplience;
    }

    @Override
    public int weightOfApplaince() {
        return weightOfApplience;
    }

    @Override
    public boolean applainceIsKitchen() {
        return kitchenApplience;
    }

    @Override
    public int compareTo(iDevice o) {
        return 0;
    }

    @Override
    public Devices clone() throws CloneNotSupportedException {
        return (Devices) super.clone();

    }
}
