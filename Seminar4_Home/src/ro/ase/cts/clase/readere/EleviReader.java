package ro.ase.cts.clase.readere;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends AplicantReader {
    public EleviReader(String path) {
        super(path);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        List<Aplicant> elevi = new ArrayList<>();

        try (Scanner input = createScanner(",|\n")) {
            while (input.hasNext()) {
                Elev e = new Elev();
                super.readAplicant(input, e);

                int clasa = input.nextInt();
                String tutore = input.next();

                e.setClasa(clasa);
                e.setTutore(tutore);

                elevi.add(e);
            }
        }

        return elevi;
    }
}
