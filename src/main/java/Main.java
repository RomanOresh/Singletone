public class Main {

    public static void main(String[] args) {
        Logger.getInstance("Logger2");
        Logger.getInstance("Logger1");
        Logger logger = Logger.getInstance("Logger3");
        Logger anotherLogger = Logger.getInstance("Logger4");
        System.out.println(logger.name);
        System.out.println(anotherLogger.name);
    }
}
