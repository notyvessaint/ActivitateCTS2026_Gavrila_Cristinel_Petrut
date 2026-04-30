package ro.ase.cts.a6;

import java.util.List;

public class ModulInternareFacade {
    public static class Pacient {
        private final String nume;
        private final boolean stareGrava;

        public Pacient(String nume, boolean stareGrava) {
            this.nume = nume;
            this.stareGrava = stareGrava;
        }

        public boolean areStareGrava() {
            return stareGrava;
        }

        public String getNume() {
            return nume;
        }
    }

    public static class Medic {
        public boolean confirmaInternare(Pacient pacient) {
            return pacient.areStareGrava();
        }
    }

    public static class Salon {
        private final List<Integer> paturiLibere;

        public Salon(List<Integer> paturiLibere) {
            this.paturiLibere = paturiLibere;
        }

        public boolean arePatLiber() {
            return !paturiLibere.isEmpty();
        }
    }

    public static class InternareFacade {
        public boolean poateFiInternat(Pacient pacient, Medic medic, Salon salon) {
            return pacient.areStareGrava() && medic.confirmaInternare(pacient) && salon.arePatLiber();
        }
    }
}
