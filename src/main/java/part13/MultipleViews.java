package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {

        BorderPane firstBox = new BorderPane();
        VBox secondBox = new VBox();
        GridPane thirdBox = new GridPane();

        Button firstButton = new Button("To the second view!");
        Button secondButton = new Button("To the third view!");
        Button thirdButton = new Button("To the first view!");

        firstBox.setTop(new Label("First view!"));
        firstBox.setCenter(firstButton);
        secondBox.getChildren().addAll(secondButton, new Label("Second view!"));
        thirdBox.add(new Label("Third view!"),0,0);
        thirdBox.add(thirdButton,1,1);



        Scene first = new Scene(firstBox);
        Scene second = new Scene(secondBox);
        Scene third = new Scene(thirdBox);


        firstButton.setOnAction((event) -> {
            window.setScene(second);
        });

        secondButton.setOnAction((event) -> {
            window.setScene(third);
        });

        thirdButton.setOnAction((event) -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
}
