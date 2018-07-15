package Lesson5a;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/**
 * JavaOop, Lesson4a
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.03.2018
 */
public class Main {
    public static void main(String[] args) {


        
        MyFileFilter ffilt = new MyFileFilter("doc");

        File folderIn = new File("/home/hilj/IdeaProjects/JavaOop/src/Lesson5a/folderIn");
        File folderOut = new File("/home/hilj/IdeaProjects/JavaOop/src/Lesson5a/folderOut");

        try {
            FileCopy.copyFolder( folderIn, folderOut, ffilt );
        }   catch (IOException e) {
            e.printStackTrace();
        }


    }
    

}
    

