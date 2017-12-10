package Week8_GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Lab8Ex6 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        int c1x = (int) (Math.random() * 1280);
        int c1y = (int) (Math.random() * 720);
        int c2x = (int) (Math.random() * 1280);
        int c2y = (int) (Math.random() * 720);

        Circle c1 = new Circle(c1x, c1y, 15);
        c1.setFill(Color.WHITE);
        c1.setStrokeWidth(3);
        c1.setStroke(Color.BLACK);

        Circle c2 = new Circle(c2x, c2y, 15);
        c2.setFill(Color.WHITE);
        c2.setStrokeWidth(3);
        c2.setStroke(Color.BLACK);

        Line line = new Line(c1x, c1y, c2x, c2y);
        line.setStrokeWidth(3);

        pane.getChildren().addAll(line, c1, c2);
        Scene scene = new Scene(pane, 1280, 720);

        primaryStage.setTitle("Circles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
