/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakura
 */
public class Item {
    private String name;
    private String id;

    public Item(String name, String id){
        this.name = name;
        this.id =  id;
    }

    public String getName(){
        return this.name;
    }

    public String getId(){
        return this.id;
    }
    @Override
    public boolean equals (Object compared){
        if(compared == this){
            return true;
        }

        if(!(compared instanceof Item)){
            return false;
        }

        Item comparedItem = (Item) compared;

        return  this.id.equals(comparedItem.id);
    }
}
