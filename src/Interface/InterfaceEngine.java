package Interface;

public class InterfaceEngine {
    public InterfaceEngine(){
        FunctionalInterface example = (String msg) -> {
            System.out.println("From Lambda expression");
            System.out.println(msg);
        };
        example.printThisMsg("Hello");
    }
}
