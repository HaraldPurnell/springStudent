/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springStudent.Account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Uglybear
 */
@Entity
public class Account {
    
    @Id
    @Column(name = "accountUsername")
    private String accountUsername;
    @Column(name = "accountPassword")
    private String accountPassword;

    public Account(){}
    
    
    public Account(String username, String password) {
        accountUsername = username;
        accountPassword = password;
    }

    /**
     * @return the accountUsername
     */
    public String getAccountUsername() {
        return accountUsername;
    }

    /**
     * @param accountUsername the accountUsername to set
     */
    public void setAccountUsername(String accountUsername) {
        this.accountUsername = accountUsername;
    }

    /**
     * @return the accountPassword
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     * @param accountPassword the accountPassword to set
     */
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

}
