package Lesson8;

import java.io.*;

/**
 * JavaOop, Lesson8
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.12.2018
 */
public class SeralizableServis {
    public void saveOb (File file, Object obj) throws IOException {
        if (file == null||obj== null) {
            throw new IllegalArgumentException();
        }
        try (ObjectOutput oos =
        new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(obj);

        }   catch (IOException e){
            throw e;
        }
    }
    public static Object loadObject (File file) throws IOException, ClassNotFoundException {
        if (file==null){
            throw new IllegalArgumentException();

        }
        try (ObjectInput ois =
        new ObjectInputStream(new FileInputStream(file))) {
            return ois.readObject();
        } catch (IOException e){
            throw e;

        }


    }


}
