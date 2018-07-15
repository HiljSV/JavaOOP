package Lesson5a;

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
    public static void copyFolder(File folderIn, File folderOut, FileFilter ffilt) throws IOException {
        if (folderIn == null || folderOut == null || ffilt == null) {
            throw new IllegalArgumentException("null file pointer");
        }

        File[] files = folderIn.listFiles(ffilt);
        for (File file : files) {
            copyFile(file, new File(folderOut, file.getName()));
        }
    }

}
