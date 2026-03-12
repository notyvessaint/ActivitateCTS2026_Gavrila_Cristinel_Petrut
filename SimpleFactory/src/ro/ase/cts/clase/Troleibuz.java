package ro.ase.cts.clase;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(String numarInmatriculare, int numarLocuri) {
        super(numarInmatriculare, numarLocuri);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Troleibuz");
        sb.append(super.toString());

        System.out.println(sb);
    }
}
