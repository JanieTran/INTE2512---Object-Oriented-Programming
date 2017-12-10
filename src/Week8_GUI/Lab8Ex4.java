// Write a program that displays a checkerboard in which
// each white and black cell is a Rectangle with a fill color black or white

package Week8_GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Lab8Ex4 extends Application {
    private final int SIZE = 100;

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane board = new GridPane();

        for (int col = 1; col <= 8; col++) {
            for (int row = 1; row <= 8; row++) {
                Rectangle rect = new Rectangle();
                rect.setWidth(SIZE);
                rect.setHeight(SIZE);

                if ((col % 2 == 0 && row % 2 == 0) || (col % 2 == 1 && row % 2 == 1))
                    rect.setFill(Color.WHITE);
                else
                    rect.setFill(Color.BLACK);

                board.add(rect, col, row);
            }
        }

        Scene scene = new Scene(board);

        primaryStage.setTitle("Checkerboard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
