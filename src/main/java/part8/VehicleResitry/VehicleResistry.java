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
public class VehicleRegistry {


    private HashMap<LicensePlate, String> hashmap;

    public VehicleRegistry(){
        hashmap = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if(hashmap.get(licensePlate) == null){
            hashmap.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate){
        return hashmap.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        if(hashmap.get(licensePlate) != null){
            hashmap.remove(licensePlate);
            return true;
        }
        return false;

    }

    public void printLicensePlates(){
        for(LicensePlate plate: hashmap.keySet()){
            System.out.println(plate);
        }

    }

    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for(String owner: hashmap.values()){
            if(!owners.contains(owner)){
                owners.add(owner);
            }

        }

        for(String owner: owners){
            System.out.println(owner);
        }

    }

}
