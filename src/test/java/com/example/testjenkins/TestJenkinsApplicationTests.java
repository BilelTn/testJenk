package com.example.testjenkins;

import com.example.testjenkins.entity.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class TestJenkinsApplicationTests {
    static User user,user1,user2,user3;


    @BeforeAll
    static public void  SetUp(){
        System.out.println("les teste ont commance");
        user=new User("ahmed","ahmedbrini@gmail.com");
        user1=new User("ahmed","ahmedbrini@gmail.com");

    }

    @Test
    @DisplayName("teste user name et user Email")
    void contextLoads() {

       boolean teste=user.equals(user1);
       assert (teste);

    }

}
