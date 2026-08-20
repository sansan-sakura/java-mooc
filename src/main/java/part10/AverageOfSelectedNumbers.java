
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            int number = Integer.valueOf(input);
            if(number>=0){
                positives.add(number);
            } else {
                negatives.add(number);
            }

        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String positiveOrNegativeInput = scanner.nextLine();
        double average = 0;
        String positiveOrNegative = "";

        if(positiveOrNegativeInput.equals("n")){
            average = negatives.stream().mapToInt(s-> s).average().getAsDouble();
            positiveOrNegative = "negative";
        }

        if(positiveOrNegativeInput.equals("p")){
            average = positives.stream().mapToInt(s-> s).average().getAsDouble();
            positiveOrNegative = "positive";
        }


        System.out.println("Average of the "+ positiveOrNegative + " numbers: " + average);

    }
}
