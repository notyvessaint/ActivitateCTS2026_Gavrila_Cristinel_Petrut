package ro.ase.cts.personal.medical.clase;

import ro.ase.cts.personal.Personal;

public class Bracadier extends Personal {
    public Bracadier(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        final StringBuilder sb = new StringBuilder("Bracadier");
        sb.append(super.toString());
        System.out.println(sb);
    }
}
