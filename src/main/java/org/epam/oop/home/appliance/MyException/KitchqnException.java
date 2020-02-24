package org.epam.oop.home.appliance.MyException;

public class KitchqnException extends Exception {
    private boolean kitchen;

    public KitchqnException(String message, boolean isKitchenDevice){
        super(message);
        kitchen = isKitchenDevice;
    }
    private  boolean getKitchen(){
        return kitchen;
    }
}
