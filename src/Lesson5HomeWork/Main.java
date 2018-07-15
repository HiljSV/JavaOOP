package Lesson5HomeWork;

import java.io.File;

/**
 * JavaOop, LessonThreeHomeWorkStudentGroup
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.28.2018
 */

public class Main {

    public static void main(String[] args) {

        Group gr = new Group("JavaOOP");
        try {
            gr.addStudent(new Student("Petrov", "Ivan", 19, true, 265487, "JavaOOP"));
            gr.addStudent(new Student("Belov", "Andrey", 31, true, 265488, "JavaOOP"));
            gr.addStudent(new Student("Chaus", "Fedor", 21, true, 265489, "JavaOOP"));
            gr.addStudent(new Student("Markich", "Sergeii", 27, true, 266487, "JavaOOP"));
            gr.addStudent(new Student("Topoleva", "Inna", 18, false, 266587, "JavaOOP"));
            gr.addStudent(new Student("Abysheva", "Anna", 27, false, 265687, "JavaOOP"));
            gr.addStudent(new Student("Kitaeva", "Olga", 17, false, 265477, "JavaOOP"));
            gr.addStudent(new Student("Abyshev", "Timyr", 24, true, 295487, "JavaOOP"));
            gr.addStudent(new Student("Komarov", "Jn", 17, true, 265387, "JavaOOP"));

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(gr);

        File folder = new File("/home/hilj/IdeaProjects/JavaOop/src/Lesson5HomeWork/GROPS/");
        folder.mkdirs();

        GroupDAO groupDAO = new GroupDAOTxtFileImplementation(folder);
        GroupController controller = new GroupController(groupDAO);
        controller.saveGroup(gr);
        System.out.println();
        Group groupTwo = controller.loadGroupByName("JavaOOP");
        System.out.println(groupTwo);

    }
}

