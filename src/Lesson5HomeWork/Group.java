package Lesson5HomeWork;

import javax.swing.*;
import java.util.Arrays;

/**
 * JavaOop, LessonThreeHomeWorkStudentGroup
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.27.2018
 */
public class Group implements Voenkom {
    private Student[] studentsArrey = new Student[10];
    private String groupName;

    public Group() {
        super();
        this.groupName = "unknow";
    }

    public Group(String groupName) {
        super();
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent (Student student) throws MyException {
        if (student == null) {
            throw new IllegalArgumentException("Null student");
        }
        for (int i = 0; i < studentsArrey.length; i++) {
            if (studentsArrey[i] == null) {
                student.setGroup(this.groupName);
                studentsArrey[i] = student;
                return;
            }
        }
        throw new MyException();
    }

    public Student search(String surneme) {
        for (Student student : studentsArrey) {
            if (student != null && student.getSurname().equals(surneme)) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudent (long number) {
        for (int i = 0; i < studentsArrey.length; i++) {
            if (studentsArrey[i] != null && studentsArrey[i].getNumbZachetka() == number) {    // zachetka vmesto getCourse
                studentsArrey[i] = null;
                return true;
            }
        }
        return false;
    }
    private void sort() {
        for (int i = 0; i < studentsArrey.length - 1; i++) {               //сортировака вставкой учесть нулы
            for (int j = i + 1; j < studentsArrey.length; j++) {
                if (compareStudent(studentsArrey[i], studentsArrey[j]) > 0) {
                    Student temp = studentsArrey[i];
                    studentsArrey[i] = studentsArrey[j];
                    studentsArrey[j] = temp;
                }
            }
        }
    }

    private int compareStudent(Student a, Student b) {
        if (a != null && b == null) {
            return 1;
        }
        if (a == null && b != null) {              // метод сравнения двух студентов
            return -1;
        }
        if (a == null && b == null) {
            return 0;
        }
        return a.getSurname().compareTo(b.getSurname());
    }
           
    public void sortByParametr(int i) {
        Arrays.sort(this.studentsArrey, new StudentComparator(i));
    }

    public void sortByParametr(int i, boolean forward) {
        Arrays.sort(this.studentsArrey, new StudentComparator(i, forward));
    }

    public Student[] getStudentArray() {
        Student[] temp = new Student[this.studentsArrey.length];
        System.arraycopy(studentsArrey, 0, temp, 0, temp.length);
        return temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group: " + this.groupName).append(System.lineSeparator());
        int i = 0;
        sort();
        for (Student student : studentsArrey) {
            if (student != null) {
                sb.append((++i) + ") ").append(student);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    @Override
    public Student[] getRecruter() {
        int n = 0;
        for (Student student : studentsArrey) {
            if (student != null && student.isSex() && student.getAge() >= 18) {
                n += 1;
            }
        }
        Student[] recruterArray = new Student[n];
        int i = 0;
        for (Student student : this.studentsArrey) {
            if (student != null && student.isSex() && student.getAge() >= 18) {
                recruterArray[i++] = student;
            }
        }
        return recruterArray;
    }
}

