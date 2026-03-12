package ro.ase.cts.clase.readere;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantReader {
    public AngajatiReader(String path) {
        super(path);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        List<Aplicant> angajati = new ArrayList<>();

        try (Scanner input = createScanner(",")) {
            while (input.hasNext()) {
                Angajat a = new Angajat();
                super.readAplicant(input, a);

                int salariu = input.nextInt();
                String ocupatie = input.next();

                a.setSalariu(salariu);
                a.setOcupatie(ocupatie);

                angajati.add(a);
            }
        }

        return angajati;
    }
}
