package Lesson2HomeWork;

/**
 * JavaOop, LessonToo.LessonTooHW
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.25.2018
 */
public class Point {
    private double x;
    private double y;

    public Point (){

    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static double getLen(Point a, Point b) {
        return Math.hypot((a.getX()-b.getX()), (a.getY()-b.getY()));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
