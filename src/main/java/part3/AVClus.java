
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String text = scanner.nextLine();
            if(text.equals(" ")){
                break;
            }

            String[] array = text.split(" ");
            System.out.println(array[0]);
        }


    }
}