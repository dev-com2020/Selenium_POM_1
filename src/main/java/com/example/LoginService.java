package com.example;

import java.util.ArrayList;
import java.util.List;

public class LoginService {
    private LoginRepository loginRepository = new LoginRepository();
    private List<String> usersLogged = new ArrayList<>();

    public boolean login(UserForm userForm) {
        System.out.println("LoginService.login " + userForm);
        checkForm(userForm);

        String username = userForm.getUsername();
        if (usersLogged.contains(username)){
            throw new LoginException(username + "już zalogowany!");
        }
        boolean login = loginRepository.login(userForm);
        if (login) {
            usersLogged.add(username);
        }
        return login;
    }

    public void logout(UserForm userForm) {
        System.out.println("LoginService.logout " + userForm);
        checkForm(userForm);

        String username = userForm.getUsername();
        if (!usersLogged.contains(username)){
            throw new LoginException(username + "nie zalogowany!");
        }
            usersLogged.remove(username);
    }

    public int getUserLoggedCount(){
        return usersLogged.size();
    }

    private void checkForm(UserForm userForm) {
        assert userForm != null;
        assert userForm.getUsername() != null;
        assert userForm.getPassword() != null;
    }
}
