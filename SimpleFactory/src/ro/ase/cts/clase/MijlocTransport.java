package ro.ase.cts.clase;

public abstract class MijlocTransport {
    protected String numarInmatriculare;
    protected int numarLocuri;

    public MijlocTransport(String numarInmatriculare, int numarLocuri) {
        this.numarInmatriculare = numarInmatriculare;
        this.numarLocuri = numarLocuri;
    }

    public abstract void afiseazaDescriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("numarInmatriculare='").append(numarInmatriculare).append('\'');
        sb.append(", numarLocuri=").append(numarLocuri);
        sb.append('}');
        return sb.toString();
    }
}
