package ro.ase.cts.a13;

public class ModulPacientState {
    public interface StarePacient {
        void aplica(PacientContext pacient);
        String getDenumire();
    }

    public static class PacientContext {
        private final String nume;
        private StarePacient stare;

        public PacientContext(String nume) {
            this.nume = nume;
            this.stare = new Internat();
        }

        public void setStare(StarePacient stare) {
            this.stare = stare;
            System.out.println("Pacientul " + nume + " este acum in starea: " + stare.getDenumire());
        }

        public void schimbaStare(StarePacient stareNoua) {
            stareNoua.aplica(this);
        }
    }

    public static class Internat implements StarePacient {
        @Override
        public void aplica(PacientContext pacient) {
            pacient.setStare(this);
        }

        @Override
        public String getDenumire() {
            return "Internat";
        }
    }

    public static class SubObservatie implements StarePacient {
        @Override
        public void aplica(PacientContext pacient) {
            pacient.setStare(this);
        }

        @Override
        public String getDenumire() {
            return "SubObservatie";
        }
    }

    public static class Externat implements StarePacient {
        @Override
        public void aplica(PacientContext pacient) {
            pacient.setStare(this);
        }

        @Override
        public String getDenumire() {
            return "Externat";
        }
    }
}
