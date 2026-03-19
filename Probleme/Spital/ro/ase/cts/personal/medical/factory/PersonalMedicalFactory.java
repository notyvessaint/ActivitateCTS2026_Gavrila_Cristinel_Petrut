package ro.ase.cts.personal.medical.factory;

import ro.ase.cts.personal.Personal;
import ro.ase.cts.personal.factory.PersonalSpitalFactory;
import ro.ase.cts.personal.medical.clase.Asistent;
import ro.ase.cts.personal.medical.clase.Bracadier;
import ro.ase.cts.personal.medical.clase.Medic;

public class PersonalMedicalFactory implements PersonalSpitalFactory {
    private TipPersonalMedical tipPersonal;

    public PersonalMedicalFactory(TipPersonalMedical tipPersonal) {
        this.tipPersonal = tipPersonal;
    }

    public Personal createPersonal(String nume) {
        return switch (tipPersonal) {
            case Medic -> new Medic(nume);
            case Asistent -> new Asistent(nume);
            case Brancardier -> new Bracadier(nume);
            default -> throw new RuntimeException("Invalid type");
        };
    }
}
