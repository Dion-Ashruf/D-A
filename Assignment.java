import java.time.LocalDateTime;

public class Assignment {
    private int orderId;
    private int bikerId;
    private LocalDateTime timestamp;

    public Assignment(int orderId, int bikerId, LocalDateTime timestamp) {
        this.orderId = orderId;
        this.bikerId = bikerId;
        this.timestamp = timestamp;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getBikerId() {
        return bikerId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Order #" + orderId + " → Biker #" + bikerId + " | Tijd: " + timestamp;
    }
}
