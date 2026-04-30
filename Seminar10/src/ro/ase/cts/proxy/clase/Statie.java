package src.ro.ase.cts.proxy.clase;

public class Statie {
    private String nume;
    private int nrCalatori;

    public Statie(String nume, int nrCalatori) {
        this.nume = nume;
        this.nrCalatori = nrCalatori;
    }

    public String getNume() {
        return nume;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }
}