package application;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class  GreeterApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {

        Label instructionText = new Label("Enter your name and start");
        TextField text= new TextField();
        Button startButton = new Button("Start");
        Label name = new Label("");


        GridPane layout = new GridPane();

        layout.add(instructionText, 0, 0);
        layout.add(text, 0, 1);
        layout.add(startButton, 0, 2);


        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        Scene startView = new Scene(layout);


        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(name);
        welcomeLayout.setAlignment(Pos.CENTER);

        Scene welcomView = new Scene(welcomeLayout);

        startButton.setOnAction((e)->{
            name.setText("Welcome " + text.getText() + "!");
            window.setScene(welcomView);
        });



        window.setScene(startView);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
