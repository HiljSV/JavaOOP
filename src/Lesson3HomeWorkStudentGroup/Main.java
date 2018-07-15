package Lesson3HomeWorkStudentGroup;

/**
 * JavaOop, LessonThreeHomeWorkStudentGroup
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.28.2018
 */
public class Main {

    public static void main(String[] args) {

        Group groupOne = new Group("JavaOOP-19.06.2018");
        try {
            groupOne.addStudent(new Student("Petrov", "Ivan", "Nikolaevich", true,
                    42, 1, "JavaOOP-19.06.2018", 265478,"gf" ));
            groupOne.addStudent(new Student("Belov", "Andrey", "Semenovich", true,
                    31, 1, "JavaOOP-19.06.2018", 256895, "df" ));
            groupOne.addStudent(new Student("Chaus", "Fedor", "Andreevich", true,
                    21, 1, "JavaOOP-19.06.2018", 265481, "rt" ));
            groupOne.addStudent(new Student("Markich", "Sergeii", "Viktorovich", true,
                    27, 1, "JavaOOP-19.06.2018", 265434, "df" ));
            groupOne.addStudent(new Student("Topoleva", "Inna", "Olegovich", false,
                    17, 1, "JavaOOP-19.06.2018", 265351, "fd" ));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        print(groupOne);


    }
    public static void print (Group groupOne) {

        System.out.println(groupOne);
        System.out.println();
        Student student1 = groupOne.searchStudent("Chaus");
        System.out.println(student1);

    }
}
