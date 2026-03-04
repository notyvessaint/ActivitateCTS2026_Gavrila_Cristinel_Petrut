package ro.ase.cts.clase.loader;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatLoader extends AplicantLoader {

    @Override
    public List<Aplicant> load(String path) throws FileNotFoundException {
        Scanner input = new Scanner(new File(path));
        input.useDelimiter(",");

        List<Aplicant> angajati = new ArrayList<>();

        while (input.hasNext()) {
            Angajat angajat = new Angajat();
            super.loadAplicantData(input, angajat);

            angajat.setSalariu(input.nextInt());
            angajat.setOcupatie(input.next());
            angajati.add(angajat);
        }

        input.close();
        return angajati;
    }
}
