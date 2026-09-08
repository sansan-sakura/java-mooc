/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sakura
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public  AverageSensor(){
        sensors = new ArrayList<>();
        readings = new ArrayList<>();

    }

    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);

    }

    public boolean isOn(){
        return sensors.stream().allMatch(Sensor::isOn);
    }

    public void setOn(){
        sensors.forEach(Sensor::setOn);

    }

    public void setOff(){
        sensors.forEach(Sensor::setOff);
    }

    public int read(){
        if(sensors.size() == 0 || !isOn()){
            throw new IllegalStateException("No sensors has been found");
        }
        int sum = 0;
        for(Sensor s: sensors){
            sum = sum + s.read();
        }

        int average = sum / sensors.size();
        readings.add(average);
        return average;
    }

    public List<Integer> readings(){
        return readings;
    }
}
