package Lesson2HomeWork;

/**
 * JavaOop, LessonToo.LessonTooHW
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.25.2018
 */
public class Circle extends Shape {
    private Point xCentre;
    private int yRadius;


    public Circle(Point point) {

    }

    public Circle(Point xCentre, int yRadius) {
        this.xCentre = xCentre;
        if (yRadius < 0) {
            throw new IllegalArgumentException("Отрицательный радиус");
        }
        this.yRadius = yRadius;
    }

    public Point getxCentre() {
        return xCentre;
    }

    public void setxCentre(Point xCentre) {
        this.xCentre = xCentre;
    }

    public int getyRadius() {
        return yRadius;
    }

    public void setyRadius(int yRadius) {
        this.yRadius = yRadius;
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * yRadius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(yRadius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" + "xCentre=" + xCentre + ", yRadius=" + yRadius + '}';
    }
}