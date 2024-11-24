package com.kodilla.stream.forumuser;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.apache.logging.log4j.ThreadContext.peek;

public class StreamMain {
    public static void main(String[] args) {
        List<ForumUser> users = Arrays.asList(
        new ForumUser(1, "Robert", 'M', LocalDate.of(1998,3,3),10),
        new ForumUser(2, "Rafał00", 'M', LocalDate.of(1990,3,3),100),
        new ForumUser(3, "Renata", 'F', LocalDate.of(2005,3,3),1),
        new ForumUser(4, "Oktawia", 'F', LocalDate.of(1989,3,3),1000)
        );


        System.out.println("All users");
        users.stream().forEach(System.out::println); // wszyscy
        System.out.println("Only M");
        users.stream()                                // tylko mężczyźni
                .filter(user -> user.getGender() == 'M')
                .forEach(System.out::println);


        System.out.println("Over 20 years old");
        boolean usersFound = users.stream()
                .filter(user -> user.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .peek(System.out::println)
                .count() > 0;
        if(!usersFound) {
            System.out.println("No users found");
        }


        System.out.println("more than 500 posts");
        users.stream()
                .filter(user -> user.getPostCount() > 500)
                .peek(System.out::println)
                .forEach(user -> {});

        System.out.println("unikalny id");
        Map<Integer, ForumUser> userMap = users.stream()
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user ));

        userMap.forEach((key, value) -> {
            System.out.println("userId"  + key + "-> " + value );
        });

    }
}
