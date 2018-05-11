package main.java.client;

import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;

public class MenuScreen {
    Button newGameButton;
    Button loadGameButton;
    Button optionsButton;

    public MenuScreen() {
        newGameButton = new Button("New Game"); //TODO: Button Graphics
        loadGameButton = new Button("Load Game");
        optionsButton = new Button("Options");
    }

    Scene getBaseMenuScreen() {
        MenuScreen screen = new MenuScreen();
        TilePane tilePane = new TilePane(Orientation.HORIZONTAL);
        tilePane.setHgap(2.0D);
        tilePane.getChildren().addAll(newGameButton, loadGameButton, optionsButton);

        return new Scene(tilePane, 500, 450);
    }
}
