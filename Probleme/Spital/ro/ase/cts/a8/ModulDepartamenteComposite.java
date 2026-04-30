package ro.ase.cts.a8;

import java.util.ArrayList;
import java.util.List;

public class ModulDepartamenteComposite {
    public interface StructuraSpital {
        void adauga(StructuraSpital componenta);
        void sterge(StructuraSpital componenta);
        void afiseaza(String indentare);
    }

    public static class Sectie implements StructuraSpital {
        private final String nume;

        public Sectie(String nume) {
            this.nume = nume;
        }

        @Override
        public void adauga(StructuraSpital componenta) {
            throw new UnsupportedOperationException("Sectia nu are subsectii.");
        }

        @Override
        public void sterge(StructuraSpital componenta) {
            throw new UnsupportedOperationException("Sectia nu are subsectii.");
        }

        @Override
        public void afiseaza(String indentare) {
            System.out.println(indentare + "- Sectie: " + nume);
        }
    }

    public static class Departament implements StructuraSpital {
        private final String nume;
        private final List<StructuraSpital> copii = new ArrayList<>();

        public Departament(String nume) {
            this.nume = nume;
        }

        @Override
        public void adauga(StructuraSpital componenta) {
            copii.add(componenta);
        }

        @Override
        public void sterge(StructuraSpital componenta) {
            copii.remove(componenta);
        }

        @Override
        public void afiseaza(String indentare) {
            System.out.println(indentare + "+ Departament: " + nume);
            for (StructuraSpital copil : copii) {
                copil.afiseaza(indentare + "  ");
            }
        }
    }
}
