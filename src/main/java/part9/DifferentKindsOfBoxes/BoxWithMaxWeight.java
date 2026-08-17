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
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public void add (Item item){
        int totalWeight = item.getWeight();
        for(Item i : items){
            totalWeight += i.getWeight();
        }

        if(totalWeight <= capacity){
            items.add(item);
        }


    }

    public boolean isInBox(Item item){
        return items.contains(item);
    }

}
