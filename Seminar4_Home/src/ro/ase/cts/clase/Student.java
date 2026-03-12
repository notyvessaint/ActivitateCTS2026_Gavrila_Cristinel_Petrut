package ro.ase.cts.clase;

public class Student extends Aplicant {
    protected String facultate;
    protected int anStudii;
    private static int VALOARE_FINANTARE = 20;

    public Student() {
        super();
    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int anStudii) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.facultate = facultate;
        this.anStudii = anStudii;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public void setAnStudii(int anStudii) {
        this.anStudii = anStudii;
    }

    public static void setValoareFinantare(int valoareFinantare) {
        VALOARE_FINANTARE = valoareFinantare;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append(super.toString());
        sb.append("facultate='").append(facultate).append('\'');
        sb.append(", an_studii=").append(anStudii);
        sb.append('}');
        return sb.toString();
    }

    public void afiseazaFinantare() {
        System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste " + VALOARE_FINANTARE + " Euro/zi in proiect.");
    }
}
