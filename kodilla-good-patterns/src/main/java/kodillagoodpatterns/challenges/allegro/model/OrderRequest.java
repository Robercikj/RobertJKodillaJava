package kodillagoodpatterns.challenges.allegro.model;

public class OrderRequest {
    private User user;
    private Product product;

    public OrderRequest( User user,Product product) {
        this.product = product;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
