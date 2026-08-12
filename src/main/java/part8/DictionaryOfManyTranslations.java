/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author sakura
 */
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary = new HashMap<>();



    public void add(String word, String translation){
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> words = this.dictionary.get(word);
        words.add(translation);

    }

    public ArrayList<String> translate(String word) {

        ArrayList<String> words = this.dictionary.get(word);
        if(words == null){
            return new ArrayList<>();
        }
        return words;
    }

    public void remove(String word){
        if(dictionary.get(word) == null){
            return;
        }

        dictionary.remove(word);
    }

}
