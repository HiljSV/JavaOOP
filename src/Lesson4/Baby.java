package Lesson4;

/**
 * JavaOop, Lasson4
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.28.2018
 */
public class Baby {
    private String name;
    private int age;

    public Baby(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Baby() {
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

    @Override
    public String toString() {
        return "Baby{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String playWith(Play someThing) {           //играть с чем то;
        String result = "I wont to play" + someThing;

        if (!someThing.canPlay()) {
            result += System.lineSeparator() + ":(";
        } else {
            result += System.lineSeparator() + ":))" + someThing.play();
        }
        return result;
    }
}


