package ro.ase.cts.clase;

public class Tramvai extends MijlocTransport {
    public Tramvai(String numarInmatriculare, int numarLocuri) {
        super(numarInmatriculare, numarLocuri);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Tramvai");
        sb.append(super.toString());

        System.out.println(sb);
    }
}
