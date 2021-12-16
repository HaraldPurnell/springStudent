/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springStudent.Account;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Uglybear
 */
@Entity
public class Account {
    
    @Id
    private String username;
    private String password;

    public Account(){}
    
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**s
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
