package com.cyberfed.beans;

import com.cyberfed.data.UserJdbcTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by ZenasMeng on 11/13/15.
 */
@Configuration
public class Beans
{
    @Bean
    public UserJdbcTemplate userJdbcTemplate()
    {
        return new UserJdbcTemplate();
    }
}
