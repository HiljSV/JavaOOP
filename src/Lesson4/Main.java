package Lesson4;


import java.util.Arrays;

/**
 * JavaOop, Lasson4
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.28.2018
 */
public class Main {
    public static void main(String[] args) {
        Baby baby = new Baby("Maygli", 3);
        Cat catOne = new Cat("Vasj", "red", 4);
        Cat catToo = new Cat("Gad", "wite", 1);
        Cat catThree = new Cat("Tom", "blec", 8);
        Cat catFour = new Cat("Boom", "green", 14);
        Cat catFive = new Cat("Fan", "orage", 14);

        System.out.println(baby.playWith(catOne));

        Cat[] cats = new Cat[]{catOne, catToo, catThree, catFour, catFive};
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println();
        Arrays.sort(cats);
        {
            for (Cat cat : cats) {
                System.out.println(cat);
            }

        }
    }
}
