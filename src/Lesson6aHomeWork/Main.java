package Lesson6aHomeWork;

/**
 * JavaOop, Lesson6
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.05.2018
 */
public class Main {
    public static void main(String[] args) {
        MultyThreadTask mTT = new MultyThreadTask(100);
        mTT.startCompute();
    }
}
