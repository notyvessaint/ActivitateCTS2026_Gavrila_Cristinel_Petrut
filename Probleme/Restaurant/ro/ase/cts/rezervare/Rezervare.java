package ro.ase.cts.rezervare;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Rezervare implements IRezervare {
    private String numeClient;
    private String numarTelefon;
    private int oraRezervare;
    private int ziRezervare;

    private Rezervare() {
    }

    public Rezervare(String numeClient, String numarTelefon, int oraRezervare, int ziRezervare) {
        if (numeClient.length() > 1) {
            this.numeClient = numeClient;
        } else {
            this.numeClient = "Ion";
        }

        if (numarTelefon.length() == 10) {
            this.numarTelefon = numarTelefon;
        } else {
            this.numarTelefon = "0777111222";
        }

        if (oraRezervare < 23 && oraRezervare > 9) {
            this.oraRezervare = oraRezervare;
        } else {
            this.oraRezervare = 9;
        }

        if (ziRezervare > 0 && ziRezervare <= 31) {
            this.ziRezervare = ziRezervare;
        } else {
            this.ziRezervare = LocalDateTime.now().getDayOfMonth();
        }
    }

    public void setOraRezervare(int oraRezervare) {
        if (oraRezervare < 23 && oraRezervare > 9) {
            this.oraRezervare = oraRezervare;
        }
    }

    public void setZiRezervare(int ziRezervare) {
        if (ziRezervare > 0 && ziRezervare <= 31) {
            this.ziRezervare = ziRezervare;
        }
    }

    @Override
    public IRezervare cloneaza() {
        Rezervare nouaRezervare = new Rezervare();

        nouaRezervare.numeClient = this.numeClient;
        nouaRezervare.numarTelefon = this.numarTelefon;
        nouaRezervare.oraRezervare = this.oraRezervare;
        nouaRezervare.ziRezervare = this.ziRezervare;

        return nouaRezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", ziRezervare=").append(ziRezervare);
        sb.append('}');
        return sb.toString();
    }
}
