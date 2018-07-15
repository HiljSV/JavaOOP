package Lesson6bHomeWork;

import java.util.Random;

/**
 * JavaOop, Lesson6bHomeWork
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.11.2018
 */
public class Main {
    public static void main(String[] args) {

        int[] array = new int[200000];
        Random rn = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(100);
        }
        long start;
        long end;
        ThreadCalc multiSum = new ThreadCalc(array);
        start = System.currentTimeMillis();
        System.out.println(multiSum.calculateSum());
        end = System.currentTimeMillis();

        System.out.println("MultiThread sum " + (end - start) + " ms");
        start = System.currentTimeMillis();
        System.out.println(getSum(array));
        end = System.currentTimeMillis();
        System.out.println("Static method sum  " + (end - start) + " ms");

    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

}

