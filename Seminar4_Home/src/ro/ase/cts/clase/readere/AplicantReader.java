package ro.ase.cts.clase.readere;

import ro.ase.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    protected String path;

    public AplicantReader(String path) {
        this.path = path;
    }

    protected Scanner createScanner(String delimiterRegex) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        scanner.useDelimiter(delimiterRegex);
        return scanner;
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    protected void readAplicant(Scanner input, Aplicant outAplicant) {
        String nume = input.next().trim();
        String prenume = input.next().trim();
        int varsta = Integer.valueOf(input.nextInt());
        int punctaj = Integer.valueOf(input.nextInt());
        int nr = Integer.valueOf(input.nextInt());

        String[] vect = new String[nr];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();

        outAplicant.setNume(nume);
        outAplicant.setPrenume(prenume);
        outAplicant.setVarsta(varsta);
        outAplicant.setPunctaj(punctaj);
        outAplicant.setNrProiecte(nr, vect);
    }
}
