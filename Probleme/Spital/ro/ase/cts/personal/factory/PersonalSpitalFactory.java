package ro.ase.cts.personal.factory;

import ro.ase.cts.personal.Personal;
import ro.ase.cts.personal.medical.factory.TipPersonalMedical;
import ro.ase.cts.personal.nonmedical.factory.TipPersonalNonMedical;

public interface PersonalSpitalFactory {
    Personal createPersonal(String nume);
}
