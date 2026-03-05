package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int an_studii;
    private static int VALOARE_FINANTARE = 20;

    public Student() {
        super();
    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.facultate = facultate;
        this.an_studii = an_studii;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public void setAn_studii(int an_studii) {
        this.an_studii = an_studii;
    }

    public static void setValoareFinantare(int valoareFinantare) {
        VALOARE_FINANTARE = valoareFinantare;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append(super.toString());
        sb.append("facultate='").append(facultate).append('\'');
        sb.append(", an_studii=").append(an_studii);
        sb.append('}');
        return sb.toString();
    }

    public void afiseazaFinantare() {
        System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste " + VALOARE_FINANTARE + " Euro/zi in proiect.");
    }
}
