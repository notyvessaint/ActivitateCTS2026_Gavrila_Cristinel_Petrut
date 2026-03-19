package ro.ase.cts.pacienti.clase;

public class Pacient {
    private String nume;
    private String prenume;
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halatInterior;

    public Pacient() {
    }

    public Pacient(String nume, String prenume, boolean patRabatabil, boolean micDejun, boolean papuciCamera, boolean halatInterior) {
        this.nume = nume;
        this.prenume = prenume;
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciCamera = papuciCamera;
        this.halatInterior = halatInterior;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }

    public void setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuciCamera=").append(papuciCamera);
        sb.append(", halatInterior=").append(halatInterior);
        sb.append('}');
        return sb.toString();
    }
}
