package Lesson1.Lesson1aHWCat;

/**
 * JavaOop, LessonOneHWCat
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.21.2018
 */
public class Main {
    public static void main(String[] args) {
        Cat catOne = new Cat("Том", "Персидский", 1, "Мяу-мяу", 0000001, "Donald");
        Cat catToo = new Cat("Барсик", "Сиамский", 2, "Мяу-мяу", 0000002, "Petj");
        Cat catThree = new Cat("Марсик", "Сибирский", 3, "Мяу-мяу", 0000003, "Vova");
        System.out.println();
        System.out.println(catOne);
        System.out.println(catToo);
        System.out.println(catThree);

    }
}
