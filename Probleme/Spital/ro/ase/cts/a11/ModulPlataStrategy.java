package ro.ase.cts.a11;

public class ModulPlataStrategy {
    public interface ModPlata {
        void plateste(double suma);
    }

    public static class PlataCash implements ModPlata {
        @Override
        public void plateste(double suma) {
            System.out.println("Plata cash: " + suma + " lei.");
        }
    }

    public static class PlataCard implements ModPlata {
        @Override
        public void plateste(double suma) {
            System.out.println("Plata card: " + suma + " lei.");
        }
    }

    public static class PlataPacient {
        private ModPlata modPlata;

        public void setModPlata(ModPlata modPlata) {
            this.modPlata = modPlata;
        }

        public void efectueazaPlata(double suma) {
            if (modPlata == null) {
                throw new IllegalStateException("Nu a fost setat un mod de plata.");
            }
            modPlata.plateste(suma);
        }
    }
}
