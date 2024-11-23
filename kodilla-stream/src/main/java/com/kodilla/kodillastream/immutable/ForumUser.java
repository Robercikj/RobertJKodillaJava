package com.kodilla.kodillastream.immutable;

public class ForumUser {
    private final String username;
    private final String realname;

    public String getUsername() {
        return username;
    }

    public String getRealname() {
        return realname;
    }

    public ForumUser(String username, String realname) {
        this.username = username;
        this.realname = realname;
    }



}
