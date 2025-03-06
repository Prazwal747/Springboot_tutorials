package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "org.example")
public class AppConfig {

    @Bean
    public Samsung getBean(){
        return new Samsung();
    }


}
