
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;


        while (true) {
            System.out.println("First:" + first + "/100");
            System.out.println("Second:" + second + "/100");

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
                int total = amount + first;
                if(total > 100){
                    total = 100;

                }
                first = total;
            }

            if (commandArr[0].equals("move")) {
                int totalOfFirst = first - amount;
                int amountToAddSecond = 0;

                if(totalOfFirst < 0){
                    amountToAddSecond = first;
                    first = 0;
                } else {
                    amountToAddSecond = amount;
                    first = totalOfFirst;
                }

                int totalOfSecond = amountToAddSecond + second;
                if(totalOfSecond > 100){
                    second = 100;
                    continue;
                }
                second = totalOfSecond;
            }

            if (commandArr[0].equals("remove")) {
                int total = second - amount;
                if(total < 0){
                    second = 0;
                    continue;
                }

                second = total;
            }

        }
    }



}
