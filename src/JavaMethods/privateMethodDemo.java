package JavaMethods;

public class privateMethodDemo {
    public void printThis1(String msg){
        printThis2(msg);
    }

    private void printThis2(String msg){
        System.out.println(msg);
    }
}
