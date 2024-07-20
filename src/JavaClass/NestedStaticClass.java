package JavaClass;

public class NestedStaticClass {
    public static class NestedClass{
        public static void printThis(String msg){
            System.out.println("Printing inside of nested static class");
            System.out.println(msg);
        }
    }
}
