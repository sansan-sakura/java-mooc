
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer =new Container();


        while (true) {
            System.out.println("First:" + firstContainer);
            System.out.println("Second:" + secondContainer);

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
                firstContainer.add(amount);
            }

            if(command.equals("remove")){
                secondContainer.remove(amount);

            }

            if(command.equals("move")){
                int totalAmountToBeRemovedFromFirst = 0;

                if(firstContainer.contains() - amount < 0){
                    totalAmountToBeRemovedFromFirst = firstContainer.contains();
                } else {
                    totalAmountToBeRemovedFromFirst = amount;
                }

                secondContainer.add(totalAmountToBeRemovedFromFirst);
                firstContainer.remove(amount);

            }

        }
    }

}
