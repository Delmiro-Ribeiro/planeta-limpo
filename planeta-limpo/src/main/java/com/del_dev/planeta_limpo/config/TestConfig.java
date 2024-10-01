package com.del_dev.planeta_limpo.config;

import com.del_dev.planeta_limpo.entities.User;
import com.del_dev.planeta_limpo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User("fulano","12345",1);
        User u2 = new User("ciclano","32345",2);

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
