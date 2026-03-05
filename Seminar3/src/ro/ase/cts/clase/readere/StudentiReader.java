package ro.ase.cts.clase.readere;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

import java.io.File;
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
        Scanner input = new Scanner(new File(path));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student s = new Student();

            super.readAplicant(input, s);

            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();

            s.setFacultate(facultate);
            s.setAn_studii(an_studii);

            studenti.add(s);
        }
        input.close();
        return studenti;
    }
}
