package com.kodilla.testing.forum.statistics;

public class ForumStatistics {


    private int userCount;
    private int postCount;
    private int commentCount;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;


    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }


    public void calculateAdvStatistics(Statistics statistics) {

        userCount = statistics.usersNames() != null ? statistics.usersNames().size() : 0;
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();


        postsPerUser = userCount > 0 ? (double) postCount / userCount : 0;
        commentsPerUser = userCount > 0 ? (double) commentCount / userCount : 0;
        commentsPerPost = postCount > 0 ? (double) commentCount / postCount : 0;
    }

    // Metoda wyświetlająca statystyki
    public void showStatistics() {
        System.out.println("Number of users: " + userCount);
        System.out.println("Number of posts: " + postCount);
        System.out.println("Number of comments: " + commentCount);
        System.out.println("Average posts per user: " + postsPerUser);
        System.out.println("Average comments per user: " + commentsPerUser);
        System.out.println("Average comments per post: " + commentsPerPost);
    }
}
