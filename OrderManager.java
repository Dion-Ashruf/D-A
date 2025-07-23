import java.util.*;

public class OrderManager {
    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrderById(int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) return order;
        }
        return null;
    }

    public void updateOrder(int orderId, String newStatus) {
        Order order = getOrderById(orderId);
        if (order != null) {
            order.setStatus(newStatus);
        }
    }

    public void deleteOrder(int orderId) {
        orders.removeIf(order -> order.getOrderId() == orderId);
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}
