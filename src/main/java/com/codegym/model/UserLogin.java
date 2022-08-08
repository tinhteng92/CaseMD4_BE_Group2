package com.codegym.model;

import java.util.Set;

public class UserLogin {
    private  long idAccountLogin;

    private String nameAccountLogin;

    private  String token;

    private Set<Role> role;


    public UserLogin(long idAccountLogin, String nameAccountLogin, String token, Set<Role> role) {
        this.idAccountLogin = idAccountLogin;
        this.nameAccountLogin = nameAccountLogin;
        this.token = token;
        this.role = role;
    }

    public long getIdAccountLogin() {
        return idAccountLogin;
    }

    public void setIdAccountLogin(long idAccountLogin) {
        this.idAccountLogin = idAccountLogin;
    }

    public String getNameAccountLogin() {
        return nameAccountLogin;
    }

    public void setNameAccountLogin(String nameAccountLogin) {
        this.nameAccountLogin = nameAccountLogin;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }
}
