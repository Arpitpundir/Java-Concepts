package Singelton;

public class EagerInitialization {
    private static String db = "new db instance";
    private EagerInitialization(){}

    public static String getDbInstance() {
        return db;
    }
}
