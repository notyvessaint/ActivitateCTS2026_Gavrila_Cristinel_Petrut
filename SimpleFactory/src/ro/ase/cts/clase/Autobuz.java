package ro.ase.cts.clase;

public class Autobuz extends MijlocTransport {
    public Autobuz(String numarInmatriculare, int numarLocuri) {
        super(numarInmatriculare, numarLocuri);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Autobuz");
        sb.append(super.toString());

        System.out.println(sb);
    }
}
