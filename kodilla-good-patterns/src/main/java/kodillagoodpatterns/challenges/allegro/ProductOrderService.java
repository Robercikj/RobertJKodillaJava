package kodillagoodpatterns.challenges.allegro;

import kodillagoodpatterns.challenges.allegro.interfaces.InformationService;
import kodillagoodpatterns.challenges.allegro.interfaces.OrderRepository;
import kodillagoodpatterns.challenges.allegro.interfaces.OrderService;
import kodillagoodpatterns.challenges.allegro.model.OrderDto;
import kodillagoodpatterns.challenges.allegro.model.OrderRequest;

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
