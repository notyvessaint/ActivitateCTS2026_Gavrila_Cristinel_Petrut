package ro.ase.cts.felmancare.supe.clase;

public class SupaCiuperci extends Supa {

    public SupaCiuperci(Double gramaj, Double pret) {
        super(gramaj, pret);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supa ciuperci");
        sb.append(super.toString());

        System.out.println(sb);
    }
}
