package ro.ase.cts.main;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readere.AngajatiReader;
import ro.ase.cts.clase.readere.AplicantReader;
import ro.ase.cts.clase.readere.AplicantReaderFactory;
import ro.ase.cts.clase.readere.TipReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Angajat.setValoareFinantare(50);
        List<Aplicant> listaAngajati;

        try {
            AplicantReaderFactory factory = AplicantReaderFactory.getInstance();
            AplicantReader angajatiReader = factory.createReader(TipReader.readerAngajat, "angajati.txt");

            listaAngajati = angajatiReader.readAplicanti();
            for (Aplicant angajat : listaAngajati) {
                System.out.println(angajat.toString());
                angajat.afiseazaFinantare();
                angajat.afiseazaStatut();
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
