package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {

    protected String facultate;
    protected int anStudii;

    public Student() {
        super();
    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, String facultate, int anStudii) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.facultate = facultate;
        this.anStudii = anStudii;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public int getAnStudii() {
        return anStudii;
    }

    public void setAnStudii(int anStudii) {
        this.anStudii = anStudii;
    }

    @Override
    public String toString() {
        return String.format("Student: Nume=%s, Prenume=%s, Varsta=%d, Punctaj=%d, NrProiecte=%d, DenumireProiect=%s, Facultate=%s, AnStudii=%d",
                getNume(), getPrenume(), getVarsta(), getPunctaj(), getNrProiecte(),
                Arrays.toString(denumireProiect), facultate, anStudii);
    }

    public int finantare() {
        int suma = 25;
        System.out.printf("Studentul %s %s primeste %d Euro/zi in proiect.%n", getNume(), getPrenume(), suma);
        return suma;
    }
}
