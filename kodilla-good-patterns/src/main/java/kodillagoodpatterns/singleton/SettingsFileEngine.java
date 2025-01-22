package kodillagoodpatterns.singleton;

public enum SettingsFileEngine {

    INSTANCE;

    private String fileName = "";

    public String getFileName() {
        return fileName;
    }
    public void open(final String fileName){
        this.fileName = fileName;
        System.out.println("Opening the settings file");
    }

    public void close(final String fileName){
        this.fileName = fileName;
        System.out.println("Closing the settings file");
    }
    public boolean loadSettings() {
        System.out.println("Loading the settings file");
        return true;
    }
    public boolean saveSettings() {
        System.out.println("Saving the settings file");
        return true;
    }
}
