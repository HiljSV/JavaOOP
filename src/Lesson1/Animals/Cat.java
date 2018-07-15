package Lesson1.Animals;

/**
 * JavaOop, Animals
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.21.2018
 */
public class Cat extends Animals {
    private String name;
    private String type; // порода

    public Cat(int age, double weigt, boolean sex, String ration, String name, String type) {
        super(age, weigt, sex, ration);  // вызывает метод указывает на обьект супер класа
        this.name = name;
        this.type = type;
    }

    public Cat() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public void getVoice () {                 // переопределённый метод
        System.out.println("Мау_Мау");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}' + super.toString();   // Добавить супер и ту стринг
    }
}
