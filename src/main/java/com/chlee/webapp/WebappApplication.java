package com.chlee.webapp;

import com.chlee.webapp.domain.dto.MessageDto;
import com.chlee.webapp.domain.entity.Customer;
import com.chlee.webapp.domain.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class WebappApplication {
    private static final Logger log = LoggerFactory.getLogger(WebappApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebappApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {
            repository.save(new Customer("ㅣㅑ이", "철희","ㅁㄴㅇㅁㄴㅇㅁㄴ","ㅁㄴㅇㅈㄷㅂ"));
            repository.save(new Customer("이ㅊ퍼", "asd","ㅁㄴㅇㅁㄴㅇㅁㄴ","ㅁㄴㅇㅈㄷㅂ"));
            repository.save(new Customer("이", "철희","ㅁㄴㅇㅁㄴㅇㅁㄴ","ㅁㄴㅇㅈㄷㅂ"));
            repository.save(new Customer("이ㄴㅇㄴㅇ", "철asdasd희","ㅁㄴㅇㅁㄴㅇㅁㄴ","ㅁㄴㅇㅈㄷㅂ"));
            repository.save(new Customer("이", "철asd희","ㅁㄴㅇㅁㄴㅇㅁㄴ","ㅁㄴㅇㅈㄷㅂ"));
            repository.save(new Customer("퓨ㅜ퓨이", "철희","ㅁㄴㅇㅁㄴㅇㅁㄴ","ㅁㄴㅇㅈㄷㅂ"));
            repository.save(new Customer("이ㅁㄴㅇ", "철sd희","ㅁㄴㅇㅁㄴㅇㅁㄴ","ㅁㄴㅇㅈㄷㅂ"));
            repository.save(new Customer("이ㅁㄴㅇ", "철ㅁㄴㅇ희","ㅁㄴㅇㅁㄴㅇㅁㄴ","ㅁㄴㅇㅈㄷㅂ"));
        };
    }
}
