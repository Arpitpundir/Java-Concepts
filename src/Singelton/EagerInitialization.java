package Singelton;

public class EagerInitialization {
    private static String db = "new db instance";

    public static String getDbInstance() {
        return db;
    }
}
