package Lesson3HomeWorkStudentGroup;

/**
 * JavaOop, LessonThreeHomeWorkStudentGroup
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   06.27.2018
 */
public class Group {
    private Student[] studentsArrey = new Student[10];
    private String nameGroup;


    public Group(String nameGroup) {
        //super();
        this.nameGroup = nameGroup;
    }

    public Group() {
        //super();
        this.nameGroup = "Нет данных";
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public void addStudent (Student student) throws MyException {
        if (student == null) {
            throw new IllegalArgumentException("Null student");
        }
        for (int i = 0; i < studentsArrey.length; i++) {
            if (studentsArrey[i] == null) {
                student.setGroup(this.nameGroup);
                studentsArrey[i] = student;
                return;
            }
        }
        throw new MyException();
    }

    public Student searchStudent (String surname) {
        for (Student student : studentsArrey) {
            if (student != null && student.getSurname().equals(surname)) {
                return student;
            }
        }
        return null;
    }
    public boolean deleteStudent (String serij, int number) {
        for (int i = 0; i < studentsArrey.length; i++) {
            if (studentsArrey[i] != null && studentsArrey[i].getSerijZachetka() == serij && studentsArrey[i].getNumbZachetka() == number) {    // zachetka vmesto getCourse
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group: " + this.nameGroup).append(System.lineSeparator());
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
}
