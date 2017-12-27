package Week9_GUI2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Lab9Ex3 extends Application {
    // PROPERTIES
    static final int WIDTH = 1280;
    static final int HEIGHT = 720;
    static final int STEP = 20;

    Scene scene;
    Pane pane = new Pane();
    HBox hBox = new HBox();
    VBox vBox = new VBox();

    Button left = new Button("Left");
    Button right = new Button("Right");
    Button up = new Button("Up");
    Button down = new Button("Down");

    Circle circle = new Circle();
    int x = (int) (Math.random() * WIDTH);
    int y = (int) (Math.random() * HEIGHT - 50);
    int radius = 15;

    @Override
    public void start(Stage primaryStage) throws Exception {
        circle.setCenterX(x);
        circle.setCenterY(y);
        circle.setRadius(radius);
        circle.setFill(Color.RED);

        left.setOnAction(event -> {
            if (x - radius - STEP <= 0)
                x = radius;
            else
                x -= STEP;
            circle.setCenterX(x);
        });

        right.setOnAction(event -> {
            if (x + radius + STEP >= WIDTH)
                x = WIDTH - radius;
            else
                x += STEP;
            circle.setCenterX(x);
        });

        up.setOnAction(event -> {
            if (y - radius - STEP <= 0)
                y = radius;
            else
                y -= STEP;
            circle.setCenterY(y);
        });

        down.setOnAction(event -> {
            if (y + radius + STEP >= HEIGHT)
                y = HEIGHT - radius;
            else
                y += STEP;
            circle.setCenterY(y);
        });

        pane.getChildren().addAll(circle);
        pane.setMinSize(WIDTH, HEIGHT - 50);
        hBox.getChildren().addAll(left, right, up, down);
        vBox.getChildren().addAll(pane, hBox);

        scene = new Scene(vBox, WIDTH, HEIGHT);

        primaryStage.setTitle("Control circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
