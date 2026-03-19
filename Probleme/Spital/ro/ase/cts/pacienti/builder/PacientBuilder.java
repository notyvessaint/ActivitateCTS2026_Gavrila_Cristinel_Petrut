package ro.ase.cts.pacienti.builder;

import ro.ase.cts.pacienti.clase.Pacient;

public class PacientBuilder implements Builder {
    private String nume;
    private String prenume;
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halatInterior;

    public PacientBuilder() {
        this.patRabatabil = false;
        this.micDejun = false;
        this.papuciCamera = false;
        this.halatInterior = false;
    }

    public PacientBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public PacientBuilder setPrenume(String prenume) {
        this.prenume = prenume;
        return this;
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public PacientBuilder setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    public PacientBuilder setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
        return this;
    }

    public PacientBuilder setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
        return this;
    }

    @Override
    public Pacient build() {
        return new Pacient(nume, prenume, patRabatabil, micDejun, papuciCamera, halatInterior);
    }
}