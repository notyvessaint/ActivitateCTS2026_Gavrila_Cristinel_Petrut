package ro.ase.cts.a14;

public class ModulInternareTemplate {
    public static abstract class InternareTemplate {
        public final void interneazaPacient(String pacient) {
            analizeazaDificultate(pacient);
            verificaDisponibilitate();
            emiteFisa(pacient);
        }

        protected abstract void analizeazaDificultate(String pacient);

        protected abstract void verificaDisponibilitate();

        protected abstract void emiteFisa(String pacient);
    }

    public static class InternareStandard extends InternareTemplate {
        @Override
        protected void analizeazaDificultate(String pacient) {
            System.out.println("Se analizeaza dificultatea pentru " + pacient + ".");
        }

        @Override
        protected void verificaDisponibilitate() {
            System.out.println("Se verifica paturile disponibile.");
        }

        @Override
        protected void emiteFisa(String pacient) {
            System.out.println("Se emite fisa de internare pentru " + pacient + ".");
        }
    }
}
