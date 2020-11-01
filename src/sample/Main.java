package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application {

    @Override
    public void start(Stage window) throws Exception{
       window.setTitle("Hello");
       StackPane root  = new StackPane();

       Button button = new Button("Click me");
       root.getChildren().add(button);

       Scene scene = new Scene(root,400,400);
       window.setScene(scene);
       window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
