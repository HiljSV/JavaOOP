package Lesson6aHomeWork;

import java.math.BigInteger;

/**
 * JavaOop, Lesson6HomeWork
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.10.2018
 */
public class FactorialThread implements Runnable {
    private int n;

    public FactorialThread(int n) {
        this.n = n;
    }

    public FactorialThread() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + this.n + "! = " + this.calculateFactorial());
    }

    private BigInteger calculateFactorial() {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= this.n; i++) {
            fact = fact.multiply(new BigInteger("" + i));
        }
        return fact;
    }
}
