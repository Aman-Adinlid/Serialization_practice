package se.lexicon.model;

import java.io.Serializable;

public class AppUser implements Serializable {
       private static final String No_Email = "No email set"; // cant be serializable
    private int userId;
    private String name;
    private String email;

    private transient String password; // cant be serializable


    public AppUser() {
    }

    public AppUser(int userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AppUser{" + "userId=" + userId + ", name='" + name  + ", email='" + email + '}'; // password r not allowed to be in here
    }
}
