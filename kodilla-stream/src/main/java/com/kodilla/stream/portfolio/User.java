package com.kodilla.stream.portfolio;

public final class User {
    private final String username;
    private final String realname;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return username.equals(user.username);
    }



    public String getUsername() {
        return username;
    }

    public String getRealname() {
        return realname;
    }



    public User(final String username, final String realname) {
        this.username = username;
        this.realname = realname;
    }




}
