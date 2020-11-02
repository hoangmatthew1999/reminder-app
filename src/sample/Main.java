package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.FlowPane;

import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
public class Main extends Application {

    @Override
    public void start(Stage window) throws Exception{
        window.setTitle("HBox Experiment 1");

        Button button1 = new Button("Add or Remove ");
        Button button2 = new Button("Search or View Events");
        Button button3 = new Button("Reschedule");

        FlowPane flowpane = new FlowPane();

        flowpane.getChildren().add(button1);
        flowpane.getChildren().add(button2);
        flowpane.getChildren().add(button3);

        Scene scene = new Scene(flowpane, 200, 100);
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
