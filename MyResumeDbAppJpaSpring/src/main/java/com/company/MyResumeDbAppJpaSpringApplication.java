package com.company;

import com.company.dao.impl.UserRepository;
import com.company.service.inter.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyResumeDbAppJpaSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyResumeDbAppJpaSpringApplication.class, args);
    }

    @Autowired
    @Qualifier("userService")
    UserServiceInter userServiceInter;

    @Autowired
    UserRepository userRepository;

    @Bean
    public CommandLineRunner runner() {
        CommandLineRunner runner = new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                System.out.println(userRepository.getAllUser(null,null,null));

            }
        };
        return runner;
    }

}
