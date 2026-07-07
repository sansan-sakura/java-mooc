package part2;
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        System.out.println("Last number?");
        int end = Integer.valueOf(scanner.nextLine());
        for(int i =1; i<= end; i++){
            sum=sum+i;
        }
        System.out.println("/the sum is "+ sum);

    }
}
