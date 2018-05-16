package main.java.server.menu;

import main.java.server.menu.util.OperatingSystem;
import main.java.server.menu.util.OperatingSystemIdentifier;
import main.java.server.state.Kingdom;

import java.io.*;

public class SaveFileWriter {
    private OperatingSystem operatingSystem;
    private String saveFileDirectory;

    SaveFileWriter() {
        operatingSystem = OperatingSystemIdentifier.getOperatingSystem();
        saveFileDirectory = SaveFileCommon.getSaveFileDirectory(operatingSystem);
    }

    public void writeSaveFile(int saveFileNumber, Kingdom kingdomToWrite) {
        File file = new File(saveFileDirectory + "/" +
                SaveFileCommon.FILE_NAME + saveFileNumber + ".sav");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            //TODO: Write file.  Figure out proper writer syntax
        } catch(IOException ioe) {
            System.out.println("LOGGER NEEDED: Failed to write to file!");
        }
    }
}
