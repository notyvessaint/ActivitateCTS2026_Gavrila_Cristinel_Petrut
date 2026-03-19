//Started in Seminar 4
package ro.ase.cts.main;

import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.felmancare.factory.MijlocTransportFactory;
import ro.ase.cts.felmancare.factory.TipTransport;

public class Main {
    public static void main(String[] args) {
        try {
            MijlocTransportFactory factory = new MijlocTransportFactory();

            MijlocTransport autobuz = factory.createTransport(TipTransport.Autobuz, "B 100 ABC", 40);
            autobuz.afiseazaDescriere();

            MijlocTransport tramvai = factory.createTransport(TipTransport.Tramvai, "B 101 ABC", 50);
            tramvai.afiseazaDescriere();

            MijlocTransport troleibuz = factory.createTransport(TipTransport.TroleiBuz, "B 102 ABC", 40);
            troleibuz.afiseazaDescriere();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
