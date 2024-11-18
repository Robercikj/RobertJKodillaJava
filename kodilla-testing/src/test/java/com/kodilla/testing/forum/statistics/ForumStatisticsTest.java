package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ForumStatisticsTest {
    @Mock
    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;

    @BeforeEach
    void setUp() {
        statisticsMock = Mockito.mock(Statistics.class);
        forumStatistics = new ForumStatistics();
    }
    @Test
    void testCalculateAdvStatisticsWhenPostsCountIsZero() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(Collections.singletonList("User1"));

        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, forumStatistics.getPostCount());
        assertEquals(10, forumStatistics.getCommentCount());
        assertEquals(1, forumStatistics.getUserCount());
        assertEquals(0, forumStatistics.getPostsPerUser());
        assertEquals(10.0, forumStatistics.getCommentsPerUser());
        assertEquals(0, forumStatistics.getCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhenPostsCountIsThousand() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        when(statisticsMock.usersNames()).thenReturn(Collections.nCopies(10, "User"));

        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(1000, forumStatistics.getPostCount());
        assertEquals(2000, forumStatistics.getCommentCount());
        assertEquals(10, forumStatistics.getUserCount());
        assertEquals(100.0, forumStatistics.getPostsPerUser());
        assertEquals(200.0, forumStatistics.getCommentsPerUser());
        assertEquals(2.0, forumStatistics.getCommentsPerPost());
    }
    @Test
    void testCalculateAdvStatisticsWhenCommentsCountIsZero() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(Collections.singletonList("User1"));

        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(10, forumStatistics.getPostCount());
        assertEquals(0, forumStatistics.getCommentCount());
        assertEquals(1, forumStatistics.getUserCount());
        assertEquals(10.0, forumStatistics.getPostsPerUser());
        assertEquals(0, forumStatistics.getCommentsPerUser());
        assertEquals(0, forumStatistics.getCommentsPerPost());
    }
    @Test
    void testCalculateAdvStatisticsWhenCommentsAreLessThanPosts() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.usersNames()).thenReturn(Collections.nCopies(10, "User"));

        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(100, forumStatistics.getPostCount());
        assertEquals(50, forumStatistics.getCommentCount());
        assertEquals(10, forumStatistics.getUserCount());
        assertEquals(10.0, forumStatistics.getPostsPerUser());
        assertEquals(5.0, forumStatistics.getCommentsPerUser());
        assertEquals(0.5, forumStatistics.getCommentsPerPost());
    }
    @Test
    void testCalculateAdvStatisticsWhenCommentsAreMoreThanPosts() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.usersNames()).thenReturn(Collections.nCopies(10, "User"));

        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(50, forumStatistics.getPostCount());
        assertEquals(200, forumStatistics.getCommentCount());
        assertEquals(10, forumStatistics.getUserCount());
        assertEquals(5.0, forumStatistics.getPostsPerUser());
        assertEquals(20.0, forumStatistics.getCommentsPerUser());
        assertEquals(4.0, forumStatistics.getCommentsPerPost());
    }
    @Test
    void testCalculateAdvStatisticsWhenUsersCountIsZero() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.usersNames()).thenReturn(Collections.emptyList());

        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(50, forumStatistics.getPostCount());
        assertEquals(200, forumStatistics.getCommentCount());
        assertEquals(0, forumStatistics.getUserCount());
        assertEquals(0, forumStatistics.getPostsPerUser());
        assertEquals(0, forumStatistics.getCommentsPerUser());
        assertEquals(4.0, forumStatistics.getCommentsPerPost());
    }
    @Test
    void testCalculateAdvStatisticsWhenUsersCountIsHundred() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(Collections.nCopies(100, "User"));

        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(500, forumStatistics.getPostCount());
        assertEquals(1000, forumStatistics.getCommentCount());
        assertEquals(100, forumStatistics.getUserCount());
        assertEquals(5.0, forumStatistics.getPostsPerUser());
        assertEquals(10.0, forumStatistics.getCommentsPerUser());
        assertEquals(2.0, forumStatistics.getCommentsPerPost());
    }




}
