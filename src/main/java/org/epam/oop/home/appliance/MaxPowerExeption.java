package org.epam.oop.home.appliance;

public class MaxPowerExeption extends Exception{
    private int number;

    public MaxPowerExeption(String message, int num){
        super(message);
        number = num;

    }
    private  int getNumber(){
        return number;
    }
}
