package Lesson5b;

import java.io.File;

/**
 * JavaOop, Lesson5b
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.05.2018
 */
public class Main {
    public static void main(String[] args) {

        TextMergerInFile.saveEqualsWords(new File("/home/hilj/IdeaProjects/JavaOop/src/Lesson5b/Text/a.txt"),
                new File("/home/hilj/IdeaProjects/JavaOop/src/Lesson5b/Text/b.txt"),
                new File("/home/hilj/IdeaProjects/JavaOop/src/Lesson5b/Text/c.txt"));
    }
}
