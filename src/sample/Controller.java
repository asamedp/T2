package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label helloWorld;

    public void say(ActionEvent actionEvent) {
        helloWorld.setText("Zdravo!");
    }
}
