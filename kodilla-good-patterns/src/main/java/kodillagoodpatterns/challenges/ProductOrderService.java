package kodillagoodpatterns.challenges;

import kodillagoodpatterns.challenges.interfaces.InformationService;
import kodillagoodpatterns.challenges.interfaces.OrderRepository;
import kodillagoodpatterns.challenges.interfaces.OrderService;
import kodillagoodpatterns.challenges.model.OrderDto;
import kodillagoodpatterns.challenges.model.OrderRequest;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }


        public OrderDto process(OrderRequest orderRequest) {
            boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct());
            if (isOrdered) {
                informationService.inform(orderRequest.getUser());
                orderRepository.saveOrder(orderRequest.getUser(), orderRequest.getProduct());
                return new OrderDto(orderRequest.getUser(), true);
            } else {
                return new OrderDto(orderRequest.getUser(), false);
            }
        }
    }
