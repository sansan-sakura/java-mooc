package part3;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest =0;
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }

            String[] arr = text.split(",");
            int age = Integer.valueOf(arr[1]);
            if(oldest <= age){
                oldest = age;
            }

        }

        System.out.println("Age of the oldest: " + oldest);


    }
}
