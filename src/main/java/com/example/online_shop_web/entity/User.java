package com.example.online_shop_web.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table (name = "users")
public class User {

    @Id
    @Column (name = "id")
    private Long id;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "login")
    private String login;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column (name = "password")
    private String password;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
