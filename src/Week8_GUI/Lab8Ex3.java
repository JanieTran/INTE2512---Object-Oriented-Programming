package Week8_GUI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.File;

public class Lab8Ex3 extends Application {
    // CONSTANT VALUES
    private static final int CARD_WIDTH = 300;
    private static final int CARD_HEIGHT = 384;
    private final String DIR = "src/Week8_GUI/Cards/";

    @Override
    public void start(Stage primaryStage) {
        // PROPERTIES
        File folder = new File(DIR);

        VBox vBox = new VBox(10);
        HBox boxCard = new HBox(10);
        HBox buttonAndLabel = new HBox(10);

        ImageView card1 = new ImageView();
        ImageView card2 = new ImageView();
        ImageView card3 = new ImageView();

        Button deal = new Button("Deal");
        Label points = new Label("Point: 0");

        // Array of directories to images
        String[] cards = new String[52];
        getFilesToArray(folder, cards);

        // On Deal button click
        deal.setOnAction(event -> {
            int[] indices = randomIndex();
            String cardName1 = cards[indices[0]].split("\\\\")[3];
            String cardName2 = cards[indices[1]].split("\\\\")[3];
            String cardName3 = cards[indices[2]].split("\\\\")[3];

            points.setText("Points: " + getPoints(cardName1, cardName2, cardName3));
            System.out.println(getPoints(cardName1, cardName2, cardName3));

            card1.setImage(new Image("file:" + cards[indices[0]]));
            resize(card1);

            card2.setImage(new Image("file:" + cards[indices[1]]));
            resize(card2);

            card3.setImage(new Image("file:" + cards[indices[2]]));
            resize(card3);
        });

        // Styling for label and button
        points.setFont(new Font(25));
        deal.setMinSize(100, 30);
        deal.setStyle("-fx-background-color: #FF1744; -fx-text-fill: white; -fx-font-size: 15");

        // Arrange boxes and add to scene
        boxCard.getChildren().addAll(card1, card2, card3);

        buttonAndLabel.getChildren().addAll(deal, points);
        buttonAndLabel.setAlignment(Pos.CENTER);

        vBox.getChildren().addAll(buttonAndLabel, boxCard);

        Scene scene = new Scene(vBox, 920, 500);

        setStage(primaryStage, "Card Deal", scene);
    }

    private static void setStage(Stage stage, String title, Scene scene) {
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    // Load directories of all images inside the Cards folder to array
    private static void getFilesToArray(File folder, String[] arr) {
        int count = 0;
        try {
            for (File img : folder.listFiles()) {
                arr[count] = img.getPath();
                count++;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    // Generate random indices to retrieve cards
    private static int[] randomIndex() {
        int a, b ,c;

        a = (int) (Math.random() * 52);

        // b is different from a
        b = (int) (Math.random() * 52);
        while (b == a)
            b = (int) (Math.random() * 52);

        // c is different from a and b
        c = (int) (Math.random() * 52);
        while (c == a || c == b)
            c = (int) (Math.random() * 52);

        return new int[] {a,b,c};
    }

    // Resize card to predefined width and height
    private static void resize(ImageView imageView) {
        imageView.setFitWidth(CARD_WIDTH);
        imageView.setFitHeight(CARD_HEIGHT);
    }

    // Take sum of all three card values to calculalte point
    private static int getPoints(String name1, String name2, String name3) {
        int sum = getCardValue(name1.charAt(0)) + getCardValue(name2.charAt(0)) + getCardValue(name3.charAt(0));
        return sum / 10 + sum % 10;
    }

    // Get value of the card base on the first letter of its name
    private static int getCardValue(char card) {
        switch (card) {
            case 'a':
            case 'j':
            case 'q':
            case 'k':
                return 1;

            default:
                return Integer.parseInt(Character.toString(card));
        }
    }
}
