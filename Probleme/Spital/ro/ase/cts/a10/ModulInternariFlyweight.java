package ro.ase.cts.a10;

import java.util.HashMap;
import java.util.Map;

public class ModulInternariFlyweight {
    public interface PacientFlyweight {
        void afiseazaInternare(DateInternare dateInternare);
    }

    public static class DateInternare {
        private final int numarSalon;
        private final int numarPat;
        private final int numarZile;

        public DateInternare(int numarSalon, int numarPat, int numarZile) {
            this.numarSalon = numarSalon;
            this.numarPat = numarPat;
            this.numarZile = numarZile;
        }

        @Override
        public String toString() {
            return "salon=" + numarSalon + ", pat=" + numarPat + ", zile=" + numarZile;
        }
    }

    public static class PacientConcret implements PacientFlyweight {
        private final String nume;
        private final String telefon;
        private final String adresa;

        public PacientConcret(String nume, String telefon, String adresa) {
            this.nume = nume;
            this.telefon = telefon;
            this.adresa = adresa;
        }

        @Override
        public void afiseazaInternare(DateInternare dateInternare) {
            System.out.println("Internare pacient: " + nume + ", tel: " + telefon + ", adresa: " + adresa
                    + ", date internare: " + dateInternare);
        }
    }

    public static class FabricaPacienti {
        private final Map<String, PacientFlyweight> pacienti = new HashMap<>();

        public PacientFlyweight getPacient(String cnp, String nume, String telefon, String adresa) {
            return pacienti.computeIfAbsent(cnp, key -> new PacientConcret(nume, telefon, adresa));
        }
    }
}
