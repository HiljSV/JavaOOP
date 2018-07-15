package Lesson1.Lesson1bHWTriangle;

/**
 * JavaOop, LessonOneHWTriangle
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.21.2018
 */
public class Main {
    public static void main(String[] args) {
        Triangle triangleOne = new Triangle(3,4,5);
        Triangle triangleToo = new Triangle(2.5,3.9,5);
        Triangle triangleThree = new Triangle(4.5,6.54,8.6);

        System.out.println();
        System.out.println(triangleOne);
        System.out.println(triangleOne.getSquareTriangle());
        System.out.println();
        System.out.println(triangleToo);
        System.out.println(triangleToo.getSquareTriangle());
        System.out.println();
        System.out.println(triangleThree);
        System.out.println(triangleThree.getSquareTriangle());

    }
}
