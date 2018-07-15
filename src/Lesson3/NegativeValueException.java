package Lesson3;

/**
 * JavaOop, LessonThree
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.26.2018
 */
public class NegativeValueException extends Exception {

    public NegativeValueException () {

    }

    @Override
    public String getMessage() {
        return "Negativ value";
    }
}
