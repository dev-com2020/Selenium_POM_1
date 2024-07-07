package com.example;

import com.example.mockito.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class LoginControllerBDDTest {

    @InjectMocks
    LoginController loginController;

    @Mock
    LoginService loginService;

    UserForm userForm = new UserForm("tom", "kan");

    @Test
    void testLoginKo(){
        given(loginService.login(userForm)).willReturn(false);
        assertEquals("KO!", loginController.login(userForm));
    }
    @Test
    void testLoginOk(){
        given(loginService.login(userForm)).willReturn(true);
        assertEquals("OK!", loginController.login(userForm));
    }
}
