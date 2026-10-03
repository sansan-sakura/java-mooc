package application;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.util.Scanner;
import java.nio.file.Paths;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage stage) {

        NumberAxis xAxis = new NumberAxis(1968, 2008, 1);
        NumberAxis yAxis = new NumberAxis();


        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");



        try(Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))){
            scanner.nextLine();
            while (scanner.hasNextLine()) {


                String row = scanner.nextLine();
                String[] pieces = row.split("\t");

                XYChart.Series data = new XYChart.Series();
                data.setName(pieces[0]);

                for(int i = 1; i< pieces.length; i++){
                    if(!pieces[i].equals("-")){
                        data.getData().add(new XYChart.Data(1968 + (i - 1)*4, Double.valueOf(pieces[i])));
                    }
                }

                lineChart.getData().add(data);

            }

        } catch(Exception e){
            System.out.println(e);
        }



        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

}

