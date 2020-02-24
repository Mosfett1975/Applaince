package org.epam.oop.home.appliance.MyException;

public class MaxPowerException extends Exception{
    private int number;

    public MaxPowerException(String message, int num){
        super(message);
        number = num;

    }
    private  int getNumber(){
        return number;
    }
}
