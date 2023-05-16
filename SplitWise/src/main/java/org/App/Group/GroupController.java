package org.App.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupController {

    List<Group> groupList;

    public GroupController(){
     groupList = new ArrayList<Group>();
    }

    public void addGroup(Group group){
        groupList.add(group);
    }

    public void removeGroup(Group group){
        groupList.remove(group);
    }

    public void getGroup(Group group){
        if (groupList.contains(group))
            groupList.get(groupList.indexOf(group));
        else {
            System.out.println("Group not found");
        }
    }


}
