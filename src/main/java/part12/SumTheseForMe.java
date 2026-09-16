
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){
        int sum = 0;
        int firstIndex = fromWhere <= 0 ? 0 : fromWhere;
        int lastIndex = toWhere >= array.length ? array.length - 1 : toWhere;

        for(int i = firstIndex; i <= lastIndex; i++){
            int current = array[i];
            if(current>= smallest && current <= largest){
                sum += current;
            }
        }
        return sum;
    }

}