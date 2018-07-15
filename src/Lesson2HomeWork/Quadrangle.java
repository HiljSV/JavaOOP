package Lesson2HomeWork;

/**
 * JavaOop, LessonTooHomeWork
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.26.2018
 */
public class Quadrangle extends Shape {

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Quadrangle () {

    }

    public Quadrangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public double getPerimetr() {
        return Point.getLen(a, b) + Point.getLen(b, c) + Point.getLen(c, d) + Point.getLen(d, a);
    }

    @Override
    public double getArea() {
        double s1 = a.getX() * b.getY() - a.getY() * b.getX();
        double s2 = b.getX() * c.getY() - b.getY() * c.getX();
        double s3 = c.getX() * d.getY() - c.getY() * d.getX();
        double s4 = d.getX() * a.getY() - d.getY() * a.getX();
        return Math.abs(s1 + s2 + s3 + s4) / 2;
    }

    @Override
    public String toString() {
        return "Quadrangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
