package edu.eci.UserMicroservice.data;

import edu.eci.UserMicroservice.dto.UserDto;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author StivenVanegas
 */
public class User {
    private String id;
    private String name;
    private String lastName;
    private String email;
    private Date created;

    public User(String id, String name, String lastName, String email, Date created) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.created = created;
    }
    
    public User(UserDto user){
        this.id = UUID.randomUUID().toString();
        this.name = user.getName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.created = user.getCreated();
    }
    
    public User(String id, UserDto user){
        this.id = id;
        this.name = user.getName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.created = user.getCreated();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
