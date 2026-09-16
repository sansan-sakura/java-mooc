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
public class Pipe<T> {

    private ArrayList<T> pipe;

    public Pipe(){
        pipe = new ArrayList<T>();
    }


    public void putIntoPipe(T value){
        pipe.add(value);

    }

    public T takeFromPipe(){
        T firstItem = pipe.get(0);
        pipe.remove(0);
        return firstItem;
    }

    public boolean isInPipe(){
        return pipe.size() != 0;
    }

}
