package com.cyberfed.data;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by ZenasMeng on 11/13/15.
 */
public class UserMapper implements RowMapper<User>
{
    public User mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        User user = new User();
        user.setEmailAddress(rs.getString("emailAddress"));
        user.setFirstName(rs.getString("firstName"));
        user.setLastName(rs.getString("lastName"));
        user.setPassword(rs.getString("password"));
        return user;
    }
}
