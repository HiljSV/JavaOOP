package Lesson5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * JavaOop, Lesson5
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.03.2018
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("/home/hilj/IdeaProjects/JavaOop/src/Lesson5/OutCopy");

        try (InputStream is = new FileInputStream(file)) {
           /*
            int n = is.available();
            System.out.println(n);

            System.out.println(is.markSupported());
            int b = is.read();
            System.out.println(b);        // код символа H
             */

            byte[] buffer = new byte[7];

            int read = is.read(buffer);

            is.read(buffer);
            System.out.println(Arrays.toString(buffer));
            System.out.println(read);

            read = is.read(buffer);
            System.out.println(Arrays.toString(buffer));
            System.out.println(read);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
