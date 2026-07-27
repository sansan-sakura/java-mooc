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
public class Hold {
    private int maximum;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximum){
        this.maximum = maximum ;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight()+ suitcase.totalWeight() > this.maximum){
            return;
        }

        this.suitcases.add(suitcase);
    }

    public int totalWeight(){
        int totalWeight = 0;

        for(Suitcase item : this.suitcases){
            totalWeight = item.totalWeight() + totalWeight;
        }


        return totalWeight;

    }

    public void printItems(){
        for(Suitcase item : this.suitcases){
            item.printItems();
        }
    }

    public String toString(){
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + "kg)";
    }

}
