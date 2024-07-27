package Singelton;

public class BillPugh {
    private static class NestedClass{
        private static String dbInstance = "Bill pugh db instance";
    }

    public static String getDbInstance(){
        return NestedClass.dbInstance;
    }
}
