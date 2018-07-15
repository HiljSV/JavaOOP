package Lesson5HomeWork;

/**
 * JavaOop, LessonThreeHomeWorkStudentGroup
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.27.2018
 */
public class People {

    private String surname;    //фамилия
    private String name;    //имя
    private int age;
    private boolean sex;  // male or female


    public People(String surname, String name, int age, boolean sex) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.sex = sex;

    }

    public People() {
     //   super();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "People{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}