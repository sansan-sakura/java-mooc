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
        this.amount =0;
    }


    public int contains(){
        return this.amount;
    }

    public void add(int amount){
        if(amount < 0 ){
            return;
        }

        int totalAmount = this.amount + amount;
        if(totalAmount > 100){
            this.amount = 100;
            return;
        }
        this.amount = totalAmount;

    }

    public void remove(int amount){
        if(amount < 0 ){
            return;
        }

        int totalAmount = this.amount - amount;
        if(totalAmount < 0 ){
            this.amount = 0;
            return;
        }
        this.amount = totalAmount;

    }

    public String toString(){
        return  this.amount + "/100";
    }





}
