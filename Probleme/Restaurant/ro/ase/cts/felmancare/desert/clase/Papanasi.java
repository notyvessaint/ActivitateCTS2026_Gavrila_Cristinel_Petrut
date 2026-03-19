package ro.ase.cts.felmancare.desert.clase;

public class Papanasi extends Desert {
    public Papanasi(Double gramaj, Double pret, int calorii) {
        super(gramaj, pret, calorii);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Papanasi ");
        sb.append(super.toString());
        System.out.println(sb);
    }
}
