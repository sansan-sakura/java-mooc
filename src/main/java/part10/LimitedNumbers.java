
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while(true){
            int input_num = Integer.valueOf(scanner.nextLine());
            if(input_num < 0){
                break;
            }

            numbers.add(input_num);
        }

        numbers.stream().filter(n-> n <= 5 && n > 0).forEach(n-> System.out.println(n));

    }
}
