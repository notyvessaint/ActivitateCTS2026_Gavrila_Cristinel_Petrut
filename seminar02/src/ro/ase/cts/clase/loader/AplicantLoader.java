package ro.ase.cts.clase.loader;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantLoader {

    public abstract List<Aplicant> load(String file) throws FileNotFoundException;

    public void loadAplicantData(Scanner input, Aplicant aplicant) {
        aplicant.setNume(input.next().trim());
        aplicant.setPrenume(input.next().trim());
        aplicant.setVarsta(input.nextInt());
        aplicant.setPunctaj(input.nextInt());

        int nr = input.nextInt();
        String[] denumireProiect = new String[nr];

        for (int i = 0; i < nr; i++) {
            denumireProiect[i] = input.next();
        }

        aplicant.setNrProiecte(nr, denumireProiect);
    }
}