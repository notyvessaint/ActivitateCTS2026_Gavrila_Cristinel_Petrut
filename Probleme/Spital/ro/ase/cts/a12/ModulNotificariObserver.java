package ro.ase.cts.a12;

import java.util.ArrayList;
import java.util.List;

public class ModulNotificariObserver {
    public interface Observator {
        void primesteNotificare(String mesaj);
    }

    public static class PacientAbonat implements Observator {
        private final String nume;

        public PacientAbonat(String nume) {
            this.nume = nume;
        }

        @Override
        public void primesteNotificare(String mesaj) {
            System.out.println("Pacientul " + nume + " a primit: " + mesaj);
        }
    }

    public static class Spital {
        private final List<Observator> observatori = new ArrayList<>();

        public void aboneaza(Observator observator) {
            observatori.add(observator);
        }

        public void dezaboneaza(Observator observator) {
            observatori.remove(observator);
        }

        public void anuntaEpidemie(String numeVirus) {
            String mesaj = "Atentie! Virus nou: " + numeVirus;
            for (Observator observator : observatori) {
                observator.primesteNotificare(mesaj);
            }
        }
    }
}
