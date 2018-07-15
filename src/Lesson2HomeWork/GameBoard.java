package Lesson2HomeWork;


/**
 * JavaOop, LessonTooHomeWork
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.25.2018
 */
public class GameBoard {

    private Shape []gameBoard = new Shape[4];


    public GameBoard (){
        System.out.println("Игровая доска поделена на 4 части.");
        System.out.println();
    }

    public void inPut(Shape ob, int i) {
        System.out.println("Инициализировано добавление фигуры на часть доски № "+ i + ". Результат:");
        if (i < 0 || i > 4) {
            System.out.println("неуспешно, часть доски: №" + i + " несуществует\n");
        } else if (gameBoard[i - 1] != null) {
            System.out.println("неуспешно, часть доски: №" + i + " занята другой фигурой "
                    + gameBoard[i - 1].toString() + "\n");
        } else {
            gameBoard[i - 1] = ob;
            System.out.println("успешно, часть доски: №" + i + " теперь содержит фигуру "+gameBoard[i - 1].toString()+ "\n");
        }
    }


    public void remove(int i) {
        System.out.println("Инициализировано удаление фигуры из части доски № "	+ i + ". Результат:");
        if (i < 0 || i > 4) {
            System.out.println("неуспешно, часть доски: №" + i + " несуществует\n");
        } else if (gameBoard[i - 1] != null) {
            gameBoard[i - 1] = null;
            System.out.println("успешно, часть доски: №" + i + " теперь пустая\n");
        } else {
            System.out.println("неуспешно, часть доски: №" + i + " до этого была пустая\n");
        }
    }

    public void print() {
        double sumarea = 0;
        System.out.println("Информация о доске:");
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.println("Часть №" + (i + 1) + " содержит:");
            if (gameBoard[i] == null) {
                System.out.println("\tпусто");
                System.out.println("-----------------------");
                continue;
            }
            System.out.println("\tтип фигуры = " + gameBoard[i].toString());
            System.out.println("\tплощадь = " + gameBoard[i].getArea());
            System.out.println("\tпериметр = " + gameBoard[i].getPerimetr());
            System.out.println("-----------------------");
            sumarea += gameBoard[i].getArea();
        }
        System.out.println("Cуммарная площадь фигур = " + sumarea + "\n");
    }
}