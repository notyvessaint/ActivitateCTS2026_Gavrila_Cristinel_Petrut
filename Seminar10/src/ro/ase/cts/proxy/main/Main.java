package src.ro.ase.cts.proxy.main;

import src.ro.ase.cts.proxy.clase.*;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(1, 182);
        Autobuz autobuz2 = new Autobuz(0, 282, TipCursa.CURSA_SPECIALA);
        Statie statieRomana = new Statie("Romana", 10);
        Statie statieUniversitate = new Statie("Universitate", 0);
        AutobuzCursaSpeciala autobuzCursaSpeciala = new AutobuzCursaSpeciala(new AutobuzNoapte(autobuz2));
        AutobuzCursaSpeciala autobuzCursaSpeciala2 = new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzCursaSpeciala(new AutobuzNoapte(new AutobuzNoapte(new AutobuzCursaSpeciala(autobuz2)))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))));


        autobuz.opresteInStatie(statieRomana);
        autobuzCursaSpeciala.opresteInStatie(statieUniversitate);
        autobuzCursaSpeciala2.opresteInStatie(statieUniversitate);
    }
}