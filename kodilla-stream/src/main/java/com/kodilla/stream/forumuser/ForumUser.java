package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int userId;
    private String name;
    private char gender;
    private LocalDate dateOfBirth;
    private int postCount;

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostCount() {
        return postCount;
    }

    public ForumUser(int userId, String name, char gender, LocalDate dateOfBirth, int postCount) {
        this.userId = userId;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.postCount = postCount;
    }

    @Override
    public String toString() {
        return "ForumUser( "+ "userId=" + userId +
                ", name='" +name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", postCount=" + postCount +
                '}';
    }
}
