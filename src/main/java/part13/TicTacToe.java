package ticTacToe;

import static javafx.application.Application.launch;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class TicTacToeApplication extends Application {



    @Override
    public void start(Stage stage) throws Exception {
        GridPane  table = new GridPane();
        BorderPane  layout = new BorderPane();

        Label label = new Label("Turn: X");
        String[] currentPlayer = {"X"};
        boolean[] gameOver = {false};

        Button[] buttons = new Button[9];


        for(int i = 0; i<9; i++){
            Button button = new Button();
            button.setPrefSize(100, 100);
            buttons[i] = button;
            button.setOnAction(event -> {
                if (gameOver[0]) {
                    return;
                }
                if (button.getText().isEmpty()) {
                    button.setText(currentPlayer[0]);

                } else {
                    return;
                }

                if (hasWon(buttons, currentPlayer[0])) {
                    gameOver[0] = true;
                    label.setText("The end!");
                    return;
                } else {

                    if (currentPlayer[0].equals("X")) {
                        currentPlayer[0] = "O";
                    } else {
                        currentPlayer[0] = "X";
                    };

                    label.setText("Turn: " + currentPlayer[0]);
                };

            });


            table.add(button, i % 3, i / 3);
        }

        layout.setTop(label);
        layout.setCenter(table);

        Scene scene = new Scene(layout);
        stage.setScene(scene);

        stage.show();}






    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    public boolean hasWon(Button[] buttons, String player){

        int[][] patterns = {{0,1,2}, {3,4,5}, {6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8}, {2,4,6}};
        for(int[] pattern: patterns){
            if(buttons[pattern[0]].getText().equals(player)
                    && buttons[pattern[1]].getText().equals(player)
                    && buttons[pattern[2]].getText().equals(player)){
                return true;
            }
        }
        return false;

    }

}


