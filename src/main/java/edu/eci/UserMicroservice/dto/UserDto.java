package edu.eci.UserMicroservice.dto;

import java.util.Date;

/**
 *
 * @author StivenVanegas
 */
public class UserDto {
    private String name;
    private String lastName;
    private String email;
    private Date created;

    public UserDto(String name, String lastName, String email, Date created) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
