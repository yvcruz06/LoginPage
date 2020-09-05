package com.daclink.drew.cst438fa2002_inclassgitdemo;

public class CheckAccount {
    String username;
    String password;
    public final String login_un = "yvonne";
    public final String login_pw = "cruz";

    public CheckAccount() {
        username = "y";
        password = "c";
    }

    public CheckAccount(String un,  String pw) {
        username = un;
        password = pw;
    }

    public String checkAccount() {

        if (username.equals(login_un)) {
            if (password.equals(login_pw)) {
                return "Success";
            }
            else {
                return "Password is incorrect";
            }
        }
        else if (password.equals(login_pw)){
            return "Username is incorrect";
        }
        else {
            return "Username & Password are incorrect";
        }
    }
}
