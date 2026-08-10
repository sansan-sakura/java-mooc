
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while(true){
            System.out.println("?");
            String command = scan.nextLine();

            if(command.equals("Add")){
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in latin:");
                String nameInLatin = scan.nextLine();

                birds.add(new Bird(name, nameInLatin));
            }

            if(command.equals("All")){
                for(Bird bird:birds){
                    System.out.println(bird);
                }
            }

            if(command.equals("Observation")){
                System.out.println("Bird:");
                String nameOfBird = scan.nextLine();
                boolean found = false;
                for(Bird bird:birds){
                    if(bird.getName().equals(nameOfBird)){
                        found = true;
                        bird.addObservation();
                    }
                }
                if(!found){
                    System.out.println("Not a bird");
                }
            }



            if(command.equals("One")){
                System.out.println("Bird:");
                String nameOfBird = scan.nextLine();
                boolean found = false;
                for(Bird bird:birds){
                    if(bird.getName().equals(nameOfBird)){
                        found = true;
                        System.out.println(bird);
                    }
                }
                if(!found){
                    System.out.println("Not a bird");
                }
            }
            if(command.equals("Quit")){
                break;
            }
        }

    }

}
