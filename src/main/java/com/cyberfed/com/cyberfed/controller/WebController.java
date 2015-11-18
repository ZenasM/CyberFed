package com.cyberfed.com.cyberfed.controller;

import com.cyberfed.data.Group;
import com.cyberfed.data.User;
import com.cyberfed.data.UserJdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZenasMeng on 11/13/15.
 */
@RestController
public class WebController
{
    @Autowired
    private UserJdbcTemplate userJdbcTemplate;

    @RequestMapping(value = "user/{email}", method = RequestMethod.POST)
    public void createUser(@PathVariable("email") String email,
                           @RequestParam("firstName") String firstName,
                           @RequestParam("lastName") String lastName,
                           @RequestParam("password") String password)
    {
        User user = new User(email, firstName, lastName, password);
        userJdbcTemplate.createUser(user);
    }

    @RequestMapping(value = "listusers")
    public List<User> userList()
    {
        return userJdbcTemplate.listUsers();
    }

    @RequestMapping(value = "group/{groupName}", method = RequestMethod.POST)
    public void createGroup(@PathVariable("groupName") String groupName)
    {
//        User user = new User();>();
//        Group group = new Group(groupNausersers);
//        userJdbcTemplate.createGroup(group);
    }

    @RequestMapping(value = "group", method = RequestMethod.GET)
    public void group()
}
