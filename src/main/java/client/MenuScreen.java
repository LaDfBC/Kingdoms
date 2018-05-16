package main.java.client;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import main.java.server.menu.SaveFileReader;

public class MenuScreen extends AbstractScreen {
    private Button newGameButton;
    private Button loadGameButton;
    private Button optionsButton;
    SaveFileReader saveFileReader;

    public MenuScreen(Stage primaryStage) {
        super(primaryStage);
        saveFileReader = new SaveFileReader();

        newGameButton = new Button("New Game"); //TODO: Button Graphics
        loadGameButton = new Button("Load Game");
        optionsButton = new Button("Options");

        initHandlers();
    }

    /**
     * Sets up and returns the intro screen.  Eventually, this might need to be
     * the intro cutscene
     *
     * @return the screen that loads when the game is launched
     */
    public Scene getBaseMenuScreen() {
        TilePane tilePane = new TilePane(Orientation.HORIZONTAL);
        tilePane.setHgap(2.0D);
        tilePane.getChildren().addAll(newGameButton, loadGameButton, optionsButton);

        return new Scene(tilePane, 500, 450);
    }

    private void initHandlers() {
        newGameButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        loadGameButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LoadGameScreen loadGameScreen =
                        new LoadGameScreen.Builder()
                        .saveData1(saveFileReader.readSaveFile(1))
                        .saveData2(saveFileReader.readSaveFile(2))
                        .saveData3(saveFileReader.readSaveFile(3))
                        .build();
//                List<File> saveFiles = operatingSystem.getSaveFiles();
                setAndShowScene(loadGameScreen.getLoadGameScreen());
            }
        });
    }
}
