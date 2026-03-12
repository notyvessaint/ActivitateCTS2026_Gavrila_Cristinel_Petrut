package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;
    private static int VALOARE_FINANTARE = 10;

    public Angajat() {
        super();
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumire_Proiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public static void setValoareFinantare(int valoareFinantare) {
        VALOARE_FINANTARE = valoareFinantare;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Angajat{");
        sb.append(super.toString());
        sb.append("ocupatie='").append(ocupatie).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }

    public void afiseazaFinantare() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste " + VALOARE_FINANTARE + " Euro/zi in proiect.");
    }
}
