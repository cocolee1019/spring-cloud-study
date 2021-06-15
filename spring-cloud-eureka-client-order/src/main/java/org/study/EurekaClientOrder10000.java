package org.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientOrder10000 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientOrder10000.class, args);
    }
}
