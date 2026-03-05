package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nrProiecte;
    protected String[] denumireProiect;
    protected static int PUNCTAJ_MINIM = 80;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }

    public void setNrProiecte(int nr_proiecte, String[] proiecte) {
        this.nrProiecte = nr_proiecte;
        this.denumireProiect = proiecte;
    }

    public Aplicant() {
        super();
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrProiecte = nr_proiecte;
        this.denumireProiect = denumireProiect;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();

        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", punctaj=").append(punctaj);
        sb.append(", nr_proiecte=").append(nrProiecte);
        sb.append(", denumireProiect=").append(denumireProiect == null ? "null" : Arrays.asList(denumireProiect).toString());

        return sb.toString();
    }

    public void afiseazaStatut() {
        StringBuilder sb = new StringBuilder();

        sb.append("Aplicantul ")
                .append(this.nume)
                .append(" ")
                .append(this.prenume)
                .append(this.punctaj > Aplicant.PUNCTAJ_MINIM ? " " : " nu ")
                .append("a fost acceptat.");

        System.out.println(sb);
    }

    public abstract void afiseazaFinantare();
}