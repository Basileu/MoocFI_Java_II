/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author basil
 */
public class TemperatureSensor implements Sensor {
    private enum StatusSensor {
        ON, OFF;
    }
    
    private StatusSensor status;

    public TemperatureSensor() {
        status = StatusSensor.OFF;
    }
    
    @Override
    public boolean isOn() {
        return status == StatusSensor.ON;
    }

    @Override
    public void setOn() {
        status = StatusSensor.ON;
    }

    @Override
    public void setOff() {
        status = StatusSensor.OFF;
    }

    @Override
    public int read() {
        if (status == StatusSensor.ON) {
            int nr = new Random().nextInt(61) - 30;
//            System.out.println("int nr = new Random().nextInt(61) - 60; = " + nr);
            return nr;
        } else {
            throw new IllegalStateException();
        }
    }
    
}
