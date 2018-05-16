package main.java.server.state;

import main.java.server.game.pojo.Quest;

import java.util.ArrayList;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;

public class Kingdom {
    List<Hero> heroes;
    Castle castle;
    List<Quest> openQuests;
    Date lastSavedDate;

    private Kingdom() {
        heroes = new ArrayList<>();
        heroes.add(new Hero());
        heroes.add(new Hero());
        heroes.add(new Hero());
        castle = new Castle();
        openQuests = new ArrayList<Quest>(EnumSet.of(Quest.INITIAL));
    }

    public static Kingdom initializeNewGame() {
        return new Kingdom();
    }

    public List<Quest> getActiveQuests() {
        return openQuests;
    }

    public Date getLastSaveDate() {
        return lastSavedDate;
    }
}
