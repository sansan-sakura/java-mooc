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
public class Package {
    private ArrayList<Gift> packages;

    public Package (){
        this.packages = new ArrayList<>();
    }

    public void addGift(Gift gift){
        this.packages.add(gift);
    }

    public int totalWeight(){
        int sum =0;
        for(Gift gift: packages){
            sum = sum + gift.getWeight();
        }

        return sum;
    }

}
