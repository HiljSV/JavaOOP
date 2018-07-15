package Lesson1.Lesson1aHWCat;

/**
 * JavaOop, LessonOneHWCat
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.21.2018
 */
public class Cat {
    private String byname;      // кличка
    private String breed;       // порода
    private int age;        // возраст
    private String say;     // мяукает
    private int id;     // уникальный номер
    private String nameOwner;       // имя хозяина


    public Cat(String byname, String breed, int age, String say, int id, String nameOwner) {
        super();
        this.byname = byname;
        this.breed = breed;
        this.age = age;
        this.say = say;
        this.id = id;
        this.nameOwner = nameOwner;
    }

    public Cat () {
        super();
    }

    public String getByname() {

        return byname;
    }

    public void setByname(String byname) {

        this.byname = byname;
    }

    public String getBreed() {

        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getSay() {

        return say;
    }

    public void setSay(String say) {

        this.say = say;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getNameOwner() {

        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {

        this.nameOwner = nameOwner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "byname='" + byname + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", say='" + say + '\'' +
                ", id=" + id +
                ", nameOwner='" + nameOwner + '\'' +
                '}';
    }
}
