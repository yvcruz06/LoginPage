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

    public CheckAccount(String un, String pw) {
        username = un;
        password = pw;
    }

    public Boolean checkUsername() {

        if (username.equals(login_un)) {
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean checkPassword() {
        if (password.equals(login_pw)) {
            return true;
        }
        else {
            return false;
        }
    }

}
