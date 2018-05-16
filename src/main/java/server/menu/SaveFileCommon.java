package main.java.server.menu;

import main.java.server.menu.util.OperatingSystem;

public class SaveFileCommon {
    static final String FILE_NAME = "kingdomSav";
    static final String SAVE_FILE_DIRECTORY_NAME = "kingdomSaves";

    public static String getSaveFileDirectory(OperatingSystem operatingSystem) {
        switch (operatingSystem) {
            case WINDOWS:
                throw new UnsupportedOperationException(); //TODO
            case LINUX:
                return "./" + SaveFileCommon.SAVE_FILE_DIRECTORY_NAME;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
