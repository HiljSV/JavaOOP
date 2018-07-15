package Lesson3;

import javax.swing.*;

/**
 * JavaOop, LessonThree
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.26.2018
 */


public class Main {
    public static void main(String[] args) {
        double a;
        for (; ; ) {
            try {
                a = Double.valueOf(JOptionPane.showInputDialog("Input double number"));
                if (a<0) {
                    throw new NegativeValueException();
                }
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error number format");
            }  catch (NullPointerException e ) {
                JOptionPane.showMessageDialog(null, "Set default value 10");
                a=10;
                break;
            }   catch (NegativeValueException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }System.out.println(a);
    }
}


