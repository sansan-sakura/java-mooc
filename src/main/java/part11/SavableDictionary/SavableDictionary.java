/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.io.PrintWriter;

/**
 *
 * @author sakura
 */
public class SaveableDictionary {
    private HashMap<String, String> words = new HashMap<>();
    private String fileName;

    public SaveableDictionary (){
    }

    public SaveableDictionary (String fileName){
        this.fileName = fileName;
    }

    public void add(String words, String translation){
        if(this.words.containsKey(words)){
            return;
        }
        this.words.put(words, translation);

    }

    public String translate(String word){
        if(this.words.containsKey(word)){
            return this.words.get(word);
        }

        for (HashMap.Entry<String, String> entry : words.entrySet()) {
            if (entry.getValue().equals(word)) {
                return entry.getKey();
            }
        }

        return null;
    }

    public void delete(String word){
        if(this.words.containsKey(word)){
            this.words.remove(word);
            return;
        }
        for (HashMap.Entry<String, String> entry : words.entrySet()) {
            if (entry.getValue().equals(word)) {
                words.remove(entry.getKey());
                return;
            }
        }

    }

    public boolean load(){

        try(Scanner scanner = new Scanner(Paths.get(fileName))){

            while (scanner.hasNextLine()) {

                String row = scanner.nextLine();
                String[] parts = row.split(":");
                add(parts[0], parts[1]);
            }

        } catch(Exception e){
            System.out.println("Error: " + e);
            return false;
        }
        return true;

    }

    public boolean save(){

        try{


            PrintWriter writer = new PrintWriter(fileName);
            ArrayList<String> done = new ArrayList<>();
            for(String word: words.keySet()){
                if(!done.contains(word)){
                    writer.println(word + ":" + words.get(word));
                    done.add(word);
                }


            }

            writer.close();
        }catch(Exception e){
            System.out.println("Error:" + e);
            return false;
        }

        return true;

    }