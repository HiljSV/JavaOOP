package Lesson5HomeWork;

/**
 * JavaOop, LessonThreeHomeWorkStudentGroup
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.27.2018
 */
public class Student extends People {

    private long numbZachetka;      // Номер Зачетки
    private String group;


    public Student(String surname, String name, int age, boolean sex, long numbZachetka, String group) {
        super(surname, name, age, sex);
        this.numbZachetka = numbZachetka;
        this.group = group;
    }

    public Student() {
        super();
    }

    public long getNumbZachetka() {
        return numbZachetka;
    }

    public void setNumbZachetka(long numbZachetka) {
        this.numbZachetka = numbZachetka;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    @Override
    public String toString() {
        return "Student{" +
                "numbZachetka=" + numbZachetka +
                ", group='" + group + '\'' +
                '}' + super.toString();
    }
}