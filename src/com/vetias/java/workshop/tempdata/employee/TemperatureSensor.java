package com.vetias.java.workshop.tempdata.employee;

public class TemperatureSensor {
    private  float Temperature;
    public TemperatureSensor(float aTemperature) {
      Temperature = aTemperature;

    }
     public float getReading(){
        return Temperature;
     }


}
