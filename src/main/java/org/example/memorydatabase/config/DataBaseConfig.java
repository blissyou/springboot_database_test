package org.example.memorydatabase.config;

import org.example.memorydatabase.user.db.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseConfig {

    @Bean
    public UserRepository userRepository(){
        return new UserRepository();
    }
}
