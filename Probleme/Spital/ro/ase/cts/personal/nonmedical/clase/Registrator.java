package ro.ase.cts.personal.nonmedical.clase;

import ro.ase.cts.personal.Personal;

public class Registrator extends Personal {
    public Registrator(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        final StringBuilder sb = new StringBuilder("Medic");
        sb.append(super.toString());
        System.out.println(sb);
    }
}
