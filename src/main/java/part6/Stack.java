import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakura
 */
public class Stack {
    private ArrayList<String> lists;

    public Stack(){
        this.lists = new ArrayList<>();
    }

    public boolean isEmpty(){
        return this.lists.size() == 0;

    }

    public void add(String value) {
        this.lists.add(value);

    }

    public ArrayList<String> values(){
        return this.lists;
    }
    public String take(){
        int lastIndex = this.lists.size() - 1;
        String lastItem = this.lists.get(lastIndex);

        this.lists.remove(lastIndex);
        return lastItem;

    }


}