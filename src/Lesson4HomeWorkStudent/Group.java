package Lesson4HomeWorkStudent;

import java.util.Arrays;

import javax.swing.*;

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

    public void addStudentInteractive() throws MyException {
        try {
            String surName = getSurname("Введите фамилию студента");
            String name = getName("Введите имя студента");
            int age = getAge();
            boolean sex = getSex("Введите пол -> мужчина или женщина");
            long numbZachetka = getNumbZachetka("Введите номер зачётки студента");      // Номер Зачетки
            String group = this.groupName;
            Student st = new Student(surName, name, age, sex, numbZachetka, group);
            this.addStudent(st);
        } catch (NullPointerException e) {
            System.out.println("Canceled");
            return;
        }
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

    public Student search (String surName) {
        for (Student student : studentsArrey) {
            if (student != null && student.getSurname().equals(surName)) {
                return student;
            }
        }
        return null;
    }

    public Student searchName (String name) {
        for (Student student : studentsArrey) {
            if (student != null && student.getName().equals(name)) {
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

    private String getSurname(String message) throws NullPointerException {
        boolean done = false;
        String surname = "";
        for (; !done;) {
            try {
                surname = JOptionPane.showInputDialog(message);
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return surname;
    }


    private int getAge() throws NullPointerException {
        boolean done = false;
        int age = 0;
        for (; !done;) {
            try {
                age = Integer.valueOf(JOptionPane.showInputDialog("Input student age"));
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid ");
            }
        }
        return age;
    }

    private String getName(String message) throws NullPointerException {
        boolean done = false;
        String name = "";
        for (; !done;) {
            try {
                name = JOptionPane.showInputDialog(message);
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return name;
    }

    

    private boolean getSex(String message) throws NullPointerException {
        boolean done = false;
        boolean name = false;
        for (; !done;) {
            try {
                name = JOptionPane.showInputDialog(message).equals("man");
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return name;
    }

    private long getNumbZachetka(String message) throws NullPointerException {
        boolean done = false;
        long name = 0;
        for (; !done;) {
            try {
                name = Long.valueOf(JOptionPane.showInputDialog(message));
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return name;
    }
           
    public void sortByParametr(int i) {
        Arrays.sort(this.studentsArrey, new StudentComparator(i));
    }

    public void sortByParametr(int i, boolean forward) {
        Arrays.sort(this.studentsArrey, new StudentComparator(i, forward));
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

