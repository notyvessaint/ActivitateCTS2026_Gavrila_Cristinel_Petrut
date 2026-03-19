package ro.ase.cts.personal.nonmedical.factory;

import ro.ase.cts.personal.nonmedical.clase.Secretar;
import ro.ase.cts.personal.nonmedical.clase.Registrator;
import ro.ase.cts.personal.Personal;

public class PersonalNonMedicalFactory {
    private static TipPersonalNonMedical tipPersonal;

    public PersonalNonMedicalFactory(TipPersonalNonMedical tipPersonal) {
        this.tipPersonal = tipPersonal;
    }

    public Personal createPersonal(String nume) {
        return switch (tipPersonal) {
            case Registrator -> new Registrator(nume);
            case Secretar -> new Secretar(nume);
            default -> throw new RuntimeException("Invalid type");
        };
    }
}
