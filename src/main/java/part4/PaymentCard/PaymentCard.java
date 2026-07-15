/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakura
 */
public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance){
        balance = openingBalance;
    }

    public String toString(){
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably() {
        if(balance - 2.60 < 0){
            return;
        }
        balance = balance - 2.60;

    }

    public void eatHeartily() {
        if(balance - 4.60 < 0){
            return;
        }
        balance = balance - 4.6;

    }

    public void addMoney(double amount) {

        if(amount < 0){
            return;
        }

        double total = balance + amount;

        if(total >=  150){
            balance = 150;
            return;
        }

        balance = total;

    }