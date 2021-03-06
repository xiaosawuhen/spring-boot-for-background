package com.lxzl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@SpringBootApplication()
@EnableAutoConfiguration()
public class Runner {
    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);

    }  
}
