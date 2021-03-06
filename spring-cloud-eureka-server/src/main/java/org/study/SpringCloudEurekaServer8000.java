package org.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer8000 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer8000.class, args);
    }
}
