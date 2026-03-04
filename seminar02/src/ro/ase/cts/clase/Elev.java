package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant {

    private int clasa;
    private String tutore;

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }

    public String getTutore() {
        return tutore;
    }

    public void setTutore(String tutore) {
        this.tutore = tutore;
    }

    public Elev() {
        super();
    }

    public Elev(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, int clasa, String tutore) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }

    @Override
    public String toString() {
        return String.format("Elev: Nume=%s, Prenume=%s, Varsta=%d, Punctaj=%d, NrProiecte=%d, DenumireProiect=%s, Clasa=%s, Tutore=%s",
                getNume(), getPrenume(), getVarsta(), getPunctaj(), getNrProiecte(),
                Arrays.toString(denumireProiect), clasa, tutore);
    }

    public int finantare() {
        int suma = 30;
        System.out.printf("Elevul %s %s primeste %d Euro/zi in proiect.%n", getNume(), getPrenume(), suma);
        return suma;
    }
}
