package com.ian.electronic_devices;

/**
 *
 * @author Ian Tagano
 */

public abstract class Device 
{
    //private data
    private String brand;
    private String model;
    private double screenSize;
    private String operatingSystem;
    
    //constructor
    public Device(String brand, String model, double screenSize, String operatingSystem)
    {
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
    }
    
    
    //getter
    public String getBrand()
    {
        return brand;
    }
    
    //getter
    public String getModel()
    {
        return model;
    }
    
    //getter
    public double getScreenSize()
    {
        return screenSize;
    }
    
    //getter
    public String getOperatingSystem()
    {
        return operatingSystem;
    }
    
    
    //abstract methods
    public abstract void turnOn();
    public abstract void turnOff();
}
