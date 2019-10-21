package sample;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public ImageView car;
    public Label fuellabel;
    public AnchorPane stage;
    public BorderPane borderpane;
    boolean fueled = false;
    int fuelcount;
    Boolean up = false, down = false, right = false, left = false;
    Vehicle vehicles = new Car(10, 10, 4);
    Scene scene = null;

    public void setStage(Scene scene)
    {
        this.scene = scene;
    }

    public void initialize(URL location, ResourceBundle resources) {
        car.setFocusTraversable(true);
        fueled = false;
        AnimationTimer animationTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                int speed = (int) vehicles.getDb_average_speed();
                double x = car.getX();
                double y = car.getY();
                if (fueled) {
                    if (up) y -= speed;
                    if (down) y += speed;
                    if (right) x += speed;
                    if (left) x -= speed;
                }
                car.setX(x);
                car.setY(y);




                System.out.println(scene.getWidth());
                if (car.getX() >= (scene.getWidth() - car.getFitWidth())) {
                    car.setX((1));
                }
                if (car.getY() >= (scene.getHeight() - car.getFitHeight())) {
                    car.setY((1));
                }
                if (car.getX() < 0) {
                    car.setX((scene.getWidth() - car.getFitWidth()) - 1);
                }
                if (car.getY() < 0) {
                    car.setY((scene.getHeight() - car.getFitHeight()) - 1);
                }

            }
        };
        animationTimer.start();
    }


    public void keypressed(KeyEvent keyEvent) {
        System.out.println("key");
        switch (keyEvent.getCode()) {
            case F:
                fueled = true;
                fuellabel.setText("Fueled");
                break;
            case UP:
                up = true;
                break;
            case DOWN:
                down = true;
                break;
            case LEFT:
                left = true;
                break;
            case RIGHT:
                right = true;
                break;
        }

    }

    public void keyreleased(KeyEvent keyEvent) {
        System.out.println("released");
        switch (keyEvent.getCode()) {
            case UP:
                up = false;
                break;
            case DOWN:
                down = false;
                break;
            case LEFT:
                left = false;
                break;
            case RIGHT:
                right = false;
                break;
        }
    }

    public void changetocar(ActionEvent actionEvent) {
        vehicles = new Car(100, 10, 4);
        try {
            car.setImage(new Image(new FileInputStream("H:\\IdeaProjects\\INFO\\tetstete\\src\\sample\\car.png")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changetoplane(ActionEvent actionEvent) {
        vehicles = new Plane(200, 20, 2);
        try {
            car.setImage(new Image(new FileInputStream("H:\\IdeaProjects\\INFO\\tetstete\\src\\sample\\plane.png")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changetoship(ActionEvent actionEvent) {
        vehicles = new ship(10, 5, 1);
        try {
            car.setImage(new Image(new FileInputStream("H:\\IdeaProjects\\INFO\\tetstete\\src\\sample\\ship.png")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
