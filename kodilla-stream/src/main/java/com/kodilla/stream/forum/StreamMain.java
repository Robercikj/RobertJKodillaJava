package com.kodilla.stream.forum;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> filteredUsers = forum.getUserList().stream()
                .filter(user -> user.getGender() == 'M') // Tylko mężczyźni
                .filter(user -> user.getDateOfBirth().isBefore(LocalDate.now().minusYears(20))) // Tylko osoby powyżej 20 lat
                .filter(user -> user.getPostCount() > 0) // Tylko użytkownicy z co najmniej jednym postem
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));


        System.out.println("Filtered users:");
        filteredUsers.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}


