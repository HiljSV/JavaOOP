package Lesson3HomeWorkStudentGroup;

/**
 * JavaOop, LessonThreeHomeWorkStudentGroup
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.28.2018
 */
public class MyException extends Exception {

    @Override
    public String getMessage() {
        return "Свободного места нет. Студент не добавлен";
    }
}
