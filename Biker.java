public class Biker {
    private static int idCounter = 1;
    private final int bikerId;
    private String naam;
    private boolean beschikbaar;
    private Order huidigeBestelling;

    public Biker(String naam) {
        this.bikerId = idCounter++;
        this.naam = naam;
        this.beschikbaar = true;
    }

    public int getBikerId() {
        return bikerId;
    }

    public String getNaam() {
        return naam;
    }

    public boolean isBeschikbaar() {
        return beschikbaar;
    }

    public void setBeschikbaar(boolean beschikbaar) {
        this.beschikbaar = beschikbaar;
    }

    public Order getHuidigeBestelling() {
        return huidigeBestelling;
    }

    public void setHuidigeBestelling(Order order) {
        this.huidigeBestelling = order;
    }

    @Override
    public String toString() {
        return "Biker #" + bikerId + " | Naam: " + naam + " | Beschikbaar: " + beschikbaar;
    }
}
