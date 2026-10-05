package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;



public class SmileyApplication extends Application {


    @Override
    public void start(Stage window) {

        Canvas canvas = new Canvas(640, 480);
        GraphicsContext graphics = canvas.getGraphicsContext2D();


        BorderPane paintingLayout = new BorderPane();

        // White background
        graphics.setFill(Color.WHITE);
        graphics.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        // Black smiley
        graphics.setFill(Color.BLACK);

        // Face
        graphics.fillOval(50, 50, 300, 300);

        // Eyes
        graphics.setFill(Color.WHITE);
        graphics.fillOval(120, 120, 40, 60);
        graphics.fillOval(240, 120, 40, 60);

        // Mouth
        graphics.setStroke(Color.WHITE);
        graphics.setLineWidth(10);
        graphics.strokeArc(120, 150, 160, 120, 200, 140, javafx.scene.shape.ArcType.OPEN);

        paintingLayout.setCenter(canvas);

        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }
}
