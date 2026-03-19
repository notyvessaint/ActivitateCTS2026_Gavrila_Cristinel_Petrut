package ro.ase.cts.personal;

public abstract class Personal {
    private String nume;

    public Personal(String nume) {
        this.nume = nume;
    }

    public abstract void afiseazaDescriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
