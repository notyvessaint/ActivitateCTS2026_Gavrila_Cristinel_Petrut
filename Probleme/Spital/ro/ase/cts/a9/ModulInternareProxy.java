package ro.ase.cts.a9;

public class ModulInternareProxy {
    public interface ServiciuInternare {
        void interneaza(String numePacient, boolean areAsigurare);
    }

    public static class InternareSpital implements ServiciuInternare {
        @Override
        public void interneaza(String numePacient, boolean areAsigurare) {
            System.out.println("Pacientul " + numePacient + " a fost internat.");
        }
    }

    public static class InternareAsiguratiProxy implements ServiciuInternare {
        private final ServiciuInternare internare;

        public InternareAsiguratiProxy(ServiciuInternare internare) {
            this.internare = internare;
        }

        @Override
        public void interneaza(String numePacient, boolean areAsigurare) {
            if (areAsigurare) {
                internare.interneaza(numePacient, true);
            } else {
                System.out.println("Pacientul " + numePacient + " nu poate fi internat fara asigurare.");
            }
        }
    }
}
