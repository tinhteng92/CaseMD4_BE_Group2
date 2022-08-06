package com.codegym.model;

public class AccountLogin {
    private  long idAccountLogin;

    private String nameAccountLogin;

    private  String token;

    public AccountLogin(long idAccountLogin, String nameAccountLogin, String token) {
        this.idAccountLogin = idAccountLogin;
        this.nameAccountLogin = nameAccountLogin;
        this.token = token;
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
}
