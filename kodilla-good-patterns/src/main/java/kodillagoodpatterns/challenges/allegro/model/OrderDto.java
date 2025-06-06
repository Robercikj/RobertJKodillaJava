package kodillagoodpatterns.challenges.allegro.model;

public class OrderDto {
    private User user;
    private boolean isOrdered;

    public OrderDto(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public void setOrdered(boolean ordered) {
        isOrdered = ordered;
    }
}
