package ro.ase.cts.main;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.loader.AngajatLoader;
import ro.ase.cts.clase.loader.AplicantLoader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        AplicantLoader loader = new AngajatLoader();

        try {
            List<Aplicant> aplicanti = loader.load("seminar02/angajati.txt");
            for (Aplicant aplicant : aplicanti) {
                System.out.println(aplicant);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
