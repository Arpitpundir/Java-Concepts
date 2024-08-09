package JavaClass;

interface Greeting {
    public void greet(String msg);
}
public class AnonymusClass {
    Greeting example1 = new Greeting() {
        @Override
        public void greet(String msg) {
            System.out.println(msg);
        }
    };
}
