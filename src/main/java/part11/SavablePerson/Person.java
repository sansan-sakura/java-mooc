/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakura
 */
public class Person implements Saveable {
    private String name;
    private String address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void save(){

    }

    public void delete(){

    }

    public void load (String address){

    }
}
