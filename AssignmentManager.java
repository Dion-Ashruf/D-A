import java.time.LocalDateTime;
import java.util.*;

public class AssignmentManager {
    private final List<Assignment> assignments = new ArrayList<>();

    public void assignOrder(Biker biker, Order order) {
        if (biker.isBeschikbaar()) {
            assignments.add(new Assignment(order.getOrderId(), biker.getBikerId(), LocalDateTime.now()));
            biker.setHuidigeBestelling(order);
            biker.setBeschikbaar(false);
            order.setStatus("Assigned to " + biker.getNaam());
        } else {
            System.out.println("❌ Biker is niet beschikbaar: " + biker.getNaam());
        }
    }

    public void showHistory(OrderManager orderManager, BikerManager bikerManager) {
        System.out.println("\n📦 Bestellingsgeschiedenis:");
        for (Assignment assignment : assignments) {
            Order order = orderManager.getOrderById(assignment.getOrderId());
            Biker biker = bikerManager.getBikerById(assignment.getBikerId());
            System.out.println("- " + assignment + " | Status: " + order.getStatus());
        }
    }
}
