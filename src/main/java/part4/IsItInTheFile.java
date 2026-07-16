
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNext()){
                list.add(fileScanner.nextLine());
            }

        } catch (Exception e){
            System.out.println( "Reading the file " + file + " failed.");
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean isFound = false;

        for(String name: list){
            if(name.equals(searchedFor)){
                isFound = true;
                break;
            }
        }

        if(isFound){
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

    }
}
