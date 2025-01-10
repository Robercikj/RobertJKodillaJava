package kodillagoodpatterns.challenges.allegro;

import kodillagoodpatterns.challenges.allegro.interfaces.*;
import kodillagoodpatterns.challenges.allegro.model.OrderDto;
import kodillagoodpatterns.challenges.allegro.model.OrderRequest;
import kodillagoodpatterns.challenges.allegro.model.Product;
import kodillagoodpatterns.challenges.allegro.model.User;

public class Application {
    public static void main(String[] args) {
        InformationService informationService = new EmailInformationService();
        OrderService orderService = new ProductOrderServiceImpl();
        OrderRepository orderRepository = new MemoryOrderRepository();

        ProductOrderService productOrderService = new ProductOrderService(informationService, orderService, orderRepository);

        User user = new User("John", "John@wp.pl");
        Product product = new Product("łyżwa");

        OrderRequest orderRequest = new OrderRequest(user, product);
        OrderDto orderDto = productOrderService.process(orderRequest);

    }


}
