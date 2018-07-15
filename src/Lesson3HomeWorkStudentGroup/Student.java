package Lesson3HomeWorkStudentGroup;

/**
 * JavaOop, LessonThreeHomeWorkStudentGroup
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.27.2018
 */
public class Student extends People {


    private int course;    //курс
    private String group;
    private int numbZachetka;      // Номер Зачетки
    private String serijZachetka;


    public Student(String surname, String name, String patronymic, boolean sex, int age, int course, String group,
                   int numbZachetka, String serijZachetka) {
        super(surname, name, patronymic, sex, age);
        this.course = course;
        this.group = group;
        this.numbZachetka = numbZachetka;
        this.serijZachetka = serijZachetka;
    }

    public Student(String surname, String name, String patronymic, boolean sex, int age, int course, String group, int numbZachetka) {
        super(surname, name, patronymic, sex, age);
        this.course = course;
        this.group = group;
        this.numbZachetka = numbZachetka;
    }


    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getNumbZachetka() {
        return numbZachetka;
    }

    public void setNumbZachetka(int numbZachetka) {
        this.numbZachetka = numbZachetka;
    }

    public String getSerijZachetka() {
        return serijZachetka;
    }

    public void setSerijZachetka(String serijZachetka) {
        this.serijZachetka = serijZachetka;
    }


    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", group='" + group + '\'' +
                ", numbZachetka=" + numbZachetka +
                ", serijZachetka='" + serijZachetka + '\'' +
                '}' + super.toString();
    }
}