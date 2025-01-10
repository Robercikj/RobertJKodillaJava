package kodillagoodpatterns.challenges.allegro.interfaces;

import kodillagoodpatterns.challenges.allegro.model.Product;
import kodillagoodpatterns.challenges.allegro.model.User;

public class ProductOrderServiceImpl implements OrderService {

    @Override
    public boolean order(User user, Product product){
        System.out.println("Ordering product: " + product.getName());
        return true;
    }
}
