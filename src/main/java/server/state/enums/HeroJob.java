package main.java.server.state.enums;

import java.util.List;
import java.util.Random;

public enum HeroJob {
    INITIATE,
    SWORDSMAN;

    private static Random random = new Random();

    static List<HeroJob> noviceJobs = List.of(INITIATE, SWORDSMAN);

    public static HeroJob getRandomNoviceJob() {
        return noviceJobs.get(random.nextInt(noviceJobs.size()));
    }
}
