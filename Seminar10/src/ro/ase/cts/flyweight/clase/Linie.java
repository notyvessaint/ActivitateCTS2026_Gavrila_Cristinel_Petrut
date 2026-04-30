package src.ro.ase.cts.flyweight.clase;

public class Linie implements LinieTransport {
    private int nrLinie;
    private String primaStatie;
    private String ultimateStatie;

    public Linie(int nrLinie, String primaStatie, String ultimateStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimateStatie = ultimateStatie;
    }


    @Override
    public void descriereLinie(Autobuz autobuz) {
        System.out.printf("Circula pe linia %d, autobuzul %s fabricat in anul %d cu %d numar de locuri.\n",
                this.nrLinie, autobuz.getModel(), autobuz.getAnFabricatie(), autobuz.getNrLocuri());
    }

    @Override
    public void afiseazaNumarMaximPasageriPeLinie(Autobuz autobuz) {
        System.out.printf("Nr maxim de pasageri: %d intre statiile: %s - %s.\n", autobuz.getNrLocuri(), this.primaStatie, this.ultimateStatie);
    }
}
