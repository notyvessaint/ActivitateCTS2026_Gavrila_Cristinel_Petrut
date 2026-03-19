package ro.ase.cts.main;

import ro.ase.cts.felmancare.desert.simple_factory.DesertFactory;
import ro.ase.cts.felmancare.desert.simple_factory.TipDesert;
import ro.ase.cts.felmancare.factory.FelMancare;
import ro.ase.cts.felmancare.supe.simple_factory.SupaFactory;
import ro.ase.cts.felmancare.supe.simple_factory.TipSupa;
import ro.ase.cts.rezervare.IRezervare;
import ro.ase.cts.rezervare.Rezervare;

public class Main {
    public static void main(String[] args) {
        DesertFactory desertFactory = new DesertFactory();
        SupaFactory supaFactory = new SupaFactory();

        FelMancare papanasi = desertFactory.createFelMancare(TipDesert.Papanasi, 300.0, 35.0, 300);
        FelMancare supaCiuperci = supaFactory.createFelMancare(TipSupa.Ciuperci, 200.0, 20.0);

        papanasi.afisare();
        supaCiuperci.afisare();

        Rezervare rezervare = new Rezervare("Ionel", "0777222333", 10, 20);
        Rezervare nouaRezervare = (Rezervare) rezervare.cloneaza();

        nouaRezervare.setZiRezervare(21);
        nouaRezervare.setOraRezervare(21);

        System.out.println(rezervare);
        System.out.println(nouaRezervare);

        // Respectare Dependency Inversion
        IRezervare rezervare2 = new Rezervare("Andrei", "0777333444", 10, 20);
        IRezervare nouaRezervare2 = rezervare2.cloneaza();

        ((Rezervare) nouaRezervare2).setZiRezervare(21);
        ((Rezervare) nouaRezervare2).setOraRezervare(21);

        System.out.println(rezervare2);
        System.out.println(nouaRezervare2);
    }
}
