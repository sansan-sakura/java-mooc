/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakura
 */
public class Timer {
    private int hundredth;
    private int seconds;

    public Timer(){
        hundredth = 0;
        seconds = 0;
    }

    public String toString(){

        return (seconds < 10 ? "0" + seconds : seconds) + ":"  + (hundredth<10? "0" + hundredth  : hundredth);
    }

    public void advance(){
        if(hundredth < 99){
            hundredth ++;
        } else {
            hundredth = 0;
            if(seconds < 59){
                seconds ++;
            } else {
                seconds = 0;
            }

        }

    }

}
