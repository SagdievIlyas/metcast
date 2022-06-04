package com.sagdievilyas.deli.metcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MetcastApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetcastApplication.class, args);
    }

}
