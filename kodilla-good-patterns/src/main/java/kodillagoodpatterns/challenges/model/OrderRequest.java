package kodillagoodpatterns.challenges.model;

public class OrderRequest {
    private User user;
    private Product product;

    public OrderRequest(Product product, User user) {
        this.product = product;
        this.user = user;
    }

    public OrderRequest(User user, Product product) {
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
