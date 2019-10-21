package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    /*@Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(root,600,400);
        primaryStage.setScene(scene);
        System.out.println("Szene: "+scene.getWidth());
        primaryStage.show();
    }*/

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("sample.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(root,600,400);
        primaryStage.setScene(scene);
        Controller controller = loader.getController();
        System.out.println("Szene: "+scene.getWidth());
        controller.setStage(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
