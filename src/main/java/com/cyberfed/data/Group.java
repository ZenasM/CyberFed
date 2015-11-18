package com.cyberfed.data;

import java.util.List;

/**
 * Created by ZenasMeng on 11/18/15.
 */
public class Group
{
    private String name;
    private List<User> listOfUsers;

    public Group(String name, User user)
    {
        this.name = name;
        listOfUsers.add(user);
    }

    public String getName()
    {
        return name;
    }

    public List<User> getListOfUsers()
    {
        return listOfUsers;
    }

    public void setListOfUsers(List<User> listOfUsers)
    {
        this.listOfUsers = listOfUsers;
    }
}
