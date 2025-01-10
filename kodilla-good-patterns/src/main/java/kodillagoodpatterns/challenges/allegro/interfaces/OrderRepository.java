package kodillagoodpatterns.challenges.allegro.interfaces;

import kodillagoodpatterns.challenges.allegro.model.Product;
import kodillagoodpatterns.challenges.allegro.model.User;

public interface OrderRepository {
    void saveOrder(User user, Product product);
}
