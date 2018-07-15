package Lesson6;

/**
 * JavaOop, Lesson6
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.05.2018
 */
public class Main {
    public static void main(String[] args) {
        Thread thr = Thread.currentThread();

        FactorialTask taskOne = new FactorialTask(10); // создание екземпляра класса этл не поток
        FactorialTask taskTwo = new FactorialTask(10);
        FactorialTask taskThree = new FactorialTask(10);

        Thread threadOne = new Thread(taskOne);
        Thread threadTwo = new Thread(taskTwo);
        Thread threadThree = new Thread(taskThree); // создать паралельный поток но он незапущен

        //  threadOne.setDaemon(true);
        //  threadTwo.setDaemon(true);
        //  threadThree.setDaemon(true);

        threadOne.start();
        threadTwo.start();
        threadThree.start();  // запуск потока

    /*    try {
            threadOne.join();
            threadTwo.join();
            threadThree.join();

        }   catch (InterruptedException e ) {
            e.printStackTrace();
        }

      */

        threadOne.interrupt();
        threadTwo.interrupt();
        threadThree.interrupt();

        System.out.println(thr.getName() + " STOP!!!"); // поток маин завершон
    }
}
