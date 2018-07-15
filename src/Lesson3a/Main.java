package Lesson3a;

/**
 * JavaOop, Lesson3a
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.26.2018
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(calculateArea(1));
        System.out.println(calculateArea(-1));

    }
    public static double calculateArea(double radius) {
        if (radius<0) {
            try {
                throw new IllegalAccessException("Negative radius");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return Math.PI * radius*radius;
    }
}
