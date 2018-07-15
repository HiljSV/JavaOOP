package Lesson5;

import java.io.*;

/**
 * JavaOop, Lesson4a
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.03.2018
 */
public class FileCopy {
    public static void copyFile (File in, File out) throws IOException {
        if ( in == null || out == null) {
            throw new IllegalArgumentException("Null file pointer"); // проверили коректность входных параметров
        }
        try (InputStream is = new FileInputStream(in);
             OutputStream os = new FileOutputStream(out)) {

            byte [] buffer = new byte[1024*1024];
            int readByte = 0;

            for (; (readByte = is.read(buffer))> 0;) {
                os.write(buffer, 0, readByte);
            }

        }   catch (IOException e) {
            throw e;
        }
    }

}
