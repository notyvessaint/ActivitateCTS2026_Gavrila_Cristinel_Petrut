package ro.ase.cts.felmancare.supe.simple_factory;

import ro.ase.cts.felmancare.factory.FelMancare;
import ro.ase.cts.felmancare.factory.FelMancareFactory;
import ro.ase.cts.felmancare.factory.TipFelMancare;
import ro.ase.cts.felmancare.supe.clase.SupaCiuperci;
import ro.ase.cts.felmancare.supe.clase.SupaLegume;

public class SupaFactory implements FelMancareFactory {

    @Override
    public FelMancare createFelMancare(TipFelMancare tipFelMancare, Double gramaj, Double pret) {
        return switch (tipFelMancare) {
            case TipSupa.Legume -> new SupaLegume(gramaj, pret);
            case TipSupa.Ciuperci -> new SupaCiuperci(gramaj, pret);
            default -> null;
        };
    }

    @Override
    public FelMancare createFelMancare(TipFelMancare tipFelMancare, Double gramaj, Double pret, int calorii) {
        return this.createFelMancare(tipFelMancare, gramaj, pret);
    }
}
