package org.academiadecodigo.hackaton.commands;

import javax.validation.constraints.Email;

public class SignInDto {

    @Email
    private String email;

    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
