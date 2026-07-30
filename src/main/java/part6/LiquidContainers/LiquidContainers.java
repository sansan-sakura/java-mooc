
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer =0;


        while (true) {
            System.out.println("First:" + firstContainer + "/100");
            System.out.println("Second:" + secondContainer + "/100");

            String input = scan.nextLine();


            if (input.equals("quit")) {
                break;
            }

            String[] inputArray = input.split(" ");
            int amount = Integer.valueOf(inputArray[1]);
            String command = inputArray[0];

            if(amount < 0){
                continue;
            }

            if(command.equals("add")){
                int totalAmount = firstContainer + amount;
                if(totalAmount <= 100){
                    firstContainer = totalAmount;
                } else {
                    firstContainer = 100;
                }
            }

            if(command.equals("remove")){
                int totalAmount = secondContainer - amount;
                if(totalAmount >= 0){
                    secondContainer = totalAmount;
                } else {
                    secondContainer = 0;
                }

            }

            if(command.equals("move")){
                int totalAmountToBeRemovedFromFirst = 0;

                if(firstContainer - amount < 0){
                    totalAmountToBeRemovedFromFirst = firstContainer;
                    firstContainer = 0;
                } else {
                    totalAmountToBeRemovedFromFirst = amount;
                    firstContainer = firstContainer - amount;
                }

                int totalAmountOfSecond = secondContainer + totalAmountToBeRemovedFromFirst;

                if(totalAmountOfSecond <= 100){
                    secondContainer = totalAmountOfSecond;
                } else {
                    secondContainer = 100;
                }

            }

        }
    }

}
