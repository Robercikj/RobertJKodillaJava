package kodillagoodpatterns.challenges;

import kodillagoodpatterns.challenges.interfaces.*;
import kodillagoodpatterns.challenges.model.OrderDto;
import kodillagoodpatterns.challenges.model.OrderRequest;
import kodillagoodpatterns.challenges.model.Product;
import kodillagoodpatterns.challenges.model.User;

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

        System.out.println("Order successed: " + orderDto.isOrdered());
    }

}
