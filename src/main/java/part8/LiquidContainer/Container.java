/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakura
 */
public class Container {

    private int amount;

    public Container(){
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount){
        if(amount < 0){
            return;
        }
        int total = this.amount + amount;
        if(total > 100){
            total =  100;
        }
        this.amount = total;
    }

    public void remove(int amount){
        if(amount < 0){
            return;
        }
        int total = this.amount - amount;
        if(total < 0){
            total =  0;
        }
        this.amount = total;

    }

    public String toString(){
        return this.amount + "/100";
    }



}
