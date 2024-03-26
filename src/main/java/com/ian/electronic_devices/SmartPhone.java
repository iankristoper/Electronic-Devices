package com.ian.electronic_devices;

/**
 *
 * @author Ian Tagano
 */

public class SmartPhone extends Device
{
    public SmartPhone(String model, String brand, double screenSize, String operatingSystem)
    {
        super(model, brand, screenSize, operatingSystem);
    }
    
    
    //using the abstract methods
    @Override
    public void turnOn()
    {
        System.out.println("Smart Phone is working and booting up");
    }
    
    @Override
    public void turnOff()
    {
        System.out.println("Smart Phone is working and powering off");
    }
    
}
