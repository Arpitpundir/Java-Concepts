package JavaClass;

public class constructorsDemo {
    int var1, var2;
    /*
    No argument constructor
     */
    constructorsDemo(){
        var1 = 1;
        var2 = 3;
        System.out.println("No argument constructor.");
    }

    /*
    A private constructor does not allow for instances of classes
    to be made, as private method can not be called from any other
    class
     */
//
//    private constructorsDemo(int msg){
//
//    }
}
