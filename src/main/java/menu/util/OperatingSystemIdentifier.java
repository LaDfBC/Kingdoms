package main.java.menu.util;

public class OperatingSystemIdentifier {
    private static String OS = System.getProperty("os.name").toLowerCase();

    public static OperatingSystem getOperatingSystem() {
        if(isWindows()) {
            return OperatingSystem.WINDOWS;
        } else if(isUnix()) {
            return OperatingSystem.LINUX;
        } else {
            throw new IllegalStateException("Unrecognized OS");
        }
    }

    private static boolean isWindows() {
        return (OS.contains("win"));
    }

    private static boolean isMac() {
        return (OS.contains("mac"));
    }

    private static boolean isUnix() {
        return (OS.contains("nix") || OS.contains("nux") || OS.indexOf("aix") > 0 );
    }
}
