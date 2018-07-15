package Lesson1.Lesson1dHWPhone;

/**
 * JavaOop, Lesson1dHWPhone
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.07.2018
 */
public class Network {
    private Phone[] phoneArray = new Phone[0];

    public Network() {
    }

    public boolean addPhone (Phone phone) {
        if (getPhoneIntroArrey(phone) != -1) {
            System.out.println("Phone number " + phone.getNumberMyPhone() + " alredy register");
            return false;
        }
        Phone[] temp = new Phone[phoneArray.length + 1];
        System.arraycopy(phoneArray, 0, temp, 0, phoneArray.length);
        temp[temp.length - 1] = phone;
        phoneArray = temp;
        return true;
    }
    private int getPhoneIntroArrey(Phone phone) {
        for (int i = 0; i < phoneArray.length; i++) {
            if (phoneArray[i].getNumberMyPhone() == phone.getNumberMyPhone()) {
                return i;
            }
        }
        return -1;
    }

    public Phone getPhoneByNumber(long phoneNumber) {
        for (Phone phone : phoneArray) {
            if (phone.getNumberMyPhone() == phoneNumber) {
                return phone;
            }
        }
        return null;
    }

}
