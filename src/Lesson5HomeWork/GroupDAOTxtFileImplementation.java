package Lesson5HomeWork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * JavaOop, Lesson5HomeWork
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.10.2018
 */
public class GroupDAOTxtFileImplementation implements GroupDAO {
    private File folder;

    public GroupDAOTxtFileImplementation(File folder) {
        this.folder = folder;
    }

    public GroupDAOTxtFileImplementation() {
    }

    public File getFolder() {
        return folder;
    }

    public void setFolder(File folder) {
        this.folder = folder;
    }

    @Override
    public void saveGroup(Group group) {
        try (PrintWriter pw = new PrintWriter(new File(folder, group.getGroupName() + ".txt"))) {
            for (Student student : group.getStudentArray()) {
                if (student != null) {
                    pw.println(student.getSurname() + "," + student.getName() + "," + student.getAge() + ","
                            + student.isSex() + "," + student.getNumbZachetka() + "," + student.getGroup());
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public Group loadGroupByName(String groupName) {
        Group groupR = new Group(groupName);
        try (BufferedReader br = new BufferedReader(new FileReader(new File(folder, groupName + ".txt")))) {
            String text = "";
            for (; (text = br.readLine()) != null;) {
                String[] studentDate = text.split(",");
                String surname = studentDate[0];
                String name = studentDate[1];
                int age = Integer.valueOf(studentDate[2]);
                boolean sex = (studentDate[3].equals("true"));
                long zach = Long.valueOf(studentDate[4]);
                String group = groupName;
                Student student = new Student(surname, name, age, sex, zach, group);
                groupR.addStudent(student);

            }
        } catch (IOException | MyException e) {
            System.out.println(e);
            return null;
        }
        return groupR;
    }
}
