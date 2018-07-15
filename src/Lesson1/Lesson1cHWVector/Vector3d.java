package Lesson1.Lesson1cHWVector;

/**
 * JavaOop, Lesson1cHWVector
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.07.2018
 */
public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3d() {
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vector3d vectorSum(Vector3d vector) {
        return new Vector3d(this.getX() + vector.x, this.getY() + vector.y, this.getZ() + vector.z);
    }

    public double scalarMultiplication(Vector3d vector) {
        return this.getX() * vector.getX() + this.y * vector.getY() + this.z * vector.getZ();
    }

    public Vector3d vectorMultiplication(Vector3d vector) {
        double newX = this.getY() * vector.getZ() - this.getZ() * vector.getY();
        double newY = this.getZ() * vector.getX() - this.getX() * vector.getZ();
        double newZ = this.getX() * vector.getY() - this.getY() * vector.getX();

        return new Vector3d(newX, newY, newZ);
    }

    public void printResult() {
        System.out.println("Vector3d{" + "x=" + this.x + ", y=" + this.y + ", z=" + this.z + '}');
    }
}
