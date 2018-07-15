package Lesson2HomeWork;

/**
 * JavaOop, LessonTooHomeWork
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.26.2018
 */
public class Main {
    public static void main(String[] args) {

        Circle cr;

        System.out.println("\tGame SHAPE\n");
        try {
            cr = new Circle(new Point(0,0), -5);

        } catch (IllegalArgumentException e) {
            System.out.println("Введите новое значение радиуса");
            return;
        }


        Triangle tr = new Triangle(new Point(2,3), new Point(2,6), new Point(3,8));
        Triangle tr1 = new Triangle(new Point(2,3), new Point(2,6), new Point(3,8));
        Quadrangle qa = new Quadrangle(new Point(1,2), new Point(2,4), new Point(4, 10), new Point(6,12));

        GameBoard board = new GameBoard();

        board.print();
        board.inPut(cr,1);
        board.inPut(cr, 1);
        board.inPut(tr, 2);
        board.inPut(tr1, 2);
        board.inPut(qa, 3);
        board.inPut(tr1, 4);
        board.inPut(qa, 5);
        board.print();
        board.remove(3);
        board.remove(3);
        board.remove(3);
        board.remove(4);
        board.print();





    }

}
