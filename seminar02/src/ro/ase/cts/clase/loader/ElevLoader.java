package ro.ase.cts.clase.loader;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevLoader extends AplicantLoader {

    @Override
    public List<Aplicant> load(String path) throws FileNotFoundException {
        Scanner input = new Scanner(new File(path));
        input.useDelimiter(",|\n");

        List<Aplicant> elevi = new ArrayList<>();

        while (input.hasNext()) {
            Elev elev = new Elev();
            super.loadAplicantData(input, elev);
            elev.setClasa(input.nextInt());
            elev.setTutore(input.next());
            elevi.add(elev);
        }

        input.close();
        return elevi;
    }
}
