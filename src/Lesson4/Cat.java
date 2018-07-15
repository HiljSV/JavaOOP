package Lesson4;

/**
 * JavaOop, Lasson4
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.28.2018
 */
public class Cat implements Play, Comparable{
    private String name;
    private String color;
    private int age;


    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean canPlay() {
        return true;
    }

    @Override
    public String play() {
        if (age <= 2) {
            return "Run!!Jamp!!";
        } else {
            return "Sleep, eat, Go away";
        }
    }

    @Override
    public int compareTo(Object o) {
        Cat anotherCat = (Cat) o;              // кот должен реализовать метод компарабле
        if (this.age > anotherCat.age) {
            return 1;
        }
        if (this.age < anotherCat.age) {
            return -1;
        }

        return 0;

    }
}

