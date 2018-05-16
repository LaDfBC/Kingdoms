package main.java.client;

import javafx.application.Application;
import javafx.stage.Stage;

public class KingdomsApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        MenuScreen menuScreen = new MenuScreen(primaryStage);
        menuScreen.setAndShowScene(menuScreen.getBaseMenuScreen());
    }
}
