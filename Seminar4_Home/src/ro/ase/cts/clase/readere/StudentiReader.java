package ro.ase.cts.clase.readere;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader {
    public StudentiReader(String path) {
        super(path);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        List<Aplicant> studenti = new ArrayList<>();

        try (Scanner input = createScanner(",|\n")) {
            while (input.hasNext()) {
                Student s = new Student();
                super.readAplicant(input, s);

                int an_studii = input.nextInt();
                String facultate = input.next();

                s.setFacultate(facultate);
                s.setAnStudii(an_studii);

                studenti.add(s);
            }
        }

        return studenti;
    }
}
