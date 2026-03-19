package ro.ase.cts.felmancare.factory;

public interface FelMancareFactory {
    public FelMancare createFelMancare(TipFelMancare tipFelMancare, Double gramaj, Double pret);

    public FelMancare createFelMancare(TipFelMancare tipFelMancare, Double gramaj, Double pret, int calorii);
}
