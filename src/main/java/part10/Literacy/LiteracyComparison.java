
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class LiteracyComparison {

    public static void main(String[] args) {

        ArrayList<Literacy> lists = new ArrayList<>();

        try{
            Files.lines(Paths.get("literacy.csv")).forEach(row -> {
                String[] parts =  row.split(",");

                String gender = parts[2].trim().split(" ")[0];
                String country = parts[3];
                int year = Integer.valueOf(parts[4]);
                double rating = Double.valueOf(parts[5]);

                lists.add(new Literacy(gender,country, year, rating));
            });
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }


        lists.stream().sorted((p1, p2)-> {
            return Double.compare(p1.getRating(), p2.getRating());
        }).forEach(p -> System.out.println(p));

    }
}
