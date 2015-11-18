package com.cyberfed.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by ZenasMeng on 11/13/15.
 */
public class UserJdbcTemplate
{
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createUser(User user)
    {
        String SQL = "INSERT INTO Users (emailAddress, firstName, lastName, password) VALUES (?, ?, ?, ?)";

        jdbcTemplate.update(SQL, user.getEmailAddress(), user.getFirstName(), user.getLastName(), user.getPassword());
        System.out.println("Created " + user);
    }
    public User getUser(String email)
    {
        String SQL = "SELECT * FROM Users WHERE email = ?";
        User user = jdbcTemplate.queryForObject(SQL, new Object[]{email}, new UserMapper());
        return user;
    }

    public List<User> listUsers()
    {
        String SQL = "SELECT * FROM Users";
        return jdbcTemplate.query(SQL, new UserMapper());
    }

    public void deleteUser(String email)
    {
        String SQL = "DELETE FROM Users WHERE email = ?";
        jdbcTemplate.update(SQL, email);
        System.out.println("Deleted Record with email = " + email );
    }

    public void createGroup(Group newGroup)
    {
        String SQL = "INSERT INTO Groups (groupName) VALUES (?)";
        jdbcTemplate.update(SQL, newGroup);
    }

//    public void update(String id, String major)
//    {
//        String SQL = "update Users set major = ? where id = ?";
//        jdbcTemplate.update(SQL, id, major);
//        System.out.println("Updated Record with ID = " + id );
//        return;
//    }
}
