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
public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){

        while(true){
            System.out.print("Command:");
            String commandInput = this.scanner.nextLine();

            if(commandInput.equals("end")){
                System.out.println("Bye bye!");
                break;
            }

            if(commandInput.equals("add")){
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                System.out.println("Translation:");
                String translation = this.scanner.nextLine();
                this.dictionary.add(word,translation);
            }

            if(commandInput.equals("search")){
                System.out.println("To be translated:");
                String toranslatedWord = this.scanner.nextLine();
                String translation = this.dictionary.translate(toranslatedWord);
                if(translation == null){
                    System.out.println("Word "+toranslatedWord +" was not found");

                } else {
                    System.out.println("Translation:" + translation);
                }

            }

            System.out.println("Unknown command");

        }


    }