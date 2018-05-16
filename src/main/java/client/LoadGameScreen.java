package main.java.client;

import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import main.java.server.state.Kingdom;

import javax.annotation.Nullable;

public class LoadGameScreen extends AbstractScreen {
    private Button save1;
    private Button save2;
    private Button save3;

    private Kingdom kingdom1;
    private Kingdom kingdom2;
    private Kingdom kingdom3;

    private LoadGameScreen(@Nullable Kingdom kingdom1,
                           @Nullable Kingdom kingdom2,
                           @Nullable Kingdom kingdom3) {
        this.kingdom1 = kingdom1;
        this.kingdom2 = kingdom2;
        this.kingdom3 = kingdom3;

        if(kingdom1 == null) {
            save1 = new Button("No save file!");
        } else {
            save1 = new Button(kingdom1.getLastSaveDate().toString());
        }

        if(kingdom2 == null) {
            save2 = new Button("No save file!");
        } else {
            save2 = new Button(kingdom2.getLastSaveDate().toString());
        }

        if(kingdom3 == null) {
            save3 = new Button("No save file!");
        } else {
            save3 = new Button(kingdom3.getLastSaveDate().toString());
        }
    }

    public Scene getLoadGameScreen() {
        TilePane tilePane = new TilePane(Orientation.HORIZONTAL);
        tilePane.setHgap(2.0D);
        tilePane.getChildren().addAll(save1, save2, save3);

        return new Scene(tilePane, 500, 450);
    }

    public static class Builder {
        private Kingdom saveData1;
        private Kingdom saveData2;
        private Kingdom saveData3;
        public Builder() {}

        public Builder saveData1(@Nullable Kingdom saveData) {
            saveData1 = saveData;
            return this;
        }

        public Builder saveData2(@Nullable Kingdom saveData) {
            saveData2 = saveData;
            return this;
        }

        public Builder saveData3(@Nullable Kingdom saveData) {
            saveData3 = saveData;
            return this;
        }

        public LoadGameScreen build() {
            return new LoadGameScreen(saveData1, saveData2, saveData3);
        }
    }
}
