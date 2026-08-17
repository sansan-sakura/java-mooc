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
public class OneItemBox extends Box {
    private int capacity;
    private ArrayList<Item> item;

    public OneItemBox(){

        capacity = 1;
        item = new ArrayList<>();
    }

    public void add(Item item){
        if(this.item.size() == 1){
            return;
        }
        this.item.add(item);
    }

    public boolean isInBox(Item item){
        return this.item.contains(item);
    }

}
