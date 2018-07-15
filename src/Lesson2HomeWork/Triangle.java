package Lesson2HomeWork;

import static Lesson2HomeWork.Point.getLen;

/**
 * JavaOop, LessonToo.LessonTooHW
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.25.2018
 */
public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle() {

    }

    public Triangle( Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }



    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        return getLen(a, b) + getLen(b, c) + getLen(c, a);
    }

    @Override
    public double getArea() {
        double halfp = Point.getLen(a,b)+Point.getLen(b,c)+Point.getLen(c,a)/2;
        return Math.sqrt(halfp * (halfp - Point.getLen(a,b)) * (halfp - Point.getLen(b,c)) * (halfp - Point.getLen(c,a)));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
