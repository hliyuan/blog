package com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by liyuan on 2017/7/20.
 */

@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private Integer userId;

    @Column(name = "username")
    private String username;

    @Column(name = "userpassword")
    private String userpassword;

    @Column(name = "user_email")
    private String userEmail;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
    private List<Content> contents;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
    private List<BackLog> backLogs;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }

    public List<BackLog> getBackLogs() {
        return backLogs;
    }

    public void setBackLogs(List<BackLog> backLogs) {
        this.backLogs = backLogs;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", contents=" + contents +
                ", backLogs=" + backLogs +
                '}';
    }
}
