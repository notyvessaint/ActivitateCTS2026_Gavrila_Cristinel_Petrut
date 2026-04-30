package src.ro.ase.cts.flyweight.main;

import src.ro.ase.cts.flyweight.clase.Autobuz;
import src.ro.ase.cts.flyweight.clase.Linie;
import src.ro.ase.cts.flyweight.clase.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Metro", 2039, 10);
        Autobuz autobuz2 = new Autobuz("Metro Redux", 2035, 2);
        Autobuz autobuz3 = new Autobuz("Metro Exodus", 2036, 8);

        LinieFactory linieFactory = new LinieFactory();
        Linie linie101 = linieFactory.getLinie(101, "Romana", "Universitate");
        Linie linie182 = linieFactory.getLinie(182, "Romana", "Universitate");

        linie101.descriereLinie(autobuz);
        linie182.descriereLinie(autobuz2);
        linie101.descriereLinie(autobuz3);
    }
}
