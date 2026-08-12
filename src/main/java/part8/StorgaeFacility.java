/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author sakura
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> hashmap = new HashMap<>();

    public void add(String unit, String item){
        hashmap.putIfAbsent(unit, new ArrayList<>());
        hashmap.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit){
        return hashmap.getOrDefault(storageUnit, new ArrayList<>());

    }

    public void remove(String storageUnit, String item) {
        hashmap.get(storageUnit).remove(item);
        if(hashmap.get(storageUnit).size() == 0){
            hashmap.remove(storageUnit);
        }

    }

    public ArrayList<String> storageUnits(){
        return new ArrayList<>(hashmap.keySet());
    }

}
