package main.java.client;

import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class AbstractScreen {
    private Stage primaryStage;

    public AbstractScreen() {}

    public AbstractScreen(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void setAndShowScene(Scene scene) {
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
