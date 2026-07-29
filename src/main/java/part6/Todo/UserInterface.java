/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author sakura
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    public void start(){
        while(true){
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            if(command.equals("add")){
                System.out.println("To add:");
                String todo = this.scanner.nextLine();
                this.list.add(todo);
            }
            if(command.equals("list")){

                this.list.print();
            }

            if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int removeNumber = Integer.valueOf(this.scanner.nextLine());
                this.list.remove(removeNumber);
            }

            if(command.equals("stop")){

                break;
            }

        }

    }


}
