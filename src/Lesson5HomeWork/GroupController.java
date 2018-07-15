package Lesson5HomeWork;

/**
 * JavaOop, Lesson5HomeWork
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.10.2018
 */
public class GroupController {
    private GroupDAO groupDAO;

    public GroupController(GroupDAO groupDAO) {
        this.groupDAO = groupDAO;
    }

    public GroupDAO getGroupDAO() {
        return groupDAO;
    }

    public void setGroupDAO(GroupDAO groupDAO) {
        this.groupDAO = groupDAO;
    }
    public Group loadGroupByName(String groupName) {
        if (groupDAO == null) {
            throw new IllegalArgumentException("Null GroupDAO realisation");
        }
        return groupDAO.loadGroupByName(groupName);
    }

    public void saveGroup(Group group) {
        if (groupDAO == null) {
            throw new IllegalArgumentException("Null GroupDAO realisation");
        }
        groupDAO.saveGroup(group);
    }

}
