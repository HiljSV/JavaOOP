package Lesson5HomeWork;

/**
 * JavaOop, Lesson5HomeWork
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.10.2018
 */
public interface GroupDAO {
    public void saveGroup(Group group);

    public Group loadGroupByName(String groupName);
}
