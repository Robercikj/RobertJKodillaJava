package kodillagoodpatterns.challenges.interfaces;

import kodillagoodpatterns.challenges.model.Product;
import kodillagoodpatterns.challenges.model.User;


public interface OrderService {

   boolean order(User user, Product product);
}
