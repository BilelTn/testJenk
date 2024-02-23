package com.example.testjenkins;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.env.ConfigTreePropertySource;

@SpringBootApplication
public class TestJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestJenkinsApplication.class, args);
        System.out.println("hel jenkins test and githookspring boot");
        System.out.println("test apres le push  declenchement automatique des build");
        System.out.println("test apres  le push web hook et sonar scan");
        System.out.println("teste push");
        System.out.println("teste push7");
    }

}
