package ro.ase.cts.felmancare.desert.clase;

import ro.ase.cts.felmancare.factory.FelMancare;

public abstract class Desert implements FelMancare {
    protected Double gramaj;
    protected Double pret;
    protected int calorii;

    public Desert(Double gramaj, Double pret, int calorii) {
        this.gramaj = gramaj;
        this.pret = pret;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Desert{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append(", calorii=").append(calorii);
        sb.append('}');
        return sb.toString();
    }
}
