public class Logger {

    private static Logger instance;
    public String name;

    private Logger(String name) {
        this.name = name;
    }

    public static Logger getInstance(String name) {
        if (instance == null) {
            instance = new Logger(name);
        }
        return instance;
    }
}
