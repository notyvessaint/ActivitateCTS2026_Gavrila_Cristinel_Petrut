package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;

    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Angajat() {
        super();
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    @Override
    public String toString() {
        return String.format("Angajat: Nume=%s, Prenume=%s, Varsta=%d, Punctaj=%d, NrProiecte=%d, DenumireProiect=%s, Ocupatie=%s, Salariu=%d",
                getNume(), getPrenume(), getVarsta(), getPunctaj(), getNrProiecte(),
                Arrays.toString(denumireProiect), ocupatie, salariu);
    }

    public int finantare() {
        int suma = 10;
        System.out.printf("Angajatul %s %s primeste %d Euro/zi in proiect.%n", getNume(), getPrenume(), suma);
        return suma;
    }
}
