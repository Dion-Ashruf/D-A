public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        BikerManager bikerManager = new BikerManager();
        AssignmentManager assignmentManager = new AssignmentManager();

        // Bestellingen aanmaken
        Order o1 = new Order("Anita", "Torarica 23", "Subway", 12);
        Order o2 = new Order("Brian", "Kwattaweg 88", "Dominos", 15);
        orderManager.addOrder(o1);
        orderManager.addOrder(o2);

        // Bikers aanmaken
        Biker b1 = new Biker("Ravi");
        Biker b2 = new Biker("Selena");
        bikerManager.addBiker(b1);
        bikerManager.addBiker(b2);

        // Toewijzingen uitvoeren
        assignmentManager.assignOrder(b1, o1);
        assignmentManager.assignOrder(b2, o2);

        // Alle bestellingen tonen
        System.out.println("📋 Actieve Bestellingen:");
        for (Order order : orderManager.getAllOrders()) {
            System.out.println(order);
        }

        // Geschiedenis tonen
        assignmentManager.showHistory(orderManager, bikerManager);
    }
}
