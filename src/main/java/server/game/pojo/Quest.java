package main.java.server.game.pojo;

public enum Quest {
    INITIAL("Starting Out",
            "Clear out the wild unkers in the area so we can build a Headquarters",
            1) {
        @Override
        public Quest[] getNextQuests() {
            return new Quest[]{DANCING_WITH_WOLVES, CONTINUOUS_EXPLORATION, STRANGE_MARKINGS}; //Afterwards, the 3 families following you stand up a small hut...
        }
    },
    DANCING_WITH_WOLVES
            ("Dancing with Wolves?",
             "During out first night, we were woken often by very loud howls, almost like wolves. " +
                     "We'll" + "need to investigate the source and quiet it.",
             2),
    CONTINUOUS_EXPLORATION
            ("Coninuous Exploration",
             "We've been asked to survey the surrounding area, both to see what's out here" +
                    " and to make it safe for farming. Let's choose a direction and see what's there!",
            3),
    STRANGE_MARKINGS
            ("Strange Markings",
             "Who made the strange markings on this tree?  There's an arrow that seems to point" +
                    " down a lightly used path. We should carefully follow it to see if there are" +
                    " other people living out here!",
            4); //Native onslaught next....

    public Quest[] getNextQuests() {
        return new Quest[0];
    }

    private String title;
    private String text;
    private int id;
    private Quest[] nextQuests;
    //    private QuestImage questImage;
    //TODO: Make images

    Quest(String title, String text, int id) {
        this.title = title;
        this.text = text;
        this.id = id;
        this.nextQuests = getNextQuests();
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getId() {
        return id;
    }
}
