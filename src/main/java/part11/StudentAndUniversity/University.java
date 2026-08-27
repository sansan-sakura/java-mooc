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
public class University {
    private String name;
    private ArrayList<Student> students;

    public University(String name){
        this.name =  name;
        this.students = new ArrayList<>();
    }

}
