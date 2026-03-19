package ro.ase.cts.felmancare.supe.clase;

import ro.ase.cts.felmancare.factory.FelMancare;

public abstract class Supa implements FelMancare {
    protected Double pret;
    protected Double gramaj;

    public Supa(Double gramaj, Double pret) {
        this.gramaj = gramaj;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supa{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}
