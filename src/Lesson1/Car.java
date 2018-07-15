package Lesson1;

/**
 * JavaOop, LessonOneOop
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.19.2018
 */
public class Car {
    private String color;
    private double weight;
    private int year;
    private double velosity = 0;

    public Car(String color, double weight, int year) {
        this.color = color;
        this.weight = weight;
        this.year = year;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setVelosity(double velosity) {
        this.velosity = velosity;
    }

    public void beep() {
        System.out.println("BEEP-BEEP!!!");
    }

    public void acceleration(double a) {
        velosity = velosity + a;
    }

    public void deceleration(double b) {
        if (velosity - b >= 0) velosity = velosity - b;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", year=" + year +
                ", velosity=" + velosity +
                '}';
    }
}
