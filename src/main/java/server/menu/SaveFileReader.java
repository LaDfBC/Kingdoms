package main.java.server.menu;

import main.java.server.menu.util.OperatingSystem;
import main.java.server.menu.util.OperatingSystemIdentifier;
import main.java.server.state.Kingdom;

import java.io.*;

public class SaveFileReader {
    //TODO: LOGGER

    private OperatingSystem operatingSystem;
    private String saveFileDirectory;

    public SaveFileReader() {
        operatingSystem = OperatingSystemIdentifier.getOperatingSystem();
        saveFileDirectory = SaveFileCommon.getSaveFileDirectory(operatingSystem);
    }

    public Kingdom readSaveFile(int saveFileNumber) {
        File file = new File(saveFileDirectory + "/" +
                            SaveFileCommon.FILE_NAME + saveFileNumber + ".sav");

        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file))) {
            return Kingdom.initializeNewGame(); //TODO: Actually read files
        } catch (FileNotFoundException fnfe) {
            return null; //Save file does not exist!
        } catch (IOException ioe) {
            System.out.println("ADD LOGGER: Failed to read file!");
            return null; //TODO: Broken - rethrow and catch above?
        }
    }
}
