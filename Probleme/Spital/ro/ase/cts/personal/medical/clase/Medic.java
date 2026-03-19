package ro.ase.cts.personal.medical.clase;

import ro.ase.cts.personal.Personal;

public class Medic extends Personal {
    public Medic(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        final StringBuilder sb = new StringBuilder("Medic");
        sb.append(super.toString());
        System.out.println(sb);
    }
}
