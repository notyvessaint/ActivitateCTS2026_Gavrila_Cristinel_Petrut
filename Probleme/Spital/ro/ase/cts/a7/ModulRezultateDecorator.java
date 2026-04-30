package ro.ase.cts.a7;

public class ModulRezultateDecorator {
    public interface Rezultate {
        void afiseazaRezultate(String pacient);
    }

    public static class RezultatePrintate implements Rezultate {
        @Override
        public void afiseazaRezultate(String pacient) {
            System.out.println("Rezultatele pacientului " + pacient + " au fost tiparite.");
        }
    }

    public static abstract class RezultateDecorator implements Rezultate {
        protected final Rezultate rezultate;

        protected RezultateDecorator(Rezultate rezultate) {
            this.rezultate = rezultate;
        }

        @Override
        public void afiseazaRezultate(String pacient) {
            rezultate.afiseazaRezultate(pacient);
        }
    }

    public static class RezultateOnlineDecorator extends RezultateDecorator {
        public RezultateOnlineDecorator(Rezultate rezultate) {
            super(rezultate);
        }

        @Override
        public void afiseazaRezultate(String pacient) {
            super.afiseazaRezultate(pacient);
            System.out.println("Rezultatele pacientului " + pacient + " sunt disponibile si online.");
        }
    }
}
