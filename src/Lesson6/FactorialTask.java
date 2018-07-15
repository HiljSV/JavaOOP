package Lesson6;

import java.math.BigInteger;

/**
 * JavaOop, Lesson6
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.05.2018
 */
public class FactorialTask implements Runnable {
    private int number;                                    // заготовка потока

    public FactorialTask(int number) {
        this.number = number;
    }

    public FactorialTask() {
    }

    public BigInteger calculateFactorial(int n) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(new BigInteger("" + i));
        }
        return factorial;
    }

    @Override
    public void run() {
        Thread thr = Thread.currentThread();
        for (int i = 1; i <= number; i++) {
            System.out.println(thr.getName() + " " + i + " ! = " + calculateFactorial(i));
            if (thr.isInterrupted()) {                                // прерывание потока корректно
                System.out.println(thr.getName()+ " is Interruped");
                break;
            }
        }
    }
}
