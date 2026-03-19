package ro.ase.cts.felmancare.desert.clase;

public class Clatite extends Desert {
    public Clatite(Double gramaj, Double pret, int calorii) {
        super(gramaj, pret, calorii);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clatite ");
        sb.append(super.toString());
        System.out.println(sb);
    }
}
