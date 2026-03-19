package ro.ase.cts.personal.medical.clase;

import ro.ase.cts.personal.Personal;

public class Asistent extends Personal {
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        final StringBuilder sb = new StringBuilder("Asistent");
        sb.append(super.toString());
        System.out.println(sb);
    }
}
