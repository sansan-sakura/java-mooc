
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Timer timer = new Timer();

        int count = 200;

        while (count > 0) {
            System.out.println(timer);
            timer.advance();
            count --;

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
        // You can test your program here


    }
}
