package textstatistics;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.Arrays;



public class TextStatisticsApplication extends Application{


    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        HBox texts = new HBox();

        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longestWord = new Label("The longest word is: ");

        texts.getChildren().add(letters);
        texts.getChildren().add(words);
        texts.getChildren().add(longestWord);

        TextArea textArea =new TextArea();


        textArea.textProperty().addListener((change, oldValue, newValue)->{

            int countLetters = newValue.length();
            String[] parts = newValue.split(" ");
            int countWords = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            letters.setText("Letters: " + countLetters);
            words.setText("Words: " + countWords);
            longestWord.setText("The longest word is: " + longest);



        });
        layout.setCenter(textArea);
        layout.setBottom(texts);


        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
