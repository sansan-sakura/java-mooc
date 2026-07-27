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
public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maxWeight){
        this.maximumWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        int totalWeight = this.totalWeight();

        if(totalWeight+item.getWeight() > this.maximumWeight){
            return;
        }
        this.items.add(item);

    }

    public int totalWeight(){
        int totalWeight = 0;

        for(Item itemInSuitcase: this.items){
            totalWeight = totalWeight + itemInSuitcase.getWeight();
        }

        return totalWeight;

    }

    public void printItems(){
        for(Item itemInSuitcase: this.items){
            System.out.println(itemInSuitcase.getName() + " ( " + itemInSuitcase.getWeight() + " kg)" );
        }

    }

    public Item heaviestItem(){
        if(this.items.size() == 0){
            return null;
        }
        Item heaviest = this.items.get(0);

        for(Item itemInSuitcase: this.items){
            if(heaviest.getWeight() < itemInSuitcase.getWeight()){
                heaviest = itemInSuitcase;
            }
        }
        return heaviest;

    }

    public String toString(){
        String output = "";

        if(this.items.size() == 0){
            output = "no items";
        }

        if(this.items.size() == 1){
            output = "1 item";
        }
        if(this.items.size() > 1){
            output = this.items.size() + " items";
        }


        return output + " (" + this.totalWeight() + " kg)";

    }


}
