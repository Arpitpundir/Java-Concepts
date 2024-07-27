package Singelton;

public class LazyInitialization {
    private static String dbInstance = null;
    private LazyInitialization(){}

    public static String getDbInstance(){
        if(dbInstance == null){
            dbInstance = "New Lazy Initialized Db instance";
        }
        return dbInstance;
    }
}
