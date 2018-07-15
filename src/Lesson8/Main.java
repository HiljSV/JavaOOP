package Lesson8;

import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * JavaOop, Lesson8
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.12.2018
 */
public class Main {
    public static void main(String[] args) {
        Cat catOne = new Cat("Vasj", 2,true);
        Cat catTwo = new Cat("Vasj", 2,true);

        System.out.println(catOne.hashCode());
        System.out.println(catTwo.hashCode());
        System.out.println(catOne==catTwo);
        System.out.println(catOne.equals(catTwo));

        Cat catThree = null;

        try {
            catThree = catTwo.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println(catThree == catTwo);
        System.out.println(catThree.equals(catTwo));
        System.out.println();

        Class catClass = Cat.class;
        //Class catClass = catOne.getClass();
        Field[] catField = catClass.getDeclaredFields();
        for (int i = 0; i<catField.length; i++) {
            System.out.println(catField[i]);
        }

        System.out.println();

        Method[] catMethods = catClass.getDeclaredMethods();
        for (int i = 0; i<catMethods.length; i++) {
            System.out.println(catMethods[i]);
        }

        System.out.println();

        Constructor<?>[] catConstructor = catClass.getConstructors();
        for (int i = 0; i<catConstructor.length; i++) {
            System.out.println(catConstructor[i]);
        }

        System.out.println();

        Field catAge;


        try {
            catAge = catClass.getDeclaredField("age");
            catAge.setAccessible(true);
            catAge.setInt(catOne, 100500);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();

        }
        System.out.println(catOne);

        File file = new File("myCat.cat");

        SeralizableServis.
    
    }


}
