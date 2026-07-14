package part3;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest =0;
        String name="";
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }

            String[] arr = text.split(",");
            int age = Integer.valueOf(arr[1]);
            if(oldest <= age){
                oldest = age;
                name =arr[0];
            }

        }

        System.out.println("Name of the oldest: " + name);


    }
}
