package com.example;

import com.example.mockito.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.openqa.selenium.bidi.log.Log;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@ExtendWith(MockitoExtension.class)
public class LoginServiceSpy {

    @InjectMocks
    LoginService loginService;

    @Spy
    LoginRepository loginRepository;

    UserForm userOk = new UserForm("user1","pass1");
    UserForm userKo = new UserForm("tom", "kan");

    @Test
    void testLoginOk(){
        assertTrue(loginService.login(userOk));

    }
    @Test
    void testLoginKo(){
        assertFalse(loginService.login(userKo));

    }
}
