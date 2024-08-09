//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import Interface.InterfaceEngine;
import JavaClass.*;
import JavaMethods.privateMethodDemo;
import JavaMethods.protectedMethodDemo;
import JavaMethods.publicMethodDemo;
import JavaMethods.staticMethodDemo;
import utils.adhoc;

public class Main {

    public static void main(String[] args){
        // Public method of a class can be accessed from any class in any package
        publicMethodDemo demoClass1 = new publicMethodDemo();
        demoClass1.printThis("Accessing public method from main");

        /*
         * Private method can only be called from method of its parent class
         */

        privateMethodDemo demoClass2 = new privateMethodDemo();
        demoClass2.printThis1("Accessing private method from its sibling method.");

        /*
            Protected method can be accessed from method of same class or methods of subclasses of parent class
         */

        protectedMethodDemo demoInstance3 = new protectedMethodDemo();
        demoInstance3.printUsingProtectedMethod("Accessing a protected method from another method of same class");

        adhoc demoInstance4 = new adhoc();
        demoInstance4.useProtectedMethod("Accessing a protected method from a method of subclass");

        /*
            Static Method
         */
         System.out.println(staticMethodDemo.sum(10,20));

         /*
         Nested Java Class
          */
        NestedStaticClass.NestedClass nestedClassbject = new NestedStaticClass.NestedClass();
        nestedClassbject.printThis("Hello");

        /*
        Nested Local inner class
         */

        LocalNestedClass localNestedClassObject = new LocalNestedClass();
        localNestedClassObject.printThis("Print this please! /n");

        /**
         * Generic Class
         */

        GenericClass<String> message = new GenericClass<>();
        message.setMessage("Yahallo");
        System.out.println(message.getMessage());

        /**
         * Generic Method
         */

        GenericClass<String>.Pair<String, String> pair1 = message.new Pair<String, String>("key1", "value1");
        GenericClass<String>.Pair<String, String> pair2 = message.new Pair<String, String>("key2", "value1");

        message.isKeyEqual(pair1, pair2);
        message.isValueEqual(pair1, pair2);

        /**
         * Upper Bounded Generic
         */

        GenericClass.UpperBoundedGenericClass<Double> example1 = new GenericClass.UpperBoundedGenericClass<>(43.0);
        System.out.println(example1.getNum1());

        /**
         * Enum Class
         */

        // Traversing enum values
//        for(EnumExample example: EnumExample.values()){
//            System.out.println(example.ordinal());
//        }
//
//        EnumExample enumVariable = EnumExample.valueOf("FRIDAY");
//        System.out.println(enumVariable.ordinal());
//        System.out.println(enumVariable.name());

        EnumExample example2 = EnumExample.getEnumFromValue(6);
        System.out.println(example2.getValue());

        /**
         * Interface
         */

        InterfaceEngine interfaceExamples = new InterfaceEngine();

    }
}