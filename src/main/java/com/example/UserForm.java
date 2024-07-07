package com.example;

public class UserForm {

    public String username;
    public String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserForm(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserForm [username=" + username + ", password=" + password + "]";
    }

}
