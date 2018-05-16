package main.java.server.game;

import main.java.server.game.pojo.QuestObject;

import java.util.List;

public class ExplorationMap {
    int maxHeight;
    int maxWidth;

    public ExplorationMap(int maxHeight, int maxWidth) {

    }

    public ExplorationMap(int maxHeight, int maxWidth, List<QuestObject> questObjects) {
        this(maxHeight, maxWidth);
        //TODO: Populate Quest Objects on map - need a variable for how well hidden they are
    }
}
