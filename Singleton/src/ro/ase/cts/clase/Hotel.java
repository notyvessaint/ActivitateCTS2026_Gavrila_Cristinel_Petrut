package ro.ase.cts.clase;

public class Hotel {
    private String numeHotel;
    private int numarCamere;
    private int numarCamereOcupate;
    private static Hotel instance = null;

    private Hotel(String numeHotel, int numarCamere, int numarCamereOcupate) {
        this.numeHotel = numeHotel;
        this.numarCamere = numarCamere;
        this.numarCamereOcupate = numarCamereOcupate;
    }

    public static synchronized Hotel getInstance(String numeHotel, int numarCamere, int numarCamereOcupate) {
        if (instance == null) {
            instance = new Hotel(numeHotel, numarCamere, numarCamereOcupate);
        }

        return instance;
    }

    public void rezervaCamera() {
        if (this.numarCamere > this.numarCamereOcupate) {
            this.numarCamereOcupate++;
            System.out.println("O camera a fost rezervata");
        } else {
            System.out.println("Nu mai sunt camere disponibile");
        }
    }

    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder();

        sb.append("Hotelul: ").append(numeHotel);
        sb.append(" are ").append(numarCamere).append(" numar camere ");
        sb.append("dintre care ").append(numarCamereOcupate).append(" sunt ocupate");

        System.out.println(sb);
    }

    public int calculeazaGradOcupare() {
        return this.numarCamereOcupate * 100 / this.numarCamere;
    }

    public void elibereazaCamera() {
        if (this.numarCamereOcupate != 0) {
            this.numarCamereOcupate--;
            System.out.println("O camera a fost eliberata");
        } else {
            System.out.println("Nu sunt camere ocupate");
        }
    }
}