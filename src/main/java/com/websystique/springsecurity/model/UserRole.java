package com.websystique.springsecurity.model;

import com.websystique.springsecurity.model.User;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user_roles", catalog = "mydb")
public class UserRole{

    private String username;
    private User user;
    private String role;

    @Id
    @Column(name = "username", nullable = false, length = 45)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "username", nullable = false, insertable = false, updatable = false)
    public User getUser() {
        return this.user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "role", nullable = false, length = 45)
    public String getRole() {
        return this.role;
    }
    public void setRole(String role) {
        this.role = role;
    }

}