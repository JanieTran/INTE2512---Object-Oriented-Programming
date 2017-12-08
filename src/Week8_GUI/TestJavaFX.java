package Week8_GUI;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TestJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // GRID PANE

        // Layout elements
        Button btSave = new Button("myButton");
        Label label = new Label("myLabel");
        TextField textField = new TextField("myText");
        CheckBox check = new CheckBox("myCheckbox");
        HBox hBox = new HBox(label, textField);

        // Pane to contain layout elements
        GridPane paneBasic = new GridPane();
        paneBasic.add(hBox, 1, 1,2,1);
        paneBasic.add(check, 1, 2);
        paneBasic.add(btSave, 2, 2);

        // SHAPE

        // Circle
        Circle circle = new Circle(150, 150, 120);
        circle.setFill(Color.RED);
        circle.setStroke(Color.BLUE);
        circle.setStrokeWidth(30);

        // Polyline
        Polyline polyline = new Polyline();
        polyline.setStroke(Color.BLACK);
        ObservableList<Double> list = polyline.getPoints();
        final double WIDTH = 200, HEIGHT = 200;
        double centerX = WIDTH / 2;
        double centerY = HEIGHT / 2;
        double radius = 200 * 0.4;

        for (int i = 0; i < 12; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / 12));
            list.add(centerY - radius * Math.sin(2 * i * Math.PI / 12));
        }

        GridPane paneShape = new GridPane();
        paneShape.add(circle, 1, 1);
        paneShape.add(polyline, 2,1);

        // FONT & COLOR

        Text text = new Text(10, 10, "Programming is fun");
        text.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 30));
        text.setStroke(Color.RED);
        text.setStrokeWidth(1);
        text.setFill(Color.GRAY);

        Circle circleText = new Circle(75, 75, 60);
        circleText.setFill(Color.GREEN);
        circleText.setStroke(Color.YELLOW);
        circleText.setStrokeWidth(16);

        Color myColor = new Color(0.1, 0.1, 0.6, 0.5);
        Rectangle rect = new Rectangle(300, 160);
        rect.setFill(myColor);

        StackPane paneFontColor = new StackPane();
        paneFontColor.getChildren().addAll(circleText, text, rect);

        // Root
        Scene scene = new Scene(paneFontColor);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Not necessary
    public static void main(String[] args) {
        Application.launch(args);
    }
}
