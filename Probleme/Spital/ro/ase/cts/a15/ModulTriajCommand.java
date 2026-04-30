package ro.ase.cts.a15;

import java.util.ArrayList;
import java.util.List;

public class ModulTriajCommand {
    public interface Comanda {
        void executa();
    }

    public static class Medic {
        private final String nume;

        public Medic(String nume) {
            this.nume = nume;
        }

        public void interneazaPacient(String pacient) {
            System.out.println("Dr. " + nume + " interneaza pacientul " + pacient + ".");
        }

        public void trateazaUrgent(String pacient) {
            System.out.println("Dr. " + nume + " trateaza de urgenta pacientul " + pacient + ".");
        }
    }

    public static class ComandaInternare implements Comanda {
        private final Medic medic;
        private final String pacient;

        public ComandaInternare(Medic medic, String pacient) {
            this.medic = medic;
            this.pacient = pacient;
        }

        @Override
        public void executa() {
            medic.interneazaPacient(pacient);
        }
    }

    public static class ComandaTratareUrgenta implements Comanda {
        private final Medic medic;
        private final String pacient;

        public ComandaTratareUrgenta(Medic medic, String pacient) {
            this.medic = medic;
            this.pacient = pacient;
        }

        @Override
        public void executa() {
            medic.trateazaUrgent(pacient);
        }
    }

    public static class OperatorPrimire {
        private final List<Comanda> coadaComenzi = new ArrayList<>();

        public void trimiteComanda(Comanda comanda) {
            coadaComenzi.add(comanda);
        }

        public void proceseazaComenzi() {
            for (Comanda comanda : coadaComenzi) {
                comanda.executa();
            }
            coadaComenzi.clear();
        }
    }
}
