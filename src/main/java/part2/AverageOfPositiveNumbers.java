
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sum = 0;

        while(true){
            int input=Integer.valueOf(scanner.nextLine());

            if(input == 0){
                break;
            }

            if(input < 0){
                continue;
            }

            count++;
            sum = sum + input;
        }

        if(count == 0){
            System.out.println("Cannot calculate the average");
        }

        double average = sum/count;
        System.out.println(average);

    }
}
