package Lesson1.Animals;

/**
 * JavaOop, Animals
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.21.2018
 */
public class Main {
    public static void main(String[] args) {
        Cat catOne = new Cat(4, 6, true, "milk", "Tom", "Persidskiy");

        System.out.println(catOne.getAge());

        System.out.println("hash code " + catOne.hashCode());

        catOne.getVoice();

        
        System.out.println();

        Animals animals = catOne;

        animals.getVoice();
        if (animals.getClass().equals(Cat.class)) {
            Cat catToo = (Cat) animals;
            System.out.println(catToo.getType());
        }

        System.out.println(catOne);

        Cat catToo = (Cat) animals;

        System.out.println(catToo.getType());


    }
}
