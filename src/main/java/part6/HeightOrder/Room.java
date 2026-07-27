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
public class Room {
    private ArrayList<Person> people;

    public Room(){
        this.people = new ArrayList<>();
    }

    public void add(Person person){
        this.people.add(person);

    }
    public boolean isEmpty(){
        return this.people.size() == 0;
    }

    public ArrayList<Person> getPersons(){
        return this.people;
    }

    public Person shortest(){
        if(this.isEmpty()){
            return null;
        }
        Person shortest = this.people.get(0);

        for(Person person:this.people){
            if(shortest.getHeight() > person.getHeight()){
                shortest = person;
            }


        }
        return shortest;

    }

    public Person take() {

        if(this.isEmpty()){
            return null;
        }

        Person shortest = this.shortest();


        this.people.remove(shortest);

        return shortest;




    }


}