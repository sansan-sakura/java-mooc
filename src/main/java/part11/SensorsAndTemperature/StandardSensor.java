/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author sakura
 */
public class StandardSensor implements Sensor {
    private int number;

    public StandardSensor(int num){
        this.number = num;

    }
    public boolean isOn(){
        return true;
    }

    public void setOn(){

    }

    public void setOff(){


    }

    public int read(){
        return number;
    }


}
