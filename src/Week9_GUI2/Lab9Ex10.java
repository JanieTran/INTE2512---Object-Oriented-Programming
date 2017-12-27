package Week9_GUI2;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.management.loading.MLet;

public class Lab9Ex10 extends Application{
    private final int DIMENSION = 200;
    private final int RADIUS = 100;
    private final int CENTER = DIMENSION / 2 + 25;
    private final int ANGLE = 6;
    private final int MIN_LEN = 70;
    private final int HOUR_LEN = 50;
    private final int SEC_LEN = 60;

    double secEndX = CENTER;
    double secEndY = CENTER - SEC_LEN;
    int count = 0;

    Circle circle;

    Label twelve = new Label("12");
    Label three = new Label("3");
    Label six = new Label("6");
    Label nine = new Label("9");

    Line hour;
    Line min;
    Line sec;

    Rotate rotateSec = new Rotate(6, CENTER, CENTER);
    Rotate rotateMin = new Rotate(6, CENTER, CENTER);
    Rotate rotateHour = new Rotate(6, CENTER, CENTER);

    Button start = new Button("Start");
    Button stop = new Button("Stop");

    Pane pane = new Pane();
    HBox hBox = new HBox();
    VBox vBox = new VBox();

    @Override
    public void start(Stage primaryStage) throws Exception {
        circle = new Circle(CENTER, CENTER, RADIUS);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(5);

        hour = new Line(CENTER, CENTER, CENTER, CENTER - HOUR_LEN);
        hour.setStrokeWidth(5);
        hour.setStroke(Color.DARKSALMON);

        min = new Line(CENTER, CENTER, CENTER, CENTER - MIN_LEN);
        min.setStrokeWidth(5);
        min.setStroke(Color.DARKSEAGREEN);

        sec = new Line(CENTER, CENTER, CENTER, CENTER - SEC_LEN);
        sec.setStrokeWidth(3);
        sec.setStroke(Color.BLACK);


        start.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                sec.getTransforms().add(rotateSec);
                min.getTransforms().add(rotateMin);
                Timeline timelineSec = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(rotateSec.angleProperty(), 0)),
                        new KeyFrame(Duration.seconds(10), new KeyValue(rotateSec.angleProperty(), 360)),
                        new KeyFrame(Duration.ZERO, new KeyValue(rotateMin.angleProperty(), 0)),
                        new KeyFrame(Duration.seconds(30), new KeyValue(rotateMin.angleProperty(), 360)));
                timelineSec.setCycleCount(Animation.INDEFINITE);
                timelineSec.setAutoReverse(false);
                timelineSec.play();
            }
        });

        pane.getChildren().addAll(circle, sec, min, hour);
        hBox.getChildren().addAll(start, stop);
        hBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(pane, hBox);
        vBox.setSpacing(20);

        Scene scene = new Scene(vBox, 250, 300);

        primaryStage.setTitle("Clock");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setAnimation(Line hand, int period) {
//        hand.getTransforms().add(rotate);
//        Timeline timeline = new Timeline(new KeyFrame(Duration.ZERO, new KeyValue(rotate.angleProperty(), 0)),
//                new KeyFrame(Duration.seconds(period), new KeyValue(rotate.angleProperty(), 360)));
//        timeline.setCycleCount(Animation.INDEFINITE);
//        timeline.setAutoReverse(false);
//        timeline.play();
    }
}
