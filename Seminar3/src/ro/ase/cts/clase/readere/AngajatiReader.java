package ro.ase.cts.clase.readere;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

import java.io.File;
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
        Scanner input2 = new Scanner(new File(path));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat a = new Angajat();

            super.readAplicant(input2, a);

            int salariu = input2.nextInt();
            String ocupatie = input2.next();

            a.setSalariu(salariu);
            a.setOcupatie(ocupatie);

            angajati.add(a);
        }
        input2.close();
        return angajati;
    }
}
