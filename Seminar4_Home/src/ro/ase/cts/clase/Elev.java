package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant {
    private int clasa;
    private String tutore;
    private static int VALOARE_FINANTARE = 30;

    public Elev() {
        super();
    }

    public Elev(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int i) {
        this.clasa = i;
    }

    public String getTutore() {
        return tutore;
    }

    public void setTutore(String tutore) {
        this.tutore = tutore;
    }

    public static void setValoareFinantare(int valoareFinantare) {
        VALOARE_FINANTARE = valoareFinantare;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Elev{");
        sb.append(super.toString());
        sb.append("clasa=").append(clasa);
        sb.append(", tutore='").append(tutore).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void afiseazaFinantare() {
        System.out.println("Elevul " + getNume() + " " + getPrenume() + " primeste " + VALOARE_FINANTARE + " Euro/zi in proiect.");
    }
}
