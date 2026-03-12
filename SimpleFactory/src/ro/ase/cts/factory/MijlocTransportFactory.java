package ro.ase.cts.factory;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.clase.Tramvai;
import ro.ase.cts.clase.Troleibuz;

public class MijlocTransportFactory {
    public MijlocTransport createTransport(TipTransport tipTransport, String numarInmatriculare, int numarLocuri) {
        return switch (tipTransport) {
            case Autobuz -> new Autobuz(numarInmatriculare, numarLocuri);
            case Tramvai -> new Tramvai(numarInmatriculare, numarLocuri);
            case TroleiBuz -> new Troleibuz(numarInmatriculare, numarLocuri);
            default -> throw new RuntimeException("Invalid type");
        };
    }
}
