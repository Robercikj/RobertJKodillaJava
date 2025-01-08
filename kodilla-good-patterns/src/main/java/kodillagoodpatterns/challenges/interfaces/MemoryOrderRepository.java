package kodillagoodpatterns.challenges.interfaces;

import kodillagoodpatterns.challenges.model.Product;
import kodillagoodpatterns.challenges.model.User;
import org.springframework.core.annotation.Order;

public class MemoryOrderRepository implements OrderRepository {
    @Override
    public void save(User user, Product product) {
        System.out.println("Saving order for: " + user.getName() + "Product: " + product.getName());
    }
}
