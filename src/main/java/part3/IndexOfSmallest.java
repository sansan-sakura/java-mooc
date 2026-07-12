package part3;
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        int smallest = list.get(0);
        ArrayList<Integer> indexs = new ArrayList<>();
        indexs.add(0);
        for(int i = 1; i < list.size(); i++) {
            int number = list.get(i);
            if (smallest > number) {
                smallest = number;
                indexs.clear();
                indexs.add(i);
                continue;
            }
            if(smallest == number){
                indexs.add(i);
            }
        }

        System.out.println("Smallest number: " + smallest);
        for (int index: indexs){
            System.out.println("Found at index: " + index);
        }
    }
}
