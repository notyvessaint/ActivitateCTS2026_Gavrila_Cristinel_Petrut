package src.ro.ase.cts.proxy.clase;

public class AutobuzCursaSpeciala implements MijlocTransport {
    private final MijlocTransport autobuz;

    public AutobuzCursaSpeciala(MijlocTransport autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if (this.autobuz.getTipCursa() == TipCursa.CURSA_NORMALA)
            this.autobuz.opresteInStatie(statie);
        else
            System.out.printf("Autobuzul nu a oprit in statia %s.\n", statie.getNume());
    }

    @Override
    public int getNrPasageri() {
        return this.autobuz.getNrPasageri();
    }

    @Override
    public TipCursa getTipCursa() {
        return this.autobuz.getTipCursa();
    }
}
