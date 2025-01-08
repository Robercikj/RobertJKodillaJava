package kodillagoodpatterns.challenges.interfaces;

import org.springframework.core.annotation.Order;

public interface OrderRepository {
    void saveOrder(User user,Order order);
}
