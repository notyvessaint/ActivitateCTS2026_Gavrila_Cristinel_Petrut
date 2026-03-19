package ro.ase.cts.felmancare.supe.clase;

public class SupaLegume extends Supa {

    public SupaLegume(Double gramaj, Double pret) {
        super(gramaj, pret);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supa legume");
        sb.append(super.toString());

        System.out.println(sb);
    }
}
