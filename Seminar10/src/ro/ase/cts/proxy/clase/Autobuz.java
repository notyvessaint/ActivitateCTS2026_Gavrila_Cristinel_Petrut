package src.ro.ase.cts.proxy.clase;

public class Autobuz implements MijlocTransport {
    private int nrPasageri;
    private int nrLinie;
    private TipCursa tipCursa;

    public Autobuz(int nrPasageri, int nrLinie) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
        this.tipCursa = TipCursa.CURSA_NORMALA;
    }

    public Autobuz(int nrPasageri, int nrLinie, TipCursa tipCursa) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
        this.tipCursa = tipCursa;
    }

    public int getNrPasageri() {
        return nrPasageri;
    }

    public TipCursa getTipCursa() {
        return tipCursa;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        System.out.printf("Autobuzul dp linia %d a oprit in statia %s.\n", nrLinie, statie.getNume());
    }
}
