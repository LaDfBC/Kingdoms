package main.java.server.state;

import main.java.server.state.enums.HeroJob;
import main.java.server.state.enums.HeroRace;

public class Hero {
    private HeroJob job;
    private HeroRace race;

    private int strength;
    private int constitution;
    private int wisdom;

    /**
     * Generates a new random hero.  The possible jobs are limited to ones that
     * are available to novice heroes
     */
    public Hero() {
        job = HeroJob.getRandomNoviceJob();
        race = HeroRace.getRandomRace();
        //TODO: Randomize?  Make standard per job/race?
        strength = 10;
        constitution = 10;
        wisdom = 10;
    }
}
