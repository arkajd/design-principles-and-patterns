package designprinciples.srp.solution;

import designprinciples.model.Order;

public class OrderProcessor {

    private final OrderPricingCalculator pricingCalculator;
    private final OrderRepository orderRepository;
    private final EmailNotificationService notificationService;

    public OrderProcessor(
            OrderPricingCalculator pricingCalculator,
            OrderRepository orderRepository,
            EmailNotificationService notificationService
    ) {
        this.pricingCalculator = pricingCalculator;
        this.orderRepository = orderRepository;
        this.notificationService = notificationService;
    }

    public void processOrder(Order order) throws Exception {
        double finalTotal = pricingCalculator.calculateTotal(order);
        order.setTotal(finalTotal);

        orderRepository.save(order);
        notificationService.sendOrderConfirmation(order);
    }
}
