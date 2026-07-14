package part3;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest =0;
        int sum =0;
        String name="";
        int count =0;
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }

            String[] arr = text.split(",");
            String person = arr[0];
            int nameLength = person.length();
            if(nameLength > longest){
                longest = nameLength;
                name =person;
            }
            sum = sum + Integer.valueOf(arr[1]);
            count ++;

        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the borth years: " + (double) sum/count);


    }
}
