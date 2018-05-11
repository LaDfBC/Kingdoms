package main.java.server.state.enums;

import java.util.Random;

public enum HeroRace {
    HUMAN(0, 0, 0),
    ELF(-2, -2, 2),
    ORC(2, 2, -2);

    private static Random random = new Random();

    private int strengthModifier;
    private int constitutionModifier;
    private int wisdomModifier;

    HeroRace(int strengthModifier,
             int constitutionModifier,
             int wisdomModifier) {
        this.strengthModifier = strengthModifier;
        this.constitutionModifier = constitutionModifier;
        this.wisdomModifier = wisdomModifier;
    }

    public int getStrengthModifier() {
        return strengthModifier;
    }

    public int getConstitutionModifier() {
        return constitutionModifier;
    }

    public int getWisdomModifier() {
        return wisdomModifier;
    }

    public static HeroRace getRandomRace() {
        return values()[random.nextInt(values().length)];
    }
}
