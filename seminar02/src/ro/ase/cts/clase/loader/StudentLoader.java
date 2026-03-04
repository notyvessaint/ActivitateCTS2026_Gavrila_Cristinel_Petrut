package ro.ase.cts.clase.loader;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentLoader extends AplicantLoader {

    @Override
    public List<Aplicant> load(String path) throws FileNotFoundException {
        Scanner input = new Scanner(new File(path));
        input.useDelimiter(",|\n");

        List<Aplicant> studenti = new ArrayList<>();
        while (input.hasNext()) {
            Student student = new Student();
            super.loadAplicantData(input, student);
            student.setAnStudii(input.nextInt());
            student.setFacultate(input.next());
            studenti.add(student);
        }
        
        input.close();
        return studenti;
    }
}
