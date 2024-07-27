package Singelton;

public class Engine {
    /**
     * Eager Initialization
     */
    public static void runEngine(){
        System.out.println(EagerInitialization.getDbInstance());
        System.out.println(LazyInitialization.getDbInstance());
        System.out.println(Synchronized.getDbInstance());
        System.out.println(BillPugh.getDbInstance());
    }
}
