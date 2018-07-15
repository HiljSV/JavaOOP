package Lesson5a;

import java.io.File;
import java.io.FileFilter;

/**
 * JavaOop, Lesson5HomeWork
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.05.2018
 */
public class MyFileFilter implements FileFilter {

    private String[] arr;

    public MyFileFilter(String... arr) {
        this.arr = arr;
    }

    private boolean check (String ext) {
        for (String stringExt : arr) {
            if (stringExt.equals(ext)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(File pathname) {
        int pointerIndex = pathname.getName().lastIndexOf(".");
        if (pointerIndex == -1) {
            return false;
        }
        String ext = pathname.getName().substring(pointerIndex + 1);
        return check(ext);
    }
}
