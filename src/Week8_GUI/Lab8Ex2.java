// Write a program that displays four country flags in a grid pane

package Week8_GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Lab8Ex2 extends Application {
    final String DIR = "file:src/Week8_GUI/Flags/";

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        ImageView vietnam, china, australia, iceland;
        vietnam = new ImageView(DIR + "vietnam.jpg");
        vietnam.setFitWidth(400);
        vietnam.setFitHeight(300);

        china = new ImageView(DIR + "china.jpg");
        china.setFitWidth(400);
        china.setFitHeight(300);

        australia = new ImageView(DIR + "australia.png");
        australia.setFitWidth(400);
        australia.setFitHeight(300);

        iceland = new ImageView(DIR + "iceland.jpg");
        iceland.setFitWidth(400);
        iceland.setFitHeight(300);

        pane.add(vietnam, 1, 1);
        pane.add(australia, 2, 1);
        pane.add(iceland, 1, 2);
        pane.add(china, 2, 2);

        Scene scene = new Scene(pane);

        primaryStage.setTitle("Flags");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
