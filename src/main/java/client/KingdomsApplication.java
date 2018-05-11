package main.java.client;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import main.java.server.game.pojo.Quest;
import main.java.server.state.Kingdom;

public class KingdomsApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World!");

        Kingdom kingdom = Kingdom.initializeNewGame();
        MenuScreen menuScreen = new MenuScreen();


        primaryStage.setScene(menuScreen.getBaseMenuScreen());
        primaryStage.show();
    }

}
