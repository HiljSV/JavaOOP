package Lesson1.Lesson1bHWTriangle;

/**
 * JavaOop, LessonOneHWTriangle
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.21.2018
 */
public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle() {
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSquareTriangle() {

       // if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            double halfperimetr = (sideA + sideB + sideC) / 2;
            return Math.sqrt(halfperimetr * (halfperimetr - sideA) * (halfperimetr - sideB) * (halfperimetr - sideC));
      //  } else {
      //      return 0;
      //  }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}


