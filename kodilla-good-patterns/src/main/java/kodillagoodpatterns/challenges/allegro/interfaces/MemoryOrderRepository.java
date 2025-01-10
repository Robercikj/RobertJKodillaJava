package kodillagoodpatterns.challenges.allegro.interfaces;

import kodillagoodpatterns.challenges.allegro.model.Product;
import kodillagoodpatterns.challenges.allegro.model.User;

public class MemoryOrderRepository implements OrderRepository {
    @Override
    public void saveOrder(User user, Product product) {
        System.out.println("Saving order for: " + user.getName() + "Product: " + product.getName());
    }
}
