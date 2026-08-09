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
public class Recipe {

    private int cookingTime;
    private String name;
    private ArrayList<String> indegredients;

    public Recipe(int time, String name, ArrayList<String> indegredients){
        this.cookingTime = time;
        this.name=name;
        this.indegredients = indegredients;
    }

    public String getName (){
        return this.name;
    }

    public int getCookingTime (){
        return this.cookingTime;
    }

    public ArrayList<String> getIndegredients (){
        return this.indegredients;
    }
    @Override
    public String toString(){
        return this.name + ", cooking time: " + this.cookingTime;
    }

}
