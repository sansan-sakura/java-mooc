/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakura
 */
public class Hideout<T> {
    private T t;

    public Hideout(){
    }

    public void putIntoHideout(T toHide){
        t = toHide;

    }

    public T takeFromHideout() {
        return t;

    }

    public boolean isInHideout(){
        return t != null ? true : false;

    }

}
