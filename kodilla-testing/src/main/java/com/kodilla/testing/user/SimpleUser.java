package com.kodilla.testing.user;

public class SimpleUser {

    public String getUsername() {
        return username;
    }

    private String username;

    public String getRealname() {
        return realname;
    }

    private String realname;

    public SimpleUser(String username, String realname) {
        this.username = username;
        this.realname = realname;
    }
}
