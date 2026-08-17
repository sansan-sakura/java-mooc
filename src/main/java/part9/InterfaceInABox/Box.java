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
public class Box implements Packable {
    private double maxWeight;
    private ArrayList<Packable> items;

    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void add(Packable item){
        double totalWeight = weight() + item.weight();

        if(totalWeight <= maxWeight){
            items.add(item);
        }
    }

    public double weight(){
        double totalWeight = 0;
        for(Packable item: items){
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString(){
        return "Box: " + items.size() + " items, total weight " + weight()+ " kg";
    }


}
