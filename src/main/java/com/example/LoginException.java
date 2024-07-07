package com.example;

public class LoginException  extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public LoginException(String cause){
        super(cause);
    }
}
