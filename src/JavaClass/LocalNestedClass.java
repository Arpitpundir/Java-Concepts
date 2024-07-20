package JavaClass;

public class LocalNestedClass {
    public static String str1 = "Hello!";
    public String str2 = "Hello!!";
    public void printThis(String msg){
        if(msg.length() != 0){
            class LocalNestedClassDemo {
                public void printThis(String msg) {
                    System.out.println(msg + str1 + str2);
                }
            }

            LocalNestedClassDemo obj = new LocalNestedClassDemo();
            obj.printThis(msg);
       }
    }
}
