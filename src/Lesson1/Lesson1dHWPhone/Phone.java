package Lesson1.Lesson1dHWPhone;

/**
 * JavaOop, Lesson1dHWPhone
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.07.2018
 */
public class Phone {
    private long numberMyPhone;
    private String brand;

    private Network network;

    public Phone(long numberMyPhone, String brand) {
        this.numberMyPhone = numberMyPhone;
        this.brand = brand;
    }

    public Phone() {
    }

    public long getNumberMyPhone() {
        return numberMyPhone;
    }

    public void setNumberMyPhone(long numberMyPhone) {
        this.numberMyPhone = numberMyPhone;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "numberMyPhone=" + numberMyPhone +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void registerInNetwork(Network network) {
        this.network = network;
        if (!this.network.addPhone(this)) {
            this.network = null;
        }
        
    }

    public void call (long numberMyPhone) {
        if (this.network == null) {
            System.out.println("Your phone don`t register in network");
            return;
        }
        Phone tempPhone = this.network.getPhoneByNumber(numberMyPhone);
        if (tempPhone != null){
            tempPhone.inComingCall();
        } else {
            System.out.println("Abonent not aviable");
        }
    }
    public void inComingCall() {
        System.out.println(this + " Dzin - Dzin");
    }
        
}
