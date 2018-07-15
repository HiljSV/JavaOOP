package Lesson6bHomeWork;

/**
 * JavaOop, Lesson6bHomeWork
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.11.2018
 */
public class ThreadSummator implements Runnable {
    private int[] array;
    private int start;
    private int end;
    private int sum;

    public ThreadSummator (int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public ThreadSummator () {
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            this.sum += array[i];
        }
        
    }
}
