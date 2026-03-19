package ro.ase.cts.felmancare.desert.simple_factory;

import ro.ase.cts.felmancare.desert.clase.Clatite;
import ro.ase.cts.felmancare.desert.clase.Papanasi;
import ro.ase.cts.felmancare.factory.FelMancare;
import ro.ase.cts.felmancare.factory.FelMancareFactory;
import ro.ase.cts.felmancare.factory.TipFelMancare;

public class DesertFactory implements FelMancareFactory {

    @Override
    public FelMancare createFelMancare(TipFelMancare tipFelMancare, Double gramaj, Double pret) {
        return this.createFelMancare(tipFelMancare, gramaj, pret, 0);
    }

    @Override
    public FelMancare createFelMancare(TipFelMancare tipFelMancare, Double gramaj, Double pret, int calorii) {
        return switch (tipFelMancare) {
            case TipDesert.Clatite -> new Clatite(gramaj, pret, calorii);
            case TipDesert.Papanasi -> new Papanasi(gramaj, pret, calorii);
            default -> null;
        };
    }
}
