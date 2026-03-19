package ro.ase.cts.retete;

import java.util.HashMap;

public class Reteta implements IReteta {
    private String nume;

    public Reteta() {
    }

    public Reteta(String nume) {
        this.nume = nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public IReteta copiaza() {
        Reteta reteta = new Reteta();
        reteta.nume = this.nume;
        return reteta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
