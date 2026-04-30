package ro.ase.cts.a5;

public class ModulFarmacieAdapter {
    public interface MedicamentSpital {
        void achizitioneazaMedicament();
        boolean prezintaReteta();
    }

    public static class MedicamentFarmacie {
        public void cumparaMedicament() {
            System.out.println("Farmacie: medicament vandut.");
        }
    }

    public static class AdapterMedicamentFarmacie implements MedicamentSpital {
        private final MedicamentFarmacie medicamentFarmacie;

        public AdapterMedicamentFarmacie(MedicamentFarmacie medicamentFarmacie) {
            this.medicamentFarmacie = medicamentFarmacie;
        }

        @Override
        public void achizitioneazaMedicament() {
            if (prezintaReteta()) {
                medicamentFarmacie.cumparaMedicament();
            }
        }

        @Override
        public boolean prezintaReteta() {
            System.out.println("Spital: reteta verificata.");
            return true;
        }
    }
}
