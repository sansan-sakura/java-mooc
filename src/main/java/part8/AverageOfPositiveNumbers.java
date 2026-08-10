
import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();

        while (true) {
            int inputNum = Integer.valueOf(scanner.nextLine());
            if (inputNum == 0) {
                break;
            }
            if (inputNum > 0) {
                array.add(inputNum);
            }

        }

        int count = array.size();
        int sum = 0;

        if (count == 0) {
            System.out.println("Cannot calculate the average");
            return;
        }

        for (int num : array) {
            sum = sum + num;
        }

        double average = (double) sum / count;
        System.out.println(average);


    }
}