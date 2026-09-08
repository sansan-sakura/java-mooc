/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.Random;

/**
 *
 * @author sakura
 */
public class TemperatureSensor implements Sensor {
    private int number;
    private boolean isOn = false;

    public boolean isOn(){
        return isOn;
    }

    public void setOn(){
        isOn = true;
    }

    public void setOff(){
        isOn = false;

    }

    public int read(){
        if(isOn){
            return new Random().nextInt(61) - 30;
        }

        throw new IllegalStateException("should set to on");
    }

}
