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
public class Herd implements Movable {
    private ArrayList<Movable> lists;

    public Herd(){
        lists =  new ArrayList<>();
    }

    public void addToHerd(Movable movable){
        lists.add(movable);

    }

    @Override
    public void move(int dx, int dy){
        for(Movable movable: lists){
            movable.move(dx,dy);
        }

    }

    @Override
    public String toString(){
        String output = "";
        for(Movable movable: lists){
            output = output + movable + "\n";
        }
        return output;

    }

}
