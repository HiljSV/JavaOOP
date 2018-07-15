package Lesson1;

/**
 * JavaOop, LessonOneOop
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.19.2018
 */
public class Main {
    public static void main(String[] args) {
        Car carOne = new Car("Red", 2000, 1981);


        System.out.println();


        Car carToo = new Car();
        carToo.setColor("Yellov");
        carToo.setWeight(2015);
        carToo.setYear(2016);

        System.out.println(carOne);
        System.out.println(carToo);
    }
}
