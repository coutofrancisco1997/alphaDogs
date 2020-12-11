package org.academiadecodigo.hackaton.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name = "user")
public class User extends AbstractModel{

    private String username;

    @NotNull(message = "Name is mandatory")
    @NotBlank(message = "Name is mandatory")
    @Pattern(regexp = "^\\+?[A-Z\u00C0-\u00FF][a-zA-Z\u00C0-\u00FF ]*$", message = "Name has invalid characters")
    @Size(min=3, max=64)
    private String name;

    @Email
    private String email;

    @Pattern(regexp = "^\\+?[0-9]*$", message = "Phone has invalid characters")
    @Size(min=9, max=16)
    private String phone;

    private String password;
    private Integer packetId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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

    public void setPackageid(Integer packetid) {
        this.packetId = packetid;
    }

    public Integer getPackageid() {
        return packetId;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
