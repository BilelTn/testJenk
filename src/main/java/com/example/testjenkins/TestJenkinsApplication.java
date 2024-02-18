package com.example.testjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestJenkinsApplication.class, args);
        System.out.println("hello from jenkins test and githookspring boot");
        System.out.println("test apres le push et declenchement automatique des build");

        System.out.println("test apres hh le push web hook et sonar scan");
    }

}
