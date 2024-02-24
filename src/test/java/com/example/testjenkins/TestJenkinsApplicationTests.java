package com.example.testjenkins;

import com.example.testjenkins.entity.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestJenkinsApplicationTests {
    static User user,user1;


    @BeforeAll
    static public void  SetUp(){
        System.out.println("les teste ont commance");
        user=new User("ahmed","ahmedbrini@gmail.com");
        user1=new User("ahmed","ahmedbrini@gmail.com");
    }

    @Test
    void contextLoads() {

        boolean teste=user.equals(user1);
        assert (teste);
    }

}
