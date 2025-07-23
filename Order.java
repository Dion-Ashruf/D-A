public class Order {
    private static int idCounter = 1;
    private final int orderId;
    private String klantNaam;
    private String adres;
    private String restaurant;
    private int bereidingstijd;
    private String status;

    public Order(String klantNaam, String adres, String restaurant, int bereidingstijd) {
        this.orderId = idCounter++;
        this.klantNaam = klantNaam;
        this.adres = adres;
        this.restaurant = restaurant;
        this.bereidingstijd = bereidingstijd;
        this.status = "Pending";
    }

    public int getOrderId() {
        return orderId;
    }

    public String getKlantNaam() {
        return klantNaam;
    }

    public String getAdres() {
        return adres;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public int getBereidingstijd() {
        return bereidingstijd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBereidingstijd(int tijd) {
        this.bereidingstijd = tijd;
    }

    @Override
    public String toString() {
        return "Order #" + orderId + " | Klant: " + klantNaam + " | Adres: " + adres +
                " | Restaurant: " + restaurant + " | Tijd: " + bereidingstijd +
                " min | Status: " + status;
    }
}
