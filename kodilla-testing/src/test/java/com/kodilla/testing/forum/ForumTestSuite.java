package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

@DisplayName("Forum Test Suite")
public class ForumTestSuite {
@BeforeEach
public void before(){
    System.out.println("Test case: begin");
}
@AfterEach
public void after(){
    System.out.println("Test case: end");
}
@BeforeAll
public static void beforeAll(){
    System.out.println("Test Suite: begin");
}
@AfterAll
public static void afterAll(){
    System.out.println("Test Suite: end");
}
    @DisplayName("When created SimpleUser with name, " +
            "then getUsername should return correct name"
    )
    @Test
    void testCaseRealname() {
        SimpleUser simpleUser = new SimpleUser("Robert", "Jurek");

        String word = simpleUser.getRealname();
        System.out.println("Testing: " + word);
        Assertions.assertEquals("Jurek", word);

    }
    @Test
    public void testCaseUsername() {
        SimpleUser simple = new SimpleUser("Robert", "Jurek");

        String word = simple.getUsername();
        String expected = "Robert";

        Assertions.assertEquals(expected, word);



    }

}
