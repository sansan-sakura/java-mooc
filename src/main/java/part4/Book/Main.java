import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> lists = new ArrayList<>();

        // implement here the program that allows the user to enter
        // book information and to examine them

        while(true){
            System.out.println("Title:");
            String title = scanner.nextLine();
            if(title.equals("")){
                break;
            }
            System.out.println("Pages:");
            int pagesCount = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int publishYear = Integer.valueOf(scanner.nextLine());
            lists.add(new Book(title, pagesCount, publishYear));

        }

        System.out.println("What infotmation will be printed?");
        String input = scanner.nextLine();




        if(input.equals("everything")){
            for(Book list:lists){
                System.out.println(list.toString());
            }
        }
        if(input.equals("name")){
            for(Book list:lists){
                System.out.println(list.getName());
            }
        }

    }
}
