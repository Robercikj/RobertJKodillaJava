package com.kodilla.stream.forum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

    public final class Forum {
        private final List<ForumUser> userList = new ArrayList<>();

        public Forum() {
            userList.add(new ForumUser(1, "JohnDoe", 'M', LocalDate.of(2000, 1, 15), 10));
            userList.add(new ForumUser(2, "JaneSmith", 'F', LocalDate.of(1995, 6, 30), 0));
            userList.add(new ForumUser(3, "MarkJohnson", 'M', LocalDate.of(1985, 12, 5), 20));
            userList.add(new ForumUser(4, "AnnaBrown", 'F', LocalDate.of(2010, 3, 22), 5));
            userList.add(new ForumUser(5, "ChrisWhite", 'M', LocalDate.of(1999, 8, 11), 15));
        }

        public List<ForumUser> getUserList() {
            return new ArrayList<>(userList);
        }
    }


