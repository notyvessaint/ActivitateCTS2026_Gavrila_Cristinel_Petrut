package src.ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class LinieFactory {
    private HashMap<Integer, Linie> mapLinii = new HashMap<>();

    public LinieFactory() {
        mapLinii = new HashMap<>();
    }

    public Linie getLinie(int nrLinie, String primaStatie, String ultimaStatie) {
        return mapLinii.computeIfAbsent(nrLinie, _ -> new Linie(nrLinie, primaStatie, ultimaStatie));
    }
}
