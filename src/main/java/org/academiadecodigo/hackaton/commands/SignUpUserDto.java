package org.academiadecodigo.hackaton.commands;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SignUpUserDto {

    @Pattern(regexp = "^\\+?[A-Z\u00C0-\u00FF][a-zA-Z\u00C0-\u00FF ]*$", message = "Name has invalid characters")
    @Size(min=3, max=64)
    private String name;

    @Email
    private String email;

    private String password;

    @Pattern(regexp = "^\\+?[0-9]*$", message = "Phone has invalid characters")
    @Size(min=9, max=16)
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
