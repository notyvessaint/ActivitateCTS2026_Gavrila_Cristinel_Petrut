package ro.ase.cts.personal.nonmedical.clase;

import ro.ase.cts.personal.Personal;

public class Secretar extends Personal {
    public Secretar(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        final StringBuilder sb = new StringBuilder("Asistent");
        sb.append(super.toString());
        System.out.println(sb);
    }
}
