
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.println("First:" + first);
            System.out.println("Second:" + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] commandArr = input.split(" ");
            int amount = Integer.valueOf(commandArr[1]);
            if(amount < 0){
                continue;
            }
            if (commandArr[0].equals("add")) {
                first.add(amount);
            }

            if (commandArr[0].equals("move")) {
                int amountToRemoveFromFirst = amount;
                int amountToAddSecond = amount;

                if(first.contains() - amount < 0){
                    amountToRemoveFromFirst = first.contains();
                    amountToAddSecond= amountToRemoveFromFirst;
                }

                first.remove(amountToRemoveFromFirst);

                int totalOfSecond = amountToAddSecond + second.contains();
                if(totalOfSecond > 100){
                    amountToAddSecond = 100;
                }

                second.add(amountToAddSecond);
            }

            if (commandArr[0].equals("remove")) {
                int totalOfSecond = second.contains() - amount;
                int amountToRemove = amount;
                if(totalOfSecond < 0){
                    amountToRemove = second.contains();
                }

                second.remove(amountToRemove);
            }

        }


    }

}
