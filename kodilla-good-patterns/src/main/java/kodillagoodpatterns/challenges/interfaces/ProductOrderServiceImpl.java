package kodillagoodpatterns.challenges.interfaces;

import kodillagoodpatterns.challenges.ProductOrderService;
import kodillagoodpatterns.challenges.model.Product;
import kodillagoodpatterns.challenges.model.User;

public class ProductOrderServiceImpl implements OrderService {

    @Override
    public boolean order(User user, Product product){
        System.out.println("Ordering product: " + product.getName());
        return true;
    }
}
