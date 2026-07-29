/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author sakura
 */
public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager(){
        this.jokes = new ArrayList<>();

    }

    public void addJoke(String joke){
        this.jokes.add(joke);

    }

    public String drawJoke(){
        if(this.jokes.size() == 0){
            return "Jokes are in short supply.";
        }
        Random r= new Random();
        int randomIndex = r.nextInt(this.jokes.size());
        return this.jokes.get(randomIndex);

    }

    public void printJokes(){
        for(String joke: this.jokes){
            System.out.println(joke);
        }
    }

}
