package Lesson1.Lesson1dHWPhone;

/**
 * JavaOop, Lesson1dHWPhone
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.07.2018
 */
public class Main {
    public static void main(String[] args) {

        Network vodafone = new Network();


        Phone phoneOne = new Phone(509654232, "Apple Iphone 6S plus");
        Phone phoneTwo = new Phone(501234567, "ASUS ZenFone 3");
        Phone phoneThree = new Phone(507654321, "Apple Iphone 6S ");

        phoneOne.registerInNetwork(vodafone);
        phoneTwo.registerInNetwork(vodafone);
        phoneThree.registerInNetwork(vodafone);

        phoneOne.call(509654232);
        phoneOne.call(12);
        phoneOne.call(501234567);
        phoneTwo.inComingCall();
    }
}
