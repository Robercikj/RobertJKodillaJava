package com.kodilla.kodillajdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class KodillaJdbcApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void connectTest() {
        DbManager dbManager = DbManager.getInstance();

        assertNotNull(dbManager.getConnection());

    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        DbManager dbManager = DbManager.getInstance();

        // When
        String sqlQuery = "SELECT U.FIRST_NAME, U.LAST_NAME\n" +
                "FROM USERS U\n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY U.ID, U.FIRST_NAME, U.LAST_NAME\n" +
                "HAVING COUNT(P.ID) >= 2";

        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        // Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRST_NAME") + " " +
                    rs.getString("LAST_NAME"));
            counter++;
        }
        rs.close();
        statement.close();



        assertEquals(1, counter);


    }
}
