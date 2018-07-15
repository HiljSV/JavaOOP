package Lesson1.Lesson1cHWVector;

import static sun.misc.Version.print;

/**
 * JavaOop, Lesson1cHWVector
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.07.2018
 */
public class Main {
    public static void main(String[] args) {
        Vector3d vector3dOne = new Vector3d(20, 4, 5);
        Vector3d vector3dTwo = new Vector3d(16, 2.2, 3.5);

        Vector3d vector3dThree = vector3dOne.vectorSum(vector3dTwo);
        vector3dThree.printResult();

        Vector3d vector3dFour = vector3dOne.vectorMultiplication(vector3dTwo);
        vector3dFour.printResult();

    }
}
