
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> texts=new ArrayList<>();

        while(true){

            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            texts.add(input);
        }

        texts.stream().forEach(t-> System.out.println(t));

    }
}
