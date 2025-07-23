import java.util.*;

public class BikerManager {
    private final List<Biker> bikers = new ArrayList<>();

    public void addBiker(Biker biker) {
        bikers.add(biker);
    }

    public List<Biker> getAllBikers() {
        return bikers;
    }

    public Biker getBikerById(int id) {
        for (Biker biker : bikers) {
            if (biker.getBikerId() == id) return biker;
        }
        return null;
    }
}
