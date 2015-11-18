package com.cyberfed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
@SpringBootApplication
public class CyberFedApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(CyberFedApplication.class, args);
    }
}
