package com.kodilla.kodillajdbc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.*;

public class StoredProcTestSuite {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/kodilla_project ";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Robert";

    private Connection connection;

    @BeforeEach
    public void setup() throws SQLException {

        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {

        prepareTestData();


        CallableStatement stmt = connection.prepareCall("{CALL UpdateBestsellers()}");
        stmt.execute();


        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT BESTSELLER FROM BOOKS WHERE BOOK_ID = 1");

        boolean isBestseller = false;
        if (rs.next()) {
            isBestseller = rs.getBoolean("BESTSELLER");
        }


        assertTrue(isBestseller, "Książka powinna być bestsellerem.");


        rs = statement.executeQuery("SELECT BESTSELLER FROM BOOKS WHERE BOOK_ID = 2");

        boolean isNotBestseller = false;
        if (rs.next()) {
            isNotBestseller = rs.getBoolean("BESTSELLER");
        }

        assertFalse(isNotBestseller, "Książka nie powinna być bestsellerem.");
    }

    private void prepareTestData() throws SQLException {

        Statement statement = connection.createStatement();


        statement.executeUpdate("INSERT INTO BOOKS (BOOK_ID, TITLE, BESTSELLER) VALUES (1, 'Test Book 1', FALSE)");
        statement.executeUpdate("INSERT INTO BOOKS (BOOK_ID, TITLE, BESTSELLER) VALUES (2, 'Test Book 2', FALSE)");


        statement.executeUpdate("INSERT INTO RENTS (RENT_ID, BOOK_ID, RENT_DATE) VALUES (1, 1, '2025-05-01')");
        statement.executeUpdate("INSERT INTO RENTS (RENT_ID, BOOK_ID, RENT_DATE) VALUES (2, 1, '2025-05-02')");
        statement.executeUpdate("INSERT INTO RENTS (RENT_ID, BOOK_ID, RENT_DATE) VALUES (3, 1, '2025-05-03')");


        statement.executeUpdate("INSERT INTO RENTS (RENT_ID, BOOK_ID, RENT_DATE) VALUES (4, 2, '2025-05-01')");
    }

    @AfterEach
    public void cleanUp() throws SQLException {

        Statement statement = connection.createStatement();
        statement.executeUpdate("DELETE FROM RENTS");
        statement.executeUpdate("DELETE FROM BOOKS");
    }
}