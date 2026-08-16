/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author sakura
 */
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory(){
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear(){
        history.clear();
    }

    public double maxValue(){
        if(history.size() == 0){
            return 0;
        }
        double max = history.get(0);

        for(double n : history){
            if(n > max){
                max = n;
            }

        }
        return max;



    }

    public double minValue(){
        if(history.size() == 0){
            return 0;
        }

        double min = history.get(0);

        for(double n : history){
            if(n < min){
                min = n;
            }

        }
        return min;
    }

    public double average(){
        int size = history.size();
        if(size == 0){
            return 0;
        }

        double sum = 0;

        for(double n : history){

            sum += n;


        }
        return sum/size;

    }

    public String toString(){
        return history.toString();
    }




}
