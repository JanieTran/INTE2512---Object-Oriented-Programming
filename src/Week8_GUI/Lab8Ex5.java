// Write a program that uses a bar chart to display
// the percentages of the overall grade represented by projects, quizzes, midterm exams, and the final exam.
// Suppose that projects take 20 percent and are displayed in red,
// quizzes take 10 percent and are displayed in blue,
// midterm exams take 30 percent and are displayed in green,
// and the final exam takes 40 percent and is displayed in orange.

package Week8_GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Lab8Ex5 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Grade");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Percentage");

        BarChart barChart = new BarChart(xAxis, yAxis);

        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data("Projects", 20));
        series.getData().add(new XYChart.Data("Quizzes", 10));
        series.getData().add(new XYChart.Data("Exams", 30));
        series.getData().add(new XYChart.Data("Final Exam", 40));

        barChart.getData().add(series);

        Scene scene = new Scene(barChart);
        primaryStage.setTitle("Bar Chart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
