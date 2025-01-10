package kodillagoodpatterns.challenges.allegro.interfaces;

import kodillagoodpatterns.challenges.allegro.model.Product;
import kodillagoodpatterns.challenges.allegro.model.User;


public interface OrderService {

   boolean order(User user, Product product);
}
