package Lesson7aHomeWork;

/**
 * JavaOop, Lesson7aHomeWork
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.12.2018
 */
public class Ship {

    private String name;
    private int countBox;
    private boolean full;

    public Ship(String name, int countBox) {
        this.name = name;
        if (countBox > 0) {
            this.countBox = countBox;
            full = true;
        } else {
            countBox = 0;
            full = false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountBox() {
        return countBox;
    }

    public void setCountBox(int countBox) {
        if (countBox > 0) {
            this.countBox = countBox;
            full = true;
        }
        if (countBox == 0) {
            this.countBox = countBox;
            full = false;
        }
    }

    public boolean isFull() {
        return full;
    }

}


