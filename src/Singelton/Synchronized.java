package Singelton;

public class Synchronized {
    private static String dbInstance = null;
    private Synchronized(){}

    synchronized public static String getDbInstance(){
        if(dbInstance == null){
            dbInstance = "Synchronized Db Instance";
        }
        return dbInstance;
    }

}
